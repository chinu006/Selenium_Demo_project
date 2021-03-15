
  Feature: Handle Iframe

    Scenario: Handle IFrame
      Given user is on guru99 home page
      And switch to the frame
      And click the element
      Then navigate back to the parent frame
      Then close all windows

      Scenario: Handle multiple Iframe
        Given user is on guru99 home page
        And find total number of Iframes present in the web page
        And find the index of iframe
        And switch to frame
        And click on element present in iframe
        Then close all windows
