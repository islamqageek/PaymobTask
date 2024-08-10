package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends PageBase{
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Create an Account")
    WebElement createAccountLink;
    @FindBy(xpath = "//*[@id='firstname']")
    WebElement firstNameField;
    @FindBy (id="lastname")
    WebElement lastNameField ;
    @FindBy (id="email_address")
    WebElement emailField;
    @FindBy (id="password")
    WebElement passwordField;
    @FindBy (id="password-confirmation")
    WebElement confirmPasswordField;
    @FindBy (xpath = "//*[@title='Create an Account']")
    WebElement createAccountButton;
public  void createAccount(String fName , String lName , String email , String pass , String ConfirmPass ){
    createAccountLink.click();
    firstNameField.sendKeys(fName);
    lastNameField.sendKeys(lName);
    emailField.sendKeys(email);
    passwordField.sendKeys(pass);
    confirmPasswordField.sendKeys(ConfirmPass);
    createAccountButton.click();

}
}
