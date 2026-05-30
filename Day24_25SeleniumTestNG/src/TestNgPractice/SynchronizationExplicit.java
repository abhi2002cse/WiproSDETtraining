package TestNgPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationExplicit {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/dynamic-properties");

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until button is clickable
        WebElement button = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("enableAfter")));

        // Click button
        button.click();

        System.out.println("Button Clicked Successfully");

        driver.quit();
    }
}
