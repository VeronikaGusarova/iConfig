
package gui.stepsDef;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonStepsDef extends AbstractStepsDef {
    /**
     * Open home page by direct url
     *
     * @throws Throwable
     */
    @Given("^I open home page$")
    public void iOpenHomePage() throws Throwable {
        //homePage.open();
    }

    /**
     * Lose focus from Element
     *
     * @throws Throwable
     */
    @And("^I lose focus$")
    public void iLoseFocus() throws Throwable {
        webdriverHelper.loseFocus();
    }

    @After
    public void logout()
    {
        dashboardPage.logout();
    }

    @Then("^Page with url \"([^\"]*)\" should be opened$")
    public void pageShouldBeOpened(String pageUrl) throws Throwable {
        page.isOpened(pageUrl);
    }

//    @After("@createProject")
//    public void removeProject() throws Throwable{
//        if(!page.isOpened("!/dashboard"))
//            page.clickHomeButton();
//        dashboardPage.openProjectByName(projectId);
//        designParametersPage.deleteProject();
//        modalWindow.closeModalWindowByOk();
//    }
}
