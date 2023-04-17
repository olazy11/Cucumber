Feature: Employee

 @testcase2  @smoke
  Scenario: Adding a new Employee
    #Given open the browser and launch HRMS application
    When user enters valid email and valid password
    And click on login button
    When user clicks on PIM option
    Then user clicks on Add Employee button
    And user enters first, middle an last names
    And user clicks on save button
   # And close the browser
