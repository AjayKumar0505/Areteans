Feature: Tata AIG claims flow

@CapureLeaseRequest
  Scenario Outline: Verify Capture lease request
    Given Open the browser and navigate to the "Pega" url
    When I send Object details
    Then I set the test data as "<jsonfile>"
    When I enter login username and password
      | ClaimsUser | password |
    And I click on login button
    And I click on Create FNOL
    And I Initiate Claim
      | PhoneNumber | OTP |
    And I click On Submit button        
    And I Identify Policy
      | PolicyNumber |
    And I click On Submit button    
    And I enter Basic Details
      | Calleridentification | Claimfor |
    And I enter Insured Contact Details
    And I click on Next
    And I enter Claimant Details
    And I click on Next
    And I enter Loss Details
      | LossDescription | DamagetotheVehicle | DivertedtoKPG | Iseventcatastrophe | Vehicleatworkshop |
    And I click on Next
    And I enter Driver Details
    And I click on Next
    And I enter Garage Details
    And I click on Next
    And I click on Log off
    
    Examples: 
      | jsonfile  | Category      | Decision  | Decision1 | Quality      |
      | Demo_Data | Claimant Docs | Recommend | Approve   | Satisfactory |
    
  @Claim
  Scenario Outline: Verify Tata Aig claims flow
    Given Open the browser and navigate to the "Pega" url
    When I send Object details
    Then I set the test data as "<jsonfile>"
    When I enter login username and password
      | ClaimsUser | password |
    And I click on login button
    And I click on Create FNOL
    And I Initiate Claim
      | PhoneNumber | OTP |
    And I click On Submit button        
    And I Identify Policy
      | PolicyNumber |
    And I click On Submit button    
    And I enter Basic Details
      | Calleridentification | Claimfor |
    And I enter Insured Contact Details
    And I click on Next
    And I enter Claimant Details
    And I click on Next
    And I enter Loss Details
      | LossDescription | DamagetotheVehicle | DivertedtoKPG | Iseventcatastrophe | Vehicleatworkshop |
    And I click on Next
    And I enter Driver Details
    And I click on Next
    And I enter Garage Details
    And I click on Next
    And I click on Log off    
    When I enter login username and password
      | GarageExaminer4 | password |
    And I click on login button
    When I click ok Notifications
    And I click on first Notification
    Then I verify Work Status
      | WorkStatus1 |
    And I click on Go button
    And I click ok Add icon
    Then I enter the details
      | IMT | Repair | Material | side | section | HSN | partprice | DepPerc | tax | install | labourRepair | GST | paintLabour | paintMaterial | paintGST | UpdateGST |
    And I click On Submit button
    And I enter Fraud information
      | outcome |
    And I click On Submit button
    Then I verify case Assigned To "Nominated User 4"
    And I click on Log off
    Then I verify the Login Page
    When I enter login username and password
      | NominatedUser4 | password |
    And I click on login button
    When I click on Search and enter Case ID and click on Enter
    Then I verify Work Status
      | WorkStatus2 |
    And I click on Go button
    And I select Decision "<Decision>"
    And I select Recommend To "Zonal Claims Manager 4"
    And I enter in Comments by NU
    And I click On Submit button
    Then I verify case Assigned To "ZCM 4"
    And I click on Log off
    When I enter login username and password
      | ZonalClaimsManager4 | password |
    And I click on login button
    When I click on Search and enter Case ID and click on Enter
    Then I verify Work Status
      | WorkStatus3 |
    And I click on Go button
    And I select Decision "<Decision>"
    And I select Recommend To "Zonal Claims Manager 1"
    And I enter in Comments by ZCU
    And I click On Submit button
    Then I verify case Assigned To "ZCM 1"
    And I click on Log off
    Then I verify the Login Page
    When I enter login username and password
      | ZonalClaimsManager1 | password |
    And I click on login button
    When I click on Search and enter Case ID and click on Enter
    Then I verify Work Status
      | WorkStatus4 |
    And I click on Go button
    And I select Decision "<Decision>"
    And I select Recommend To "L H Approver"
    And I click On Submit button
    Then I verify case Assigned To "L H Approver"
    And I click on Log off
    Then I verify the Login Page
    When I enter login username and password
      | LHApprover | password |
    And I click on login button
    When I click on Search and enter Case ID and click on Enter
    Then I verify Work Status
      | WorkStatus5 |
    And I click on Go button
    And I select Decision "<Decision1>"
    And I click On Submit button
    Then I verify case Assigned To "SIU User 1"
    And I click on Log off
    Then I verify the Login Page
    When I enter login username and password
      | SIUUser | password |
    And I click on login button
    When I click on Search and enter Case ID and click on Enter
    Then I verify Work Status
      | WorkStatus6 |
    And I click on Go button
    And I click On Submit button
    And I upload Refference Documents "<Category>"
    And I click On Submit button
    And I select Investigator
    And I verify Investigator Response and Providing Performance Rating "<Quality>"
    And I click On Submit button
    Then I verify case Assigned To "Garage Examiner 4"
    And I click on Log off
    Then I verify the Login Page
    When I enter login username and password
      | GarageExaminer4 | password |
    And I click on login button
    When I click on Search and enter Case ID and click on Enter
    Then I verify Work Status
      | WorkStatus7 |
    And I click on Go button
    And I click on Verified and Accepted documents by Examiner
    And I enter remarks for documents
    And I click On Submit button
    Then I verify Work Status
      | WorkStatus8 |
    And I click on Log off
    Then I verify the Login Page

    Examples: 
      | jsonfile  | Category      | Decision  | Decision1 | Quality      |
      | Demo_Data | Claimant Docs | Recommend | Approve   | Satisfactory |
