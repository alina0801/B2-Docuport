package app.docuport.step_definitions.selenium_tasks;
import java.util.List;
import app.docuport.pages.LoopCamp_Vercel.ForgotPasswordPage;
import app.docuport.utilities.Driver;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class Day01_task_0 {
    ForgotPasswordPage forgotPasswordPageObject = new ForgotPasswordPage();
    @Given("user lands to {string} website")
    public void user_lands_to_website(String string) {
        Driver.getDriver().get(string);
    }

    @Then("user validates below elements are displayed")
    public void user_validates_below_elements_are_displayed(List<String> elementList) {
        elementList.forEach(each -> {
            assertTrue(forgotPasswordPageObject.getElementByName(each).isDisplayed());
        });
    }
}
