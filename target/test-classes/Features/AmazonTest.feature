
Feature: Amazon Application Testing
  

 @TAG1
  Scenario: “Today’s Deal” should be visible on the Home page
    Given User launches Amazon Application
    When User is on the Home Page
    Then Today's Deal should be displayed 
    
@TAG1
  Scenario: All New Deals should be shown on New Tab
    Given User is on Home Page
    When Clicks on See All Details 
    Then All Details should be shown on New Tab
    And Click on Category Link 
    When User Select Baby Products and Beauty options 
    Then Snapshot should be taken
    
  @TAG1
  Scenario: Sign In Into Amazon site
    Given User Navigates back to Amazon Home Page
    When User Clicks on Sign In 
    And Enters valid mobile number "9960222222" and password "Test1234"
    Then Login should be successful

    
