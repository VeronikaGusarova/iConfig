/*
 */
package org.aemo.qa.common.services.pages;

import org.aemo.qa.common.annotations.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;
import java.net.URISyntaxException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Anton_Shapin.
 */

@PageObject
public class CreateAccountPageObject extends AbstractPageObject {
    private static final String PAGE_URL = "/create-account";
    private static final String PAGE_NAME = "Account Creation page";
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private static final String XPATH_BUTTON_SUBMIT_FORM = ".//*[@class='create-account-form']//button";
    private static final String XPATH_ERROR_MESSAGE_AUTHORIZED_SIGNATORY = ".//*[@id='name']/../small";

    @FindBy(xpath = ".//*[@id='email']")
    private WebElement inputEmail;

    @FindBy(xpath = ".//*[@id='company']")
    private WebElement inputLegalName;

    @FindBy(xpath = ".//*[@id='name']")
    private WebElement inputAuthorizedSignatory;

    @FindBy(xpath = XPATH_ERROR_MESSAGE_AUTHORIZED_SIGNATORY)
    private WebElement errorMessageAuthorizedSignatory;

    @FindBy(xpath = ".//*[@id='phone']")
    private WebElement inputMobilePhone;

    @FindBy(xpath = ".//*[@id='phone']/../span")
    private WebElement prefixMobilePhone;

    @FindBy(xpath = XPATH_BUTTON_SUBMIT_FORM)
    private WebElement buttonSubmitForm;

    @FindBy(xpath = "//*[contains(@class,'agreements-info')]//a[contains(text(),'Terms & Conditions')]")
    private WebElement linkTermsConditions;

    @FindBy(xpath = "//*[contains(@class,'agreements-info')]//a[contains(text(),'Privacy Policy')]")
    private WebElement linkPrivacyPolicy;


    /**
     * Open CreateAccount page by direct URL
     */
    public void open() {
        log.info("Open Create Account page");
        driver.get(siteUrl + PAGE_URL);
    }

    /**
     * Set email in registration form
     *
     * @param email
     */
    public void setEmail(String email) {
        log.info("Set email as {} in registration form", email);
        webdriverHelper.sendKeys(inputEmail, email);
        attachments.attachScreenShot("After filling field Email");
    }

    /**
     * Set Legal Name in registration form
     *
     * @param legalName
     */
    public void setLegalName(String legalName) {
        log.info("Set Legal Name as {} in registration form", legalName);
        webdriverHelper.sendKeys(inputLegalName, legalName);
        attachments.attachScreenShot("After filling field Legal Name");
    }

    /**
     * Set Authorized Signatory in registration form
     *
     * @param authorizedSignatory
     */
    public void setAuthorizedSignatory(String authorizedSignatory) {
        log.info("Set Authorized Signatory as {} in registration form", authorizedSignatory);
        webdriverHelper.sendKeys(inputAuthorizedSignatory, authorizedSignatory);
        attachments.attachPageText("Value of field", authorizedSignatory);
        attachments.attachScreenShot("After filling field Authorized Signatory");
    }

    /**
     * Set Mobile Phone Number in registration form
     *
     * @param mobilePhone
     */
    public void setMobilePhone(String mobilePhone) {
        log.info("Set Mobile Phone Number as {} in registration form", mobilePhone);
        webdriverHelper.sendKeys(inputMobilePhone, mobilePhone);
        attachments.attachScreenShot("After filling field Phone Number");
    }

    /**
     * Submit registration form
     */
    public void submitRegistrationForm() {
        log.info("Submit Registration form");
        webdriverHelper.click(buttonSubmitForm);
        attachments.attachScreenShot("After submitting Create Account form");
    }

    /**
     * Check that Account Creation page is opened
     */
    public void isOpen() throws URISyntaxException {
        attachments.attachScreenShot(PAGE_NAME);
        assertThat(new URI(driver.getCurrentUrl())).hasHost(siteHost)
                .hasPath(PAGE_URL);
    }

    /**
     * Get placeHolder Of LegalName
     *
     * @return placeHolder
     */
    public String getPlaceHolderOfLegalName() {
        return inputLegalName.getAttribute("placeholder");
    }

    /**
     * Get placeHolder Of AuthorizedSignatory
     *
     * @return placeHolder
     */
    public String getPlaceHolderOfAuthorizedSignatory() {
        return inputAuthorizedSignatory.getAttribute("placeholder");
    }

    /**
     * Get placeHolder Of Email
     *
     * @return placeHolder
     */
    public String getPlaceHolderOfEmail() {
        return inputEmail.getAttribute("placeholder");
    }

    /**
     * Get placeHolder/default value Of MobilePhone.
     *
     * @return placeHolder
     */
    public String getPlaceHolderOfMobilePhone() {
        return prefixMobilePhone.getText()
                + inputMobilePhone.getAttribute("placeholder");
    }

    /**
     * Check that button "SignUp" is present
     *
     * @return true if present, false if does not present
     */
    public boolean isButtonSignUpPresent() {
        return webdriverHelper.isElementPresent(By.xpath(XPATH_BUTTON_SUBMIT_FORM));
    }

    /**
     * Open page Terms And Conditions by clicking link
     */
    public void clickTermsConditions() {
        webdriverHelper.click(linkTermsConditions);
    }

    /**
     * Open page Privacy Policy by clicking link
     */
    public void clickPrivacyPolicy() {
        webdriverHelper.click(linkPrivacyPolicy);
    }

    /**
     * Get error message of field Authorized Signatory
     *
     * @return error text
     */
    public String getErrorMessageAuthorizedSignatory() {
        return webdriverHelper.getText(errorMessageAuthorizedSignatory);
    }

    /**
     * Check that error message of field Authorized Signatory exist
     *
     * @return
     */
    public boolean isErrorMessageAuthorizedSignatory() {
        return webdriverHelper.isElementPresent(By.xpath(XPATH_ERROR_MESSAGE_AUTHORIZED_SIGNATORY));
    }
}