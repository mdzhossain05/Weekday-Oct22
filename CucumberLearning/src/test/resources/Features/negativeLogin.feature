#Author - Zakir
#Date - 01/03/23
# BDD - Behaviroul Driven Development
# Gherkin Language
# Feature, Scenario, Given, When, And, Then, But, Scenario Outline, Examples, Background, Description
Feature: Sauce demo login feature

@smoke
Scenario: Negative testing with locked out user

Given open the google chrome browser and Go to sauce demo app
When user enter locked_out_user in username text box
When user enter secret_sauce in password Text box
And user click on login button
Then user should be in Product page

Scenario: Negative testing with performance glitch user

Given open the google chrome browser and Go to sauce demo app
When user enter performance_glitch_user in username text box
When user enter secret_sauce in password Text box
And user click on login button
Then user should be in Product page
