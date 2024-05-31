Feature: Day 01 tasks

  @day01_task_0
  Scenario: tasks from day 3 automation class
    Given user lands to "https://loopcamp.vercel.app/forgot-password.html" website
    Then user validates below elements are displayed
      | forgotPassword    |
      | email             |
      | emailInput        |
      | retrievePassword  |
      | poweredByLoopcamp |


  @day01_task_1
  Scenario: User successfully logs in and logs out of Docuport
    Given the user lands on the Docuport login page at "https://beta.docuport.app/"
    When the user logs in with the following credentials:
      | email                 | password |
      | b1g2_client@gmail.com | Group2   |
    Then the user should see the dashboard indicating a successful login
    When the user clicks the logout button
    Then validate user is redirected to the login page



