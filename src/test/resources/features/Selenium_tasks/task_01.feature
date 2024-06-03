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
      | email    | b1g2_client@gmail.com |
      | password | Group2                |
    Then the user should see the dashboard indicating a successful login
    When the user clicks the logout button
    Then validate user is redirected to the login page

  @day01_task_2
  Scenario: Validate login functionality with missing credentials
    Given the user lands on the Docuport login page at "https://beta.docuport.app/"
    Then the user should see the placeholder "Username or email" in the "username" field
    And the user should see the placeholder "Password" in the "password" field
    When the user clicks the login button without entering username and password
    Then the user should see the error message "Username is required" in the "username" field
    And the user should see the error message "Password is required" in the "password" field



