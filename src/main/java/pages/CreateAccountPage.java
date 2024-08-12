package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateAccountPage extends PageBase {

    private static final int TIMEOUT = 10; // Adjust timeout as needed
    private final WebDriverWait wait;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(90));
    }

    @FindBy(linkText = "Create an Account")
    private WebElement createAccountLink;

    @FindBy(xpath = "//*[@id='firstname']")
    private WebElement firstNameField;

    @FindBy(id = "lastname")
    private WebElement lastNameField;

    @FindBy(id = "email_address")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "password-confirmation")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "//*[@title='Create an Account']")
    private WebElement createAccountButton;

    public void createAccount(String fName, String lName, String email, String pass, String confirmPass) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(createAccountLink)).click();
            wait.until(ExpectedConditions.visibilityOf(firstNameField)).sendKeys(fName);
            lastNameField.sendKeys(lName);
            emailField.sendKeys(email);
            passwordField.sendKeys(pass);
            confirmPasswordField.sendKeys(confirmPass);
            createAccountButton.click();
        } catch (Exception e) {
            // Log or handle the exception as needed
            throw new RuntimeException("Failed to create an account: " + e.getMessage());
        }
    }
}
