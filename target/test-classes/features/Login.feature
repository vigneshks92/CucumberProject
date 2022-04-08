Feature: This feature would be used to design the Login page of the application

  Background: Open the application
    Given I have opened the application in browser

  Scenario: Validate the Successful Login
    When I click on the Login Link
    And I enter username
    And I enter password
    And I click on the Login Button
    Then I should be landed on the Home page

  Scenario: Validate the Successful Login using test data
    When I click on the Login Link
    And I enter username "abc@xyz.com"
    And I enter password "Abcd@1234"
    And I click on the Login Button
    Then I should be landed on the Home page
    And I see something

  Scenario Outline: Validate the Successful Login using multiple test data
    When I click on the Login Link
    And I enter username "<UserName>
    And I enter password "<Password>"
    And I click on the Login Button
    Then I should be landed on the Home page
    And I see something

    Examples: 
      | UserName    | Password |
      | abc@xyz.com | Abc@123  |
      | vig@abc.com | Abc@123  |
