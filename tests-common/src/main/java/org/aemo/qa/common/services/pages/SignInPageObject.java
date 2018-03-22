/*
 */
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
public class SignInPageObject extends AbstractPageObject {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private static final String XPATH_SIGN_IN_FORM = "//*[@class='modal-dialog']";

    @FindBy(xpath = XPATH_SIGN_IN_FORM)
    private WebElement modalFormSignIn;

    @FindBy(xpath = XPATH_SIGN_IN_FORM + "//h3")
    private WebElement modalFormSignInHeader;

    @FindBy(xpath = XPATH_SIGN_IN_FORM + "//button[contains(@class,'close')]")
    private WebElement buttonCloseForm;

    @FindBy(xpath = XPATH_SIGN_IN_FORM + "//*[@id='login']")
    private WebElement inputLogin;

    @FindBy(xpath = XPATH_SIGN_IN_FORM + "//*[@id='login']/../small")
    private WebElement errorMessageLogin;

    @FindBy(xpath = XPATH_SIGN_IN_FORM + "//*[@id='password']")
    private WebElement inputPassword;

    @FindBy(xpath = XPATH_SIGN_IN_FORM + "//*[@id='password']/../small")
    private WebElement errorMessagePassword;

    @FindBy(xpath = XPATH_SIGN_IN_FORM + "//form[contains(@class, 'login-modal')]//button")
    private WebElement buttonSubmit;

    @FindBy(xpath = XPATH_SIGN_IN_FORM + "//a[contains(text(),'Forgotten password')]")
    private WebElement linkForgottenPassword;

    /**
     * Set login in SingIn form
     *
     * @param login
     */
    public void setLogin(String login) {
        log.info("Set login as {} in SingIn form", login);
        webdriverHelper.sendKeys(inputLogin, login);
        attachments.attachScreenShot("After filling field Login");
    }

    /**
     * Set password in SingIn form
     *
     * @param password
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
     * Get error message of field Login
     *
     * @return error text
     */
    public String getErrorMessageLogin() {
        return webdriverHelper.getText(errorMessageLogin);
    }

    /**
     * Get error message of field Password
     *
     * @return error text
     */
    public String getErrorMessagePassword() {
        return webdriverHelper.getText(errorMessagePassword);
    }

    /**
     * Click link 'Forgotten Password'
     */
    public void clickForgottenPassword() {
        log.info("Click link 'Forgotten Password'");
        webdriverHelper.click(linkForgottenPassword);
        attachments.attachScreenShot("After clicking link 'Forgotten Password'");
    }

}