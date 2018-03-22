package gui.stepsDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPageStepsDef extends AbstractStepsDef {


    @Given("^I open Login page$")
    public void iOpenLoginPage() {
        loginPage.open();
    }

    @When("^I fill Login and Password fields with correct credentials on Login page$")
    public void iFillLoginAndPasswordFieldsWithCorrectCredentialsOnLoginPage(){
        loginPage.loginWithCorrectCreds();
    }

    @And("^I click button 'log in' on Login page$")
    public void iClickButtonLogInOnLoginPage() {
        loginPage.submit();
    }

    @When("^I fill Login and Password fields with fake credentials on Login page$")
    public void iFillLoginAndPasswordFieldsWithFakeCredentialsOnLoginPage() throws Throwable {
        loginPage.loginWithFakeCreds();
    }

    @Then("^Modal window with title \"([^\"]*)\" and body text \"([^\"]*)\" should appear$")
    public void modalWindowWithTitleAndBodyTextShouldAppear(String title, String bodyText) throws Throwable {
        assertThat(modalWindow.isModalWindowOpened());
        assertThat(modalWindow.getModalWindowTitleText())
                .as("check window title")
                .isEqualTo(title);
        assertThat(modalWindow.getModalWindowBodyText())
                .as("check window body text")
                .isEqualTo(bodyText);
    }

    @When("^I close modal window by 'Ok' button$")
    public void iCloseModalWindowByOkButton() throws Throwable {
        modalWindow.closeModalWindowByOk();
    }

    @Then("^Label \"([^\"]*)\" should appear on Login Page$")
    public void labelShouldAppearOnLoginPage(String labelText) throws Throwable {
        assertThat(loginPage.isErrorLabelDisplayed());
        assertThat(loginPage.getLabelErrorText())
                .as("error label text is")
                .isEqualTo(labelText);
    }

}
