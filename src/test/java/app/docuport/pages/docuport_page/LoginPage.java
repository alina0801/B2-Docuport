package app.docuport.pages.docuport_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DocuportBasePage {

    // label[.='Password']//following-sibling::input[1] works because it targets the input element associated with the label,
    // label[.='Password'] only targets the label element.

    @FindBy(xpath = "//label[.='Username or email']//following-sibling::input[1]")
    public WebElement usernameDocuportInput;
    @FindBy(xpath = "//label[text()='Username or email']")
    public WebElement usernameFieldText;
    @FindBy(xpath = "//div[text()='Please enter your username or email address']")
    public WebElement errMessageForEmptyUsername;
    @FindBy(xpath = "//label[.='Password']//following-sibling::input[1]")
    public WebElement passwordDocuportInput;
    @FindBy(xpath = "//label[text()='Password']")
    public WebElement passwordFieldText;
    @FindBy(xpath = "//div[text()='Please enter your password']")
    public WebElement errMessageForEmptyPassword;
    @FindBy(xpath = "//span[contains(., ' Log in ')]")
    public WebElement loginDocuportButton;
    // normalize-space() - we use If the text might be split or have variations in whitespace
    @FindBy(xpath = "//span[normalize-space()='Continue']")
    public WebElement continueButton;
    @FindBy(xpath = "//span[normalize-space()='Batch1 Group2']")
    public WebElement batchButton;
    @FindBy(xpath = "//span[normalize-space()='Log out']")
    public WebElement logOutButton;



}
