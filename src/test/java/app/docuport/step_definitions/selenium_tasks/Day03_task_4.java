package app.docuport.step_definitions.selenium_tasks;

import app.docuport.pages.etsy_page.EtsyPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class Day03_task_4 {

    EtsyPage etsyPage = new EtsyPage();
    @When("user input {string} in the search field")
    public void user_input_in_the_search_field(String input) {
etsyPage.searchField.sendKeys(input + Keys.ENTER);
    }
}
