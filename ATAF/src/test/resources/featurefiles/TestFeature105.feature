Feature: Test Feature 105
@B1 @Test Feature 105
Scenario Outline: Test Scewnario 105
When the user enters value in " " filed with  "<id>"

Examples:
|id|
|1|User1|1|
|2|User2|2|
When the user enters value in " " filed with  "<nam>" "<e>"

Examples:
|id|nam|e|
|1|User1|1|User1|
|2|User2|2|User2|
Then the user provides input data to alert 

Examples:
|id|nam|e|
|1|User1|1|User1|
|2|User2|2|User2|