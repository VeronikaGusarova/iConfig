Feature: Filter projects in recents list - smoke test.
  As a user I want to be able to create project,
  to apply filtering by project statuses,
  to apply searching by project
  to remove project

  Background:
    Given I open Login page
    And I fill Login and Password fields with correct credentials on Login page
    And I click button 'log in' on Login page

  @createProject @Smoke @SeverityLevel.NORMAL
  Scenario Outline: Create a new project, check its status and presence in Recents
    Given  Page with url "!/dashboard" should be opened
    When I select "Offshore Oil and Gas" "asset type" on Dashboard page
    And I select "oil dehydration" 'system' on Dashboard page
    And I select "Main Library" "library" on Dashboard page
    And I select "USA" "region" on Dashboard page
    And I select "Gulf of Mexico" "location" on Dashboard page
    And I set "AT project" 'project title' on Dashboard page
    And I set "AT project - description" as 'project description' on Dashboard page
    And I click 'create project' button
    Then Page with url "/questionnaire" should be opened

    When I click 'Save Project' button
    Then Modal window with title "Notification" and body text "Changes were saved." should appear

    When I close modal window by 'Ok' button
    And I navigate to Dashboard page by 'Home' icon
   #Then I see project with "AT project 1" name in 'my projects' list on Dashboard Page
    Then Project "<projectName>" is "in" list of projects with "allProjects" status on Dashboard Page
   # status value is taken from ProjectStatus enum and can be following:
   # allProjects,
   # completed,
   # inProgress
    And Status of project "<projectName>" is "In Progress" on Dashboard Page
    And Project "<projectName>" is "in" list of projects with "inProgress" status on Dashboard Page
    And Status of project "<projectName>" is "In Progress" on Dashboard Page
    And Project "<projectName>" is "not in" list of projects with "completed" status on Dashboard Page

    When I open project "<projectName>" on Dashboard page
    And I remove project on Breadcrambs panel
    Then Page with url "!/dashboard" should be opened
    And Project "<projectName>" is "not in" list of projects with "allProjects" status on Dashboard Page
    And Project "<projectName>" is "not in" list of projects with "inProgress" status on Dashboard Page
    And Project "<projectName>" is "not in" list of projects with "completed" status on Dashboard Page
    Examples:
      | projectName |
      | AT project  |

  # Scenario: Create a new project, complete it, check its status and presence in Recents
  # to be done


