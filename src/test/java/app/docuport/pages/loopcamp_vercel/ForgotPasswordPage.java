package app.docuport.pages.loopcamp_vercel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.lang.reflect.Field;

public class ForgotPasswordPage extends Vercel_BasePage {
    @FindBy(tagName = "h2")
    public WebElement forgotPassword;
    @FindBy(xpath = "//label[.='E-mail']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailInput;
    @FindBy(xpath = "//i[.='Retrieve password']")
    public WebElement retrievePassword;
    @FindBy(xpath = "//div[@style='text-align: center;']")
    public WebElement poweredByLoopcamp;

    /**
     * Method to get a WebElement by its name as a string.
     *
     * @param elementName The name of the WebElement to retrieve.
     * @return The WebElement if found, otherwise null.
     */
    public WebElement getElementByName(String elementName) {
        try {
            // Get the field of the given element name
            Field field = this.getClass().getField(elementName);
            // Ensure the field is of type WebElement
            if (WebElement.class.isAssignableFrom(field.getType())) {
                return (WebElement) field.get(this);
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

//    public WebElement getElementByName(String elementName) {
//        return Driver.getDriver().findElement(By.name(elementName));
//    }



}
