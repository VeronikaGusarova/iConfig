package org.aemo.qa.common.services.pages;

import org.aemo.qa.common.annotations.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PageObject
public class CreateNewProjectPageObject extends AbstractPageObject {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @FindBy(className = "save")
    private WebElement buttonSaveProject;


    public void saveProject() {
        webdriverHelper.click(buttonSaveProject);
    }
}
