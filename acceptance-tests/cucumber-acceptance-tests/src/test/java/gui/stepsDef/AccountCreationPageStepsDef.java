package gui.stepsDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountCreationPageStepsDef extends AbstractStepsDef {

    /**
     * Open Account Creation page by direct url
     *
     * @throws Throwable
     */
    @Given("^I open Account Creation page$")
    public void iOpenPrivacyPolicyPage() throws Throwable {
        createAccountPage.open();
    }

    /**
     * Check that Account Creation page is opened
     *
     * @throws Throwable
     */
    @Then("^Account Creation page should be open$")
    public void accountCreationPageShouldBeOpen() throws Throwable {
        createAccountPage.isOpen();
    }

    /**
     * Check placeHolder of the field 'Legal name'
     *
     * @param expectedPlaceHolder - expected text of placeHolder
     *
     * @throws Throwable
     */
    @Then("^Placeholder of the field 'Legal name' should be \"([^\"]*)\" on the Account Creation page$")
    public void placeholderOfTheFieldLegalNameShouldBeOnTheAccountCreationPage(String expectedPlaceHolder) throws Throwable {
        assertThat(createAccountPage.getPlaceHolderOfLegalName())
                .as("Check placeholder of field 'Legal name'")
                .isEqualToIgnoringCase(expectedPlaceHolder);
    }

    /**
     * Check placeHolder of the field 'Authorized signatory'
     *
     * @param expectedPlaceHolder - expected text of placeHolder
     *
     * @throws Throwable
     */
    @And("^Placeholder of the field 'Authorized signatory' should be \"([^\"]*)\" on the Account Creation page$")
    public void placeholderOfTheFieldAuthorizedSignatoryShouldBeOnTheAccountCreationPage(String expectedPlaceHolder) throws Throwable {
        assertThat(createAccountPage.getPlaceHolderOfAuthorizedSignatory())
                .as("Check placeholder of field 'Authorized signatory'")
                .isEqualToIgnoringCase(expectedPlaceHolder);
    }

    /**
     * Check placeHolder of the field 'Email'
     *
     * @param expectedPlaceHolder - expected text of placeHolder
     *
     * @throws Throwable
     */
    @And("^Placeholder of the field 'Email' should be \"([^\"]*)\" on the Account Creation page$")
    public void placeholderOfTheFieldEmailShouldBeOnTheAccountCreationPage(String expectedPlaceHolder) throws Throwable {
        assertThat(createAccountPage.getPlaceHolderOfEmail())
                .as("Check placeholder of field 'Email'")
                .isEqualToIgnoringCase(expectedPlaceHolder);
    }

    /**
     * Check placeHolder of the field 'Mobile phone'
     *
     * @param expectedPlaceHolder - expected text of placeHolder
     *
     * @throws Throwable
     */
    @And("^Placeholder of the field 'Mobile phone' should be \"([^\"]*)\" on the Account Creation page$")
    public void placeholderOfTheFieldMobilePhoneShouldBeOnTheAccountCreationPage(String expectedPlaceHolder) throws Throwable {
        assertThat(createAccountPage.getPlaceHolderOfMobilePhone())
                .as("Check placeholder of field 'Mobile phone'")
                .isEqualToIgnoringWhitespace(expectedPlaceHolder);
    }

    /**
     * Check that button 'Sign Up' exist on the page
     *
     * @throws Throwable
     */
    @And("^Button 'Sign Up' should be present on the Account Creation page$")
    public void buttonSignUpShouldBePresentOnTheAccountCreationPage() throws Throwable {
        assertThat(createAccountPage.isButtonSignUpPresent())
                .as("Button 'Sign Up' should be present")
                .isTrue();
    }

    /**
     * Open page Privacy Policy by clicking link with the text 'Privacy Policy' in the footer on the Account Creation page
     */
    @When("^I click link 'Privacy Policy' on the Account Creation page$")
    public void iClickLinkPrivacyPolicyOnTheAccountCreationPage() throws Throwable {
        createAccountPage.clickPrivacyPolicy();
    }

    /**
     * Open page 'Terms & Conditions' by clicking link with text 'Terms & Conditions' in the footer on the Account Creation page
     *
     * @throws Throwable
     */
    @When("^I click link 'Terms & Conditions' on the Account Creation page$")
    public void iClickLinkTermsConditionsOnTheAccountCreationPage() throws Throwable {
        createAccountPage.clickTermsConditions();
    }

    /**
     * Set value of the field 'Authorized signatory'
     *
     * @param value
     *
     * @throws Throwable
     */
    @And("^I fill the 'Authorized signatory' field as \"([^\"]*)\" on the Account Creation page$")
    public void iFillAuthorizedSignatoryFieldAsOnTheAccountCreationPage(String value) throws Throwable {
        createAccountPage.setAuthorizedSignatory(value);
    }

    /**
     * Check error message of the field 'Authorized signatory'
     *
     * @param expectedMessage - expected error message
     *
     * @throws Throwable
     */
    @Then("^Error message of field 'Authorized signatory' should be \"([^\"]*)\" on the Account Creation page$")
    public void errorMessageOfFieldAuthorizedSignatoryShouldBe(String expectedMessage) throws Throwable {
        assertThat(createAccountPage.getErrorMessageAuthorizedSignatory())
                .as("Check error message of field 'Authorized signatory'")
                .isEqualToIgnoringCase(expectedMessage);
    }

    /**
     * Check that error message of the field 'Authorized signatory' should not exist
     *
     * @throws Throwable
     */
    @Then("^Error message of field 'Authorized signatory' should not exist on the Account Creation page")
    public void errorMessageOfFieldAuthorizedSignatoryShouldNotExist() throws Throwable {
        assertThat(createAccountPage.isErrorMessageAuthorizedSignatory())
                .as("Check that error message of field 'Authorized signatory' does not exist")
                .isFalse();
    }

    /**
     * Set value of the field 'Authorized signatory'. Value is generated automatically(text will contain one space).
     *
     * @param count - length of text
     *
     * @throws Throwable
     */
    @And("^I fill the 'Authorized signatory' field with a message of (\\d+) characters long on the Account Creation page$")
    public void iFillTheAuthorizedSignatoryFieldWithAMessageOfCharactersLongOnTheAccountCreationPage(int count) throws Throwable {
        String value = textGenerator.getTextWithSpace(count);
        createAccountPage.setAuthorizedSignatory(value);
    }
}