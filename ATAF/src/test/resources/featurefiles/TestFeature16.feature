Feature: Test Feature 16
@B1 @Test Feature 16
Scenario Outline: Secnario 16.1
Then the user provides input data to alert 
Then the user verifies whether element isSelected "" "<id>"

Examples:
|id|
|1|

@B1 @C1 @Test Feature 16
Scenario Outline: Secnario 16.2
When the user enters value in " " filed with  "<id>"
Then the user gets the inputdata "" and  "<name>"

Examples:
|id|name|
|1|User1|
|2|User2|

@B1 @C1 @D1 @Test Feature 16
Scenario Outline: Secnario 16.3
When the user enters value in " " filed with  "<id>"
Then the user provides input data to alert 
And the user selects the dropdown value "" ByValue 
And the user selects the dropdown value "" ByVisibleText  "<name>"

Examples:
|id|name|
|1|user1|1|user1|1|user1|
|2|
|2|

@B1 @C1 @D1 @Test Feature 16
Scenario Outline: Secnario 16.4
When the user enters value in " " filed with  "<id>"
And the user selects the dropdown value "" ByValue 
And the user selects the dropdown value "" ByVisibleText  "<name>"

Examples:
|id|name|
|4|User 4|

