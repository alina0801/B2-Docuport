package app.docuport.step_definitions.selenium_tasks;

import app.docuport.pages.Docuport.LoginPage;
import app.docuport.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class Day01_task_2 {

    LoginPage loginPage = new LoginPage();

    @Then("the user should see the placeholder {string} in the {string} field")
    public void the_user_should_see_the_placeholder_in_the_field(String placeholderText, String field) {
        String actualText = "";
        switch (field) {
            case "username":
                actualText = loginPage.usernameFieldText.getText().trim();
                break;
            case "password":
                actualText = loginPage.passwordFieldText.getText().trim();
                break;
            default:
                System.err.println("Invalid field: " + field);
                return;
        }

        if (actualText.equals(field)) {

            System.out.println("Expected header for form: \"" + placeholderText + "\", matches actual header: \"" + actualText + "\" = Test PASSED");
        } else {
            System.out.println("Expected header for form: \"" + placeholderText + "\", DOES NOT match actual header: \"" + actualText);
            System.err.println("TEST FAILED");
        }

    }

    @When("the user clicks the login button without entering username and password")
    public void the_user_clicks_the_login_button_without_entering_username_and_password() {
        loginPage.loginDocuportButton.click();
    }

    @Then("the user should see the error message {string} in the {string} field")
    public void the_user_should_see_the_error_message(String expectedMessage, String field) {
        boolean isErrMessage = true;
        String actualErrMessage = "";
        switch (field) {
            case "username":
                isErrMessage = loginPage.errMessageForEmptyUsername.isDisplayed();
                actualErrMessage = loginPage.errMessageForEmptyUsername.getText();
                break;
            case "password":
                isErrMessage = loginPage.passwordFieldText.isDisplayed();
                actualErrMessage = loginPage.errMessageForEmptyPassword.getText();
                break;
            default:
                System.err.println("Invalid field: " + field);
                return;
        }
        assertTrue("Expected error message: " + expectedMessage + ", matches the actual" + actualErrMessage, isErrMessage);
    }}