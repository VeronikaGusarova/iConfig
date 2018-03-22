#Feature: Account creation page.
#  As a user I want to click button "Start Taking Payments" on the Home page and Account Creation page should be open;
#  Each component of the form should have correct placeholder;
#
#  @Smoke @SeverityLevel.CRITICAL @TestCaseId("AEMO-683")
#  Scenario: Check that button "Start Taking Payments" on the home page work correctly
#    Given I open home page
#    When I click button 'Start Taking Payments' on the Home page
#    Then Account Creation page should be open
#
#  @Smoke @SeverityLevel.CRITICAL @TestCaseId("AEMO-684")
#  Scenario: Check placeholders of components
#    Given I open home page
#    When I click button 'Start Taking Payments' on the Home page
#    Then Placeholder of the field 'Legal name' should be "Legal (trade) name" on the Account Creation page
#    And Placeholder of the field 'Authorized signatory' should be "Authorized signatory name" on the Account Creation page
#    And Placeholder of the field 'Email' should be "name@mycompany.com" on the Account Creation page
#    And Placeholder of the field 'Mobile phone' should be "+97150 000 0000" on the Account Creation page
#    And Button 'Sign Up' should be present on the Account Creation page
#
#  @Smoke @SeverityLevel.CRITICAL @TestCaseId("AEMO-687")
#  Scenario: Privacy Policy page should be opened by clicking link 'Privacy Policy'
#    Given I open Account Creation page
#    And I click link 'Privacy Policy' on the Account Creation page
#    Then  Privacy Policy page should be opened
#
#  @Smoke @SeverityLevel.CRITICAL @TestCaseId("AEMO-686")
#  Scenario: Terms And Conditions page should be opened by clicking link 'Terms & Conditions'
#    Given I open Account Creation page
#    And I click link 'Terms & Conditions' on the Account Creation page
#    Then  Terms And Conditions page should be opened
#
#  @Smoke @SeverityLevel.CRITICAL @TestCaseId("AEMO-689") @TestCaseId("AEMO-688")
#  Scenario: Authorized signatory should contain at least 1 space. Check error message.
#    Given I open Account Creation page
#    And I fill the 'Authorized signatory' field as "TestSignatory" on the Account Creation page
#    And I lose focus
#    Then Error message of field 'Authorized signatory' should be "Please enter your full name" on the Account Creation page
#
#  @Smoke @SeverityLevel.CRITICAL @TestCaseId("AEMO-688")
#  Scenario Outline: Authorized signatory. Possible values: Uppercase and lowercase latin letters (a-z, A-Z), Space.
#    Given I open Account Creation page
#    And I fill the 'Authorized signatory' field as "<AuthorizedSignatory>" on the Account Creation page
#    And I lose focus
#    Then Error message of field 'Authorized signatory' should not exist on the Account Creation page
#    Examples:
#      | AuthorizedSignatory |
#      | Test Signatory      |
#      | Test Epam signatory |
#
#  @Smoke @SeverityLevel.CRITICAL @TestCaseId("AEMO-688")
#  Scenario Outline: Authorized signatory. Possible values: Uppercase and lowercase latin letters (a-z, A-Z), Space.Any other characters sets (Arabic, etc) are prohibited
#    Given I open Account Creation page
#    And I fill the 'Authorized signatory' field as "<AuthorizedSignatory>" on the Account Creation page
#    And I lose focus
#    Then Error message of field 'Authorized signatory' should be "Valid characters are A-Z a-z" on the Account Creation page
#    Examples:
#      | AuthorizedSignatory |
#      | Test Signatory й    |
#      | #as !               |
#      | Ёлка и ель          |
#
#  @Smoke @SeverityLevel.CRITICAL @TestCaseId("AEMO-688")
#  Scenario: Authorized signatory. Min length is 3 symbols
#    Given I open Account Creation page
#    And I fill the 'Authorized signatory' field as "A E" on the Account Creation page
#    And I lose focus
#    Then Error message of field 'Authorized signatory' should not exist on the Account Creation page
#
#  @Smoke @SeverityLevel.CRITICAL @TestCaseId("AEMO-688")
#  Scenario: Authorized signatory. Max length is 254 symbols
#    Given I open Account Creation page
#    And I fill the 'Authorized signatory' field with a message of 254 characters long on the Account Creation page
#    And I lose focus
#    Then Error message of field 'Authorized signatory' should not exist on the Account Creation page
#
#
#
