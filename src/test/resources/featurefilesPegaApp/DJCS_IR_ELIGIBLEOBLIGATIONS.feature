Feature: DJCS

@DJCS
  Scenario Outline: Verify child window with title
    Given Open the browser and navigate to the "Pega" url
    When I create object
    Then I set the Test data As "<jsonfile>"
    When I Enter login Username and Password
      | username1 | password1 |
    And I click on login
    And I click on create
    And I search with Obligation
    	| obligation |
    And I select the application
    And I select Debtor details
    And I select Ground
    And I select Obligation
    And I click on create
    And I search with Obligation
    	| obligation1 |
    And I select the application
    And I select Debtor details
    And I select Ground
    And I select Obligation
    And I click on create
    And I search with Obligation
    	| obligation2 |
    And I select the application
    And I select Debtor details
    And I select Ground
    And I select Obligation
        And I click on create
    And I search with Obligation
    	| obligation3 |
    And I select the application
    And I select Debtor details
    And I select Ground
    And I select Obligation
    And I click on create
    And I search with Obligation
    	| obligation4 |
    And I select the application
    And I select Debtor details
    And I select Ground
    And I select Obligation
    And I click on create
    And I search with Obligation
    	| obligation5 |
    And I select the application
    And I select Debtor details
    And I select Ground
    And I select Obligation

    Examples: 
      | jsonfile |
      | EE       |