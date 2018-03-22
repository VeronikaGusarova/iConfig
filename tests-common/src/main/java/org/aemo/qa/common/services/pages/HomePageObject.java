package org.aemo.qa.common.services.pages;

import org.aemo.qa.common.annotations.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Anton_Shapin.
 */
@PageObject
public class HomePageObject extends AbstractPageObject {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @FindBy(xpath = ".//*[contains(text()='Sign In']")
    private WebElement linkSignIn;

    @FindBy(xpath = ".//*[contains(text(),'Start taking payments')]")
    private WebElement linkCreateAccount;

    public void open() {
        log.info("Open main page");
        driver.get(siteUrl);

    }

    /**
     * Open Sing In form
     */
    public void openSingInForm() {
        webdriverHelper.click(linkSignIn);
        attachments.attachScreenShot("Open Sing In form");
    }

    /**
     * Open Registration form
     */
    public void openCreateAccountForm() {
        webdriverHelper.click(linkCreateAccount);
        attachments.attachScreenShot("CreateAccountForm");
    }
}
