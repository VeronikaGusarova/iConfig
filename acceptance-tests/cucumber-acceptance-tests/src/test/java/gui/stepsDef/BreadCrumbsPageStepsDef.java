package gui.stepsDef;

import cucumber.api.java.en.And;

public class BreadCrumbsPageStepsDef extends AbstractStepsDef {

    @And("^I navigate to Dashboard page by 'Home' icon$")
    public void iNavigateToDashboardPageByHomeIcon() throws Throwable {
        breadCrumbsPage.clickHomeButton();
        webdriverHelper.waitForPageUpdated();
    }

    @And("^I remove project on Breadcrambs panel$")
    public void iRemoveProjectOnBreadcrambsPanel() throws Throwable {
        breadCrumbsPage.deleteProject();
        modalWindow.closeModalWindowByOk();
        modalWindow.closeModalWindowByOk();
    }
}
