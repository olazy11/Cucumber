Feature: Searching the employee
  Background:
    When user enters valid email and valid password
    And click on login button
    When user clicks on PIM option
  @smoke1
  Scenario: Search Employee by ID
   # Given open the browser and launch HRMS application
#    When user enters valid email and valid password
#    And click on login button
#    When user clicks on PIM option
    When user enters valid employee id
    And clicks on search button
    And user see employee information is displayed
    #And close the browser

  @smoke1
    Scenario: Search Employee by job title
    #  Given open the browser and launch HRMS application
#      When user enters valid email and valid password
#      And click on login button
#      When user clicks on PIM option
      When user select Job Title
      And clicks on search button
      And user see employee information is displayed
     # And close the browser
#Background: This is used to define all common steps that multiple scenarios have in the same feature file till the time flow(sequence) is broken