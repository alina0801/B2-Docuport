package app.docuport.step_definitions.selenium_tasks;

import app.docuport.pages.google_page.GoogleMainPage;
import app.docuport.utilities.Driver;
import io.cucumber.java.en.*;


public class Day03_task_3 {

    GoogleMainPage googleMainPage = new GoogleMainPage();

    @When("the user clicks on Gmail from top right")
    public void the_user_clicks_on_Gmail_from_top_right() {

        googleMainPage.gmailButton.click();

    }

    @When("validate the title {string}")
    public void validate_the_title(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Actual title: \"" + actualTitle + "\", match expected: \"" + expectedTitle + "\"");
        } else {
            System.err.println("Actual title: \"" + actualTitle + "\", DOESN'T match expected: \"" + expectedTitle + "\"");
        }
    }

    @When("user go back to previous page")
    public void user_go_back_to_previous_page() throws InterruptedException {
        Driver.getDriver().navigate().back();
        Thread.sleep(3000);
    }
}

