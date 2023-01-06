#Author - Zakir
#Date - 01/03/23
# BDD - Behaviroul Driven Development
# Gherkin Language
# Feature, Scenario, Given, When, And, Then, But, Scenario Outline, Examples, Background, Description
Feature: Sauce demo login feature


Scenario Outline: Login functionality testing

Given open the google chrome browser and Go to sauce demo app
When user enter "<userName>" in username text box
When user enter "<password>" in password Text box
And user click on login button
Then user should be in Product page

Examples: 
#data table
|userName|password|
|standard_user|secret_sauce|
|locked_out_user|secret_sauce|
|problem_user|secret_sauce|


