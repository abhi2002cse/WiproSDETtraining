package seleniumMavenProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoMaven {

    public static void main(String[] args) throws InterruptedException {

        
        WebDriver driver = new ChromeDriver();

        // Open Sauce Demo Website
        driver.get("https://www.saucedemo.com/");

        // Maximize Browser Window
        driver.manage().window().maximize();

        // Pause for 2 seconds
        Thread.sleep(2000);

        // Enter Username
        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        // Enter Password
        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        // Pause for 2 seconds
        Thread.sleep(2000);

        // Click Login Button
        driver.findElement(By.id("login-button"))
              .click();

        // Pause for 3 seconds
        Thread.sleep(3000);

        // Print Page Title
        System.out.println(driver.getTitle());

        // Close Browser
        driver.quit();
    }
}