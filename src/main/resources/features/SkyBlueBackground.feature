@2Scenarios
Feature: User is able to change background color

  @changeToBlue
  Scenario: User should be able to change background color successfully from white to blue
    Given User is on the test page
    When User clicks on the "Set SkyBlue Background" button
    Then The background color will change to sky blue
