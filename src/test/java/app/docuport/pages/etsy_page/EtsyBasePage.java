package app.docuport.pages.etsy_page;

import app.docuport.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class EtsyBasePage {
    public EtsyBasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
