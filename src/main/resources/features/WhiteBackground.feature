@2Scenarios
Feature: User is able to change back background color

  @changeBackToWhite
  Scenario: User should be able to change back background color from blue to white
    Given User is on the test page
     When User clicks on the "Set SkyBlue Background" button
    And User clicks on the "Set SkyWhite Background" button
    Then The background color will change to white