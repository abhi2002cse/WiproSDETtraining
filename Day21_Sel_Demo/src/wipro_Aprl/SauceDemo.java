package wipro_Aprl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) throws InterruptedException {
		// Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open Website
        driver.get("https://www.saucedemo.com/");

        // Maximize Browser
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        // Enter Username
        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        Thread.sleep(1000);
        
        // Enter Password
        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        Thread.sleep(1000);
        
        // Click Login Button
        driver.findElement(By.id("login-button"))
              .click();

        Thread.sleep(3000);
        // Print Page Title
        System.out.println(driver.getTitle());

        // Close Browser
        driver.quit();
	}
}
