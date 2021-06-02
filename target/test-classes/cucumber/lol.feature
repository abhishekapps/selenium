Feature: ActiTime Login feature

  Scenario Outline: Validate the login feature
    Given User open the login page
    When User enter the correct "username" and "password"
    And User click on the login button
    Then Login successful message should be display

    Examples: 
      | username | password |
      | admin    | manager  |