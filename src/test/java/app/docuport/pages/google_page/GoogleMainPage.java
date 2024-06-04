package app.docuport.pages.google_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleMainPage extends GoogleBasePage{

    @FindBy(linkText = "Gmail")
    public WebElement gmailButton;
}
