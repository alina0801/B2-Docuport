package app.docuport.pages.feyruz_page;

import app.docuport.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {


        PageFactory.initElements(Driver.getDriver(), this);
    }
}
