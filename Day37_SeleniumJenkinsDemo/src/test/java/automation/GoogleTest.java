package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void verifyGoogleTitle() {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains("Google"));

        driver.quit();
    }
}
