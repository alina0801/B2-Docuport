package app.docuport.pages.google_page;

import app.docuport.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class GoogleBasePage {
    public GoogleBasePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
