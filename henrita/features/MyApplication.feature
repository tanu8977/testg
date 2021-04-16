Feature: Test Facebook smoke sceanario

  Scenario Outline: Test login with valid  credentials
    Given Open Chrome and Start Application
    When I enter valid  <Firstname> and <password>
    Then user should be login successfully

    
