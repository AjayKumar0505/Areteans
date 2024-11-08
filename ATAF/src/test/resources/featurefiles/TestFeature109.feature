Feature: Test Feature 109
@A1 @Test Feature 109
Scenario Outline: brtb
When the user enters value in " " filed with  "<id>"

Examples:
|id|
|1|U11|1|
|2|U22|2|
And the user selects the dropdown value "" ByIndex  "<name>"

Examples:
|id|name|
|1|U11|1|U11|
|2|U22|2|U22|