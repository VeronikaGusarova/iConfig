package gui.stepsDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.aemo.qa.common.services.pages.TermsAndConditionsPageObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class TermsAndConditionsStepsDef extends AbstractStepsDef {
    @Autowired
    @Lazy
    TermsAndConditionsPageObject termsAndConditionsPage;

    /**
     * Open TermsAndConditions page by direct url
     *
     * @throws Throwable
     */
    @Given("^I open TermsAndConditions page$")
    public void iOpenTermsAndConditionsPage() throws Throwable {
        termsAndConditionsPage.open();
    }

    /**
     * Check that Terms And Conditions page is opened.
     * Verify host, path, text of title(text into  tag h1).
     */
    @Then("^Terms And Conditions page should be opened$")
    public void termsAndConditionsPageShouldBeOpened() throws Throwable {
        termsAndConditionsPage.isOpen();
    }
}