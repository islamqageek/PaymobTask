package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    @BeforeSuite
    public void startDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        new WebDriverWait(driver , Duration.ofSeconds(120));


        driver.navigate().to("https://magento.softwaretestingboard.com/");
    }


}
