package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class AddToCompareListPage extends PageBase {

    private static final int TIMEOUT = 0; // Adjust timeout as needed

    @FindBy(className = "product-image-photo")
    private List<WebElement> items;

    @FindBy(className = "logo")
    private WebElement homePage;

    @FindBy(css = "a.action.tocompare")
    private WebElement addCompare;

    @FindBy(css = "a.action.compare")
    private WebElement navToCompare;

    @FindBy(className ="page-title")
    private WebElement pageTitle;

    private final WebDriverWait wait;

    public AddToCompareListPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(90));
    }

    public void addToCompare() {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElements(items));
            wait.until(ExpectedConditions.elementToBeClickable(items.get(0))).click();
            wait.until(ExpectedConditions.elementToBeClickable(addCompare)).click();
            wait.until(ExpectedConditions.elementToBeClickable(homePage)).click();
            // Add second item to compare
            wait.until(ExpectedConditions.elementToBeClickable(items.get(1))).click();
            wait.until(ExpectedConditions.elementToBeClickable(addCompare)).click();
            wait.until(ExpectedConditions.elementToBeClickable(navToCompare)).click();
            wait.until(ExpectedConditions.visibilityOf(pageTitle));
            Assert.assertEquals(pageTitle.getText(), "Compare Products");
        } catch (Exception e) {
            Assert.fail("Failed to add products to compare list: " + e.getMessage());
        }
    }
}
