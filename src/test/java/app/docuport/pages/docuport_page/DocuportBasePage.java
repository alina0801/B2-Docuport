package app.docuport.pages.docuport_page;

import app.docuport.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class DocuportBasePage {

    public DocuportBasePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }
    }

