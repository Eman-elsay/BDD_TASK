Feature: Create Account
  As a user, I want to be able to create an accont

  @TC1
  Scenario: Verify that the user can create an account successfully
    Given I open telerik website
    When I click on freeTrial
    And I click tryNow
     #And I click uiForReact
    And I fill email
    And I click next
    And I fill Data
    Then I Assert SucessMsg is Exist

