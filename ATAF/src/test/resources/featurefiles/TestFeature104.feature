Feature: Test Feature 104
@B1 @Test Feature 104
Scenario Outline: Test Scenario 105
And the user selects the dropdown value "" ByVisibleText  "<id>"

Examples:
|id|
|1|User1|1|
|2|User2|2|
When the user enters value in " " filed with  "<name>"

Examples:
|id|name|
|1|User1|1|User1|
|2|User2|2|User2|