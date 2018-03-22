package gui.stepsDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.aemo.qa.common.services.pages.PrivacyPolicyPageObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

public class PrivacyPolicyStepsDef extends AbstractStepsDef {
    @Autowired
    @Lazy
    PrivacyPolicyPageObject privacyPolicyPage;

    /**
     * Open PrivacyPolicy page by direct url
     *
     * @throws Throwable
     */
    @Given("^I open PrivacyPolicy page$")
    public void iOpenPrivacyPolicyPage() throws Throwable {
        privacyPolicyPage.open();
    }

    /**
     * Check that Privacy Policy page is opened.
     * Verify host, path, text of title(text into  tag h1).
     */
    @Then("^Privacy Policy page should be opened$")
    public void privacyPolicyPageShouldBeOpened() throws Throwable {
        privacyPolicyPage.isOpen();
    }
}