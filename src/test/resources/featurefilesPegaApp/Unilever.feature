Feature: Unilever Confirm Proposed Order Flow

  @Unilever
  Scenario Outline: Unilever Confirm Proposed Order Flow
    Given Open the browser and navigate to the "Pega" url
    When I create object
    Then I set the Test data As "<jsonfile>"
    When I Enter login Username and Password
      | Debtorusername | Debtorpassword |
    And I click on login
    Then I Verify that "homepagetitle" of the screen
    And I click on knowmore
    And I click on caseId

    Examples: 
      | jsonfile | 
      | Unilever |
