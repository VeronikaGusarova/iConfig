package org.aemo.qa.common.services.pages;

import org.aemo.qa.common.annotations.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@PageObject
public class BreadCrumbsPageObject extends AbstractPageObject{
    @FindBy(className = "page-title")
    private WebElement labelPageTitle;

    @FindBy(className = "fa-home")
    private WebElement buttonHome;

    @FindBy(className = "delete")
    private WebElement buttonDelete;

    public void clickHomeButton() {
        webdriverHelper.click(buttonHome);
    }

    public void deleteProject() {
        webdriverHelper.click(buttonDelete);
    }
}
