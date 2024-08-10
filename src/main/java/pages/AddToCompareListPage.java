package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddToCompareListPage extends PageBase{
    public AddToCompareListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "product-image-photo")
    List <WebElement> items ;
    @FindBy(className = "logo")
    WebElement homePage;
    @FindBy(xpath = "//*[@id='maincontent']/div[2]/div[1]/div[1]/div[5]/div[1]/a[2]/span[1]")
    WebElement addCompare;

    public void addToCompare() throws InterruptedException {
        items.get(0).click();
        addCompare.click();
        homePage.click();
        // Add second item to compare
        items.get(1).click();
        addCompare.click();

    }

}
