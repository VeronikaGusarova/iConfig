Feature: Login page.
  As a user I want to sign up on the Login page;
  Dashboard page should be opened after sign up;
  Error should be shown in case of incorrect creds

  @Smoke @SeverityLevel.CRITICAL
  Scenario: Sign Up with correct credentials
    Given I open Login page
    When I fill Login and Password fields with correct credentials on Login page
    And I click button 'log in' on Login page
    Then Page with url "!/dashboard" should be opened

  @Smoke @SeverityLevel.CRITICAL
  Scenario: Sign Up with fake credentials
    Given  I open Login page
    When I fill Login and Password fields with fake credentials on Login page
    And I click button 'log in' on Login page
    Then Modal window with title "Error" and body text "An error occured during request to the server. Check details in browser console." should appear
    When I close modal window by 'Ok' button
    Then Label "Incorrect email/password" should appear on Login Page
