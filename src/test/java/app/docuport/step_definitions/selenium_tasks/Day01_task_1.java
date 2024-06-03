package app.docuport.step_definitions.selenium_tasks;

import app.docuport.pages.Docuport.LoginPage;
import app.docuport.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.Map;

import static app.docuport.utilities.BrowserUtils.waitForClickablility;
import static app.docuport.utilities.BrowserUtils.waitForVisibility;
import static org.junit.Assert.assertEquals;

public class Day01_task_1 {
    LoginPage loginPage = new LoginPage();

    @Given("the user lands on the Docuport login page at {string}")
    public void the_user_lands_on_the_Docuport_login_page_at(String url) {
        Driver.getDriver().get(url);
    }

    @When("the user logs in with the following credentials:")
    public void the_user_logs_in_with_the_following_credentials(Map<String, String> loginCredentials) {

        waitForVisibility(loginPage.usernameDocuportInput, 3).sendKeys(loginCredentials.get("email"));
        waitForVisibility(loginPage.passwordDocuportInput, 3).sendKeys(loginCredentials.get("password"));
        waitForClickablility(loginPage.loginDocuportButton, 3).click();
        waitForClickablility(loginPage.continueButton, 3).click();
    }

    @Then("the user should see the dashboard indicating a successful login")
    public void the_user_should_see_the_dashboard_indicating_a_successful_login() {
        assertEquals(Driver.getDriver().getTitle(), "Docuport");
    }

    @When("the user clicks the logout button")
    public void the_user_clicks_the_logout_button() {
        loginPage.batchButton.click();
        loginPage.logOutButton.click();

    }

    @Then("validate user is redirected to the login page")
    public void validate_user_is_redirected_to_the_login_page() {
        assertEquals(Driver.getDriver().getTitle(), "Docuport");
    }
}
