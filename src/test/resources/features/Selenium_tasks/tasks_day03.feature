Feature: Day 03 tasks

  @day03_task_0
  Scenario: tasks from day 3 automation class
    Given the user lands to "https://loopcamp.vercel.app/forgot-password.html" website
    Then the user validates below elements are displayed
      | forgotPassword    |
      | email             |
      | emailInput        |
      | retrievePassword  |
      | poweredByLoopcamp |


  @day03_task_1
  Scenario: User successfully logs in and logs out of Docuport
    Given the user lands to "https://beta.docuport.app/" website
    When the user logs in with the following credentials:
      | email    | b1g2_client@gmail.com |
      | password | Group2                |
    Then the user should see the dashboard indicating a successful login
    When the user clicks the logout button
    Then validate user is redirected to the login page

  @day03_task_2
  Scenario: Validate login functionality with missing credentials
    Given the user lands to "https://beta.docuport.app/" website
    Then the user should see the placeholder "Username or email" in the "username" field
    And the user should see the placeholder "Password" in the "password" field
    When the user clicks the login button without entering username and password
    Then the user should see the error message "Username is required" in the "username" field
    And the user should see the error message "Password is required" in the "password" field

@day03_task_3
Scenario: Verify navigation from Google to Gmail and back
  Given the user lands to "https://google.com" website
  When the user clicks on Gmail from top right
  And validate the title "Gmail: Private and secure email at no cost | Google Workspace"
  When user go back to previous page
  Then validate the title "Google"
  
  @day03_task_4
  Scenario: Verify title after searching for wooden spoon on Etsy
    Given the user lands to "https://www.etsy.com" website
    When user input "wooden spoon" in the search field
    And validate the title "Wooden spoon | Etsy"





