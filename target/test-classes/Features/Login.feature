Feature: Login Functionalities

  @smoke
  Scenario: Valid Admin Login
    #Given open the browser and launch HRMS application
    When user enters valid email and valid password
    And click on login button
    Then user is logged in successfully
    #And close the browser
  #passing value through property file (java)

  @smoke2
  Scenario: Valid Admin Login
    #Given open the browser and launch HRMS application
    When user enters valid "admin" and valid "Hum@nhrm123"
    And click on login button
    Then user is logged in successfully
    #And close the browser

  @ScenarioOutline
#parameterizatiion/data driven
  Scenario Outline:  Login with multiple credentials using ScenarioOutline
    #Given open the browser and launch HRMS application
    When user enters valid "<username>" and valid "<password>"
    And click on login button
    Then user is logged in successfully
    #And close the browser
    Examples:
      | username | password    |
      | admin    | Hum@nhrm123 |
      | ADMIN    | Hum@nhrm123 |
      | Jason    | Hum@nhrm123 |

#When you want to use parameterization and data driven testing we use Scenario Outline, always used along with the keyword 'Examples'


#DataTable - 1 time browser opens and 1 time close (because of Java code)
  @DataTable
  Scenario: Login with multiple credentials using data table
    When user enters username and password and verifies login
      | username | password    |
      | admin    | Hum@nhrm123 |
      | ADMIN    | Hum@nhrm123 |
      | Jason    | Hum@nhrm123 |





  #HOOKS: For defining pre and Post steps in any Cucumber framework
    #     : This is always created inside the StepDefinitions folder
   # : this class cannot be inherited
  #: hooks will take care of pre and post conditions irrespective of what goes in between


    #BACKGROUND: Its the clubbing of common steps in different scenarios of a feature file
   #             till flow is not broken
   #1. Hard Code
   #2. Config file

   #-----------------Cucumber itself provides multiple option through which we can feed data from
   # feature file into Step Definition---------------------------------------------
   #3. Regular Expressions
       # put the data in double quotes [""]
   #4. Scenario Outline
       # Provides you an alternative to Data driven testing
       # Also supports parametrization
  #===================================PARAMETERIZATION================================
  # Executing the same test case with multiple data