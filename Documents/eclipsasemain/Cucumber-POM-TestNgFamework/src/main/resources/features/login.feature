 
Feature: Login Functionality
  @tag1
  Scenario: login with valid creds
    Given UserIsOnloginpage
     
    When user entered username and password and click on login
    Then logginsucessfull
    
