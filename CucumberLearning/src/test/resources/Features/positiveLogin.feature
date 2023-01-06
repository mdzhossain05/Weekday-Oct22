#Author - Zakir
#Date - 01/03/23
# BDD - Behaviroul Driven Development
# Gherkin Language
# Feature, Scenario, Given, When, And, Then, But, Scenario Outline, Examples, Background, Description
@positiveTest
Feature: Sauce demo login feature

Background: 
Given open the google chrome browser and Go to sauce demo app

@smoke
Scenario: positive testing with standard user

#Given open the google chrome browser and Go to sauce demo app
When user enter standard_user in username text box
When user enter secret_sauce in password Text box
And user click on login button
Then user should be in Product page

@sanity
Scenario: positive testing with problem user

#Given open the google chrome browser and Go to sauce demo app
When user enter problem_user in username text box
When user enter secret_sauce in password Text box
And user click on login button
Then user should be in Product page
