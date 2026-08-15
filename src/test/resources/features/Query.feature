Feature: Query module

  Scenario: Application should allow to login to the application
    Given Login to the application
    When Enter Username and password
    And Click on login button
    Then Should login to the application successfully
    