Feature: Cabinet Leasing Management flow

  @CLM
  Scenario Outline: Verify new cabinet lease request
    Given Open the browser and navigate to the "Pega" url 
    #15min
    When I send object details 
    #15min
    Then I set the Test data as "<jsonfile>" 
    #8min
    When I Enter login username and password 
      | LeaseCoordinator | password |
    #13min
    And I Click on login button. 
    #7min
    And I Click on new cabinet lease request
    #7min
    Then I validate the case work status
      | WorkStatus1 |
    #9min
    And I Validate request
      | RequestID | RequestDate | LeaseStartDate | LeaseEndDate | LeaseAmount | CabinetDimensions | AdditionalFeatures | PaymentFrequency | CabinetType |
    #25min
    #And I copy the cased Id and assign to variable "VariableText"
    When I copy the element text by "Feild" and assign to the variable "VariableText"
    Then I enter element by "Feild" with data "VariableText"
    And I Enter wrong contact details
      | FirstName | LastName | Email | CountryCode | WrongPhoneNumber |
    #18min
    Then I validate error message
    #7min
    When I Re enter correct contact details
      | PhoneNumber |
    #12min
    And I Enter Location details
      | AddressLine1 | AddressLine2 | CityTown | State | PostalCode |
    #23min
    And I click on submit button
    #6min
    And I close save address popup
    #6min
    Then I validate the case work status
      | WorkStatus2 |
    #15min
    Then I Verify case Assigned To "Cabinet Approver"
    #9min
    And I Click on Log off
    #7min
    When I Enter login username and password
      | CabinetApprover | password1 |
    #10min
    And I Click on login button
    #7min
    And I Search for the previous case
    #10min
    And I Click on Go button
    #7min
    Then I validate the case work status
      | WorkStatus2 |
    #9min
    When I Change approval status "<ApprovalStatus>"
    #7min
    And I click on submit button
    #3min
    And I Click on Log off
    #4min

    Examples: 
      | jsonfile | ApprovalStatus |
      | Clm      | Approved       |
      
    #4min      
      #90 mins for Xpaths
      #30 mins for JSON file
      
