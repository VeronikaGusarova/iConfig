Feature: Dashboard Page, fields availability - smoke test.
  As a user I want to be able to ensure that respective fields are unavailable while some previous are empty

  Background:
    Given I open Login page
    And I fill Login and Password fields with correct credentials on Login page
    And I click button 'log in' on Login page

  @Smoke @SeverityLevel.CRITICAL @UserStoryId("CHEVFAC-778")
  Scenario: Check availability of inputs when creating a new project on Dashboard page
    Given Page with url "!/dashboard" should be opened
    # following availability statuses can be used:
    # enabled
    # disabled
    Then Selector "asset type" is "enabled"
    And Selectors "library, region, location" are "disabled"
    And Fields "title, description" are "disabled"
    And System buttons are "disabled"

    When I select "Offshore Oil and Gas" "asset type" on Dashboard page
    Then Selector "asset type" is "enabled"
    And Selectors "library, region, location" are "disabled"
    And System buttons are "enabled"
    And Fields "title, description" are "disabled"

    When I select "oil dehydration" 'system' on Dashboard page
    Then Selectors "asset type, library" are "enabled"
    And Selectors "region, location" are "disabled"
    And System buttons are "enabled"
    And Fields "title, description" are "disabled"

    When I select "Main Library" "library" on Dashboard page
    Then Selectors "asset type, library, region" are "enabled"
    And Selector "location" is "disabled"
    And System buttons are "enabled"
    And Fields "title, description" are "disabled"

    When I select "USA" "region" on Dashboard page
    Then Selectors "asset type, library, region, location" are "enabled"
    And System buttons are "enabled"
    And Fields "title, description" are "disabled"

    When I select "Gulf of Mexico" "location" on Dashboard page
    Then Selectors "asset type, library, region, location" are "enabled"
    And System buttons are "enabled"
    And Fields "title, description" are "enabled"



