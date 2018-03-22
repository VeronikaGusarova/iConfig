package org.aemo.qa.common.services.pages;

import org.aemo.qa.common.annotations.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

@PageObject
public class LoginPageObject extends AbstractPageObject {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Value("${iconfig.username}")
    private String userName;

    @Value("${iconfig.password}")
    private String password;

    @FindBy(name = "login")
    private WebElement inputLogin;

    @FindBy(name = "password")
    private WebElement inputPassword;

    @FindBy(className = "login-button")
    private WebElement buttonSubmit;

    @FindBy(className = "error-message")
    private WebElement labelError;

    @FindBy(className = "forgot-password")
    private WebElement linkForgotPassword;

    /**
     * Open Login page
     */
    public void open() {
        log.info("Open login page");
        driver.get(siteUrl);
    }

    /**
     * Set login in SingIn form
     *
     * @param login - login
     */
    public void setLogin(String login) {
        log.info("Set login as {} in SingIn form", login);
        webdriverHelper.sendKeys(inputLogin, login);
        attachments.attachScreenShot("After filling field Login");
    }

    /**
     * Set password in SingIn form
     *
     * @param password - password
     */
    public void setPassword(String password) {
        log.info("Set password as {} in SingIn form ", password);
        webdriverHelper.sendKeys(inputPassword, password);
        attachments.attachScreenShot("After filling field Password");
    }

    /**
     * Submit SignIn form
     */
    public void submit() {
        log.info("Submit SignIn form");
        webdriverHelper.click(buttonSubmit);
        attachments.attachScreenShot("After submitting SignIn form");
    }

    /**
     * Set correct login and password from config file in SingIn form
     */
    public void loginWithCorrectCreds() {
        log.info("Set login as {} in SingIn form", userName, password);
        webdriverHelper.sendKeys(inputLogin, userName);
        webdriverHelper.sendKeys(inputPassword, password);
        attachments.attachScreenShot("After submitting SignIn form with correct creds");
    }

    /**
     * Set fake login and password in SingIn form for error checking
     */
    public void loginWithFakeCreds() {
        String fakeUserName = "fake";
        String fakePassword = "fake";
        log.info("Set login as {} in SingIn form", fakeUserName, fakePassword);
        webdriverHelper.sendKeys(inputLogin, fakeUserName);
        webdriverHelper.sendKeys(inputPassword, fakePassword);
        attachments.attachScreenShot("After submitting SignIn form with fake creds");
    }

    /**
     * Check that error label is displayed
     * @return true - if exists and displayed, false  - if not
     */
    public boolean isErrorLabelDisplayed() {
        By locator = By.className("error-message");
        return webdriverHelper.isElementPresent(locator) && webdriverHelper.isElementDisplayed(locator);
    }

    /**
     * @return text in error label
     */
    public String getLabelErrorText() {
        return webdriverHelper.getText(labelError);
    }
}
