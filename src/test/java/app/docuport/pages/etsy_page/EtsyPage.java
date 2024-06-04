package app.docuport.pages.etsy_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EtsyPage {
    @FindBy (xpath = "//input[@id='global-enhancements-search-query']")
    public WebElement searchField;
}
