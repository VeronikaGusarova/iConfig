package gui.stepsDef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.aemo.qa.common.services.enums.ProjectStatus;
import org.aemo.qa.common.services.helpers.Helper;
import org.springframework.util.Assert;

import java.util.Arrays;

import static org.aemo.qa.common.services.helpers.Helper.convertParameterToBoolean;
import static org.assertj.core.api.Assertions.assertThat;

public class DashboardPageStepsDef extends AbstractStepsDef {

    @And("^I select \"([^\"]*)\" 'system' on Dashboard page$")
    public void iSelectSystemOnDashboardPage(String systemValue) throws Throwable {
        dashboardPage.setSystemButton(systemValue);
    }

    @And("^I set \"([^\"]*)\" 'project title' on Dashboard page$")
    public void iSetProjectTitleOnDashboardPage(String title) throws Throwable {
        projectId = Helper.generateId();
        dashboardPage.setProjectTitle(title + projectId);
    }

    @And("^I set \"([^\"]*)\" as 'project description' on Dashboard page$")
    public void iSetAsProjectDescriptionOnDashboardPage(String description) throws Throwable {
        dashboardPage.setProjectDescription(description);
    }

    @And("^I click 'create project' button$")
    public void iClickCreateProjectButton() throws Throwable {
        dashboardPage.clickCreateProjectButton();
        webdriverHelper.waitForPageUpdated();
    }

    @When("^I click 'Save Project' button$")
    public void iClickSaveProjectButton() throws Throwable {
        createProjectPage.saveProject();
    }

    @Then("^I see project with \"([^\"]*)\" name in 'my projects' list on Dashboard Page$")
    public void iSeeProjectWithNameInMyProjectsList(String projectName) throws Throwable {
        Assert.isTrue(dashboardPage.isProjectInRecents(projectName + projectId, ProjectStatus.allProjects), "Unable to find project ${projectName} in list of recents");
    }

    @When("^I select \"([^\"]*)\" \"([^\"]*)\" on Dashboard page$")
    public void iSelectOnDashboardPage(String value, String parameter) throws Throwable {
        dashboardPage.setValueInSelector(parameter, value);
    }
//  @And("^Project \"([^\"]*)\" is \"([^\"]*)\" list of projects with \"([^\"]*)\" status on Dashboard Page$")
    @And("^Project \"([^\"]*)\" is \"((not )?in)\" list of projects with \"([^\"]*)\" status on Dashboard Page$")
    public void projectIsInListOfProjectsWithStatusOnDashboardPage(String projectName, String isIn, Object ignored, ProjectStatus status) throws Throwable {
        if(convertParameterToBoolean(isIn))
            Assert.isTrue(dashboardPage.isProjectInRecents(projectName + projectId, status), "Unable to find project ${projectName} in list '${status.toString()}'");
        else
            Assert.isTrue(!dashboardPage.isProjectInRecents(projectName + projectId, status), "Unable to find project ${projectName} in list '${status.toString()}'");
    }

    @Then("^Status of project \"([^\"]*)\" is \"([^\"]*)\" on Dashboard Page$")
    public void statusOfProjectIsInListOfRecentsOnDashboardPage(String projectName, String status) throws Throwable {
        assertThat(dashboardPage.getProjectStatus(projectName + projectId))
                .as("check project status is ")
                .isEqualTo(status);
    }

    @And("^Field[s]? \"([^\"]*)\" (is|are) \"([^\"]*)\"$")
    public void fieldSIs(String controlsString, String ignored, String statusAvailability) throws Throwable {
        String[] controlsList = Arrays.stream(controlsString.split(","))
                .map(String::trim).toArray(String[]::new);
        for (String control:controlsList) {
            assertThat(dashboardPage.isInputFieldAvailable(control))
                    .as("Check that "+control+" field is "+statusAvailability)
                    .isEqualTo(convertParameterToBoolean(statusAvailability));
        }
    }

    @Then("^Selector[s]? \"([^\"]*)\" (is|are) \"([^\"]*)\"$")
    public void selectorsAre(String controlsString, String ignored, String statusAvailability) throws Throwable {
        String[] controlsList = Arrays.stream(controlsString.split(","))
                .map(String::trim).toArray(String[]::new);
        for (String control:controlsList) {
            assertThat(dashboardPage.isSelectorAvailable(control))
                    .as("Check that "+control+" field is "+statusAvailability)
                    .isEqualTo(convertParameterToBoolean(statusAvailability));
        }

    }

    @And("^Button[s]? \"([^\"]*)\" (is|are) \"([^\"]*)\"$")
    public void buttonsAre(String controlsString, String ignored, String statusAvailability) throws Throwable {
//       String[] controlsList = Arrays.stream(controlsString.split(","))
//                .map(String::trim).toArray(String[]::new);
//        for (String control:controlsList) {
//            assertThat(dashboardPage.areSystemButtonsAvailable(control))
//                    .as("Check that "+control+" field is "+statusAvailability)
//                    .isEqualTo(convertParameterToBoolean(statusAvailability));
        }
   // }

    @And("^System buttons are \"([^\"]*)\"$")
    public void systemButtonsAre(String statusAvailability) throws Throwable {
        assertThat(dashboardPage.areSystemButtonsAvailable())
                    .as("Check that system buttons " + statusAvailability)
                    .isEqualTo(convertParameterToBoolean(statusAvailability));
    }

    @When("^I open project \"([^\"]*)\" on Dashboard page$")
    public void iOpenProjectOnDashboardPage(String projectName) throws Throwable {
        dashboardPage.openProjectByName(projectName+projectId);
    }

    @When("^I create project with name \"([^\"]*)\" and default parameters on Dashboard Page$")
    public void iCreateProjectWithNameAndDefaultParametersOnDashboardPage(String projectName) throws Throwable {
        //project = new ProjectObject(projectName);

    }
}
