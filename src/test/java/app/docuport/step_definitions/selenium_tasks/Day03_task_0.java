package app.docuport.step_definitions.selenium_tasks;
import java.util.List;
import app.docuport.pages.loopcamp_vercel.ForgotPasswordPage;
import app.docuport.utilities.Driver;
import io.cucumber.java.en.*;

import static org.junit.Assert.*;

public class Day03_task_0 {


    ForgotPasswordPage forgotPasswordPageObject = new ForgotPasswordPage();
    @Given("the user lands to {string} website")
    public void the_user_lands_to_website(String url) {

        Driver.getDriver().get(url);
    }

    @Then("the user validates below elements are displayed")
    public void the_user_validates_below_elements_are_displayed(List<String> elementList) {
        elementList.forEach(each -> {
            assertTrue(forgotPasswordPageObject.getElementByName(each).isDisplayed());
        });
    }
}
