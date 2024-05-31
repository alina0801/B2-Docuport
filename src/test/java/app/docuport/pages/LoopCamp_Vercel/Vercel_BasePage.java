package app.docuport.pages.LoopCamp_Vercel;

import app.docuport.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class Vercel_BasePage {

    public Vercel_BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
