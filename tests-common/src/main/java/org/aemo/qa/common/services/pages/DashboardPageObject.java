package org.aemo.qa.common.services.pages;

import org.aemo.qa.common.annotations.PageObject;
import org.aemo.qa.common.services.enums.ProjectStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.OperationNotSupportedException;
import java.util.List;
import java.util.stream.Collectors;

@PageObject
public class DashboardPageObject extends AbstractPageObject {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @FindBy(className = "logout-button")
    private WebElement buttonLogout;

    @FindBy(className = "system-icons")
    private WebElement containerSystemButtons;

    @FindBy(className = "new-project__title-input")
    private WebElement inputProjectTitle;

    @FindBy(className = "new-project__description-input")
    private WebElement inputProjectDescription;

    @FindBy(className = "new-project__create-button")
    private WebElement buttonCreateProject;

    public void logout()
    {
        if(!driver.getCurrentUrl().endsWith("login"))
        {
            webdriverHelper.click(buttonLogout);
            webdriverHelper.click(driver.findElement(By.cssSelector(".logout-menu li")));
        }
    }

    public void setValueInSelector(String parameter, String value) {
        webdriverHelper.click(getSelectorByName(parameter));
        webdriverHelper.click(driver.findElement(By.xpath("//ul[@class = 'dropdown-menu']//a[text()='" + value + "']")));
    }

    public WebElement getSelectorByName(String parameter) {
        //
        return driver.findElement(By.xpath("//dropdown[@title='select " + parameter + "']//button"));
    }

    public void setProjectTitle(String title) {
        webdriverHelper.sendKeys(inputProjectTitle, title);
    }

    public void setProjectDescription(String description) {
        webdriverHelper.sendKeys(inputProjectDescription, description);
    }

    public void clickCreateProjectButton() {
        webdriverHelper.click(buttonCreateProject);
    }

    public void filterProjectsByStatus(ProjectStatus status){
        String locator = "";
        switch (status)
        {
            case allProjects:
            {
                locator = "all-projects";
                break;
            }
            case inProgress:
            {
                locator = "in-progress";
                break;
            }
            case completed:
            {
                locator = "completed";
                break;
            }
            default: throw new UnsupportedOperationException("Status '{$status}' has not been implemented");
        }
        webdriverHelper.click(driver.findElement(By.cssSelector("label.filter[for='"+locator+"']")));
    }

    public Boolean isProjectInRecents(String projectName, ProjectStatus status) {
        filterProjectsByStatus(status);
        return getProjectsFromRecents(projectName).size() > 0;
    }

    private List<WebElement> getProjectsFromRecents(String projectName) {
        return driver.findElements(By.xpath("//ul[@class='projects-list']/li"))
                .stream().filter(item -> item.findElement(By.className("project-name"))
                        .getText().equals(projectName))
                .collect(Collectors.toList());
    }

//    private WebElement getProjectFromRecentsEndsWith(String endsWith) {
//        List<WebElement> projects = driver.findElements(By.xpath("//ul[@class='projects-list']/li//span[contains(@class, 'project-name') and text()='"+projectName+"']"))
//                .stream().filter(item -> item.findElement(By.className("project-name"))
//                        .getText().endsWith(endsWith))
//                .collect(Collectors.toList());
//        if(projects.size() !=1)
//            throw new UnsupportedOperationException("Expected 1 project ends with '"+ endsWith + "' string. But found: "+projects.size());
//        //return first (and the only)
//        return projects.stream().findFirst().get();
//    }


    public String getProjectStatus(String projectName) {
        return getProjectsFromRecents(projectName).stream()
                .findFirst().get()
                .findElement(By.className("project-status")).getText();
    }

    public boolean isSelectorAvailable(String control) {
        return getSelectorByName(control).isEnabled();
//        return !(webdriverHelper.isAttributePresent(getSelectorByName(control), "disabled")
//                && getSelectorByName(control).getAttribute("disabled").contains("disabled"));
    }

    public boolean isInputFieldAvailable(String control) throws OperationNotSupportedException {
            if(control.matches("^([pP]roject )?[tT]itle"))
                return inputProjectTitle.isEnabled();
                //return webdriverHelper.isAttributePresent(inputProjectTitle, "disabled");
            else if(control.matches("^([pP]roject )?[dD]escription"))
                //return webdriverHelper.isAttributePresent(inputProjectTitle, "disabled");
                return inputProjectDescription.isEnabled();
            else
                throw new OperationNotSupportedException("Input field ${control} is not recognized");

        }

    public void setSystemButton(String systemName) throws Exception {
        webdriverHelper.click(getSystemButton(systemName));
        if(!isSystemButtonSelected(systemName))
            throw new Exception("Button '"+systemName+"' has not been selected");
    }

    private WebElement getSystemButton(String systemName){
        return driver.findElement(By.xpath("//div[contains(@ng-repeat, 'system')]/span[text()='" + systemName.toLowerCase() + "']/.."));
    }

    public Boolean isSystemButtonSelected(String systemValue)
    {
        return driver.findElement(By.xpath("//div[contains(@ng-repeat, 'system')]/span[text()='" + systemValue.toLowerCase() + "']/.."))
                .getAttribute("class")
                .contains("selected");
    }

    public boolean areSystemButtonsAvailable() {
        return !containerSystemButtons.getAttribute("class").contains("disabled");
    }

    public void openProjectByName(String projectName) {
        filterProjectsByStatus(ProjectStatus.allProjects);
        WebElement project = getProjectsFromRecents(projectName).stream().findFirst().get();
        webdriverHelper.scrollToWebElement(project);
        webdriverHelper.click(project.findElement(By.className("project-name")));
    }
}

