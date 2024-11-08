Feature: Amazonflow

@Amazon
  Scenario Outline: Verify Amazon flow
    Given Open the browser and navigate to the "Pega" url
    When I send Object Details
    And I wait for enter the security code
    And I search for the product
    And I select the products
    
    Examples: 
      | jsonfile  | Category      | Decision  | Decision1 | Quality      |
      | Demo_Data | Claimant Docs | Recommend | Approve   | Satisfactory |