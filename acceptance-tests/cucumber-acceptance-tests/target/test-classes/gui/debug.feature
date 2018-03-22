Feature: Filtering projects in recents list - smoke test.
  As a user I want to be able to filter projects by name on Dashboard page,
  and filter them by status

  Background:
    Given I open Login page
    And I fill Login and Password fields with correct credentials on Login page
    And I click button 'log in' on Login page

  @Smoke @SeverityLevel.CRITICAL
  Scenario: Check project with In Progress status
    Given Page with url "!/dashboard" should be opened
#    When I create a project with default parameters and title


