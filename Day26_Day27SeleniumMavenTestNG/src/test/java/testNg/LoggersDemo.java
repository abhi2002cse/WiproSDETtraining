package testNg;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggersDemo {

    // Create Logger Object

    static Logger log = LogManager.getLogger(LoggersDemo.class);

    public static void main(String[] args) throws Exception {

        // Starting Test

        log.info("Test Execution Started");

        // Launch Browser

        WebDriver driver = new ChromeDriver();

        log.info("Chrome Browser Launched");

        // Maximize Browser

        driver.manage().window().maximize();

        log.info("Browser Maximized");

        // Open Website

        driver.get("https://www.saucedemo.com");

        log.info("SauceDemo Website Opened");

        // Wait

        Thread.sleep(2000);

        // Enter Username

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        log.info("Username Entered");

        // Enter Password

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        log.info("Password Entered");

        // Click Login

        driver.findElement(By.id("login-button"))
              .click();

        log.info("Login Button Clicked");

        // Wait After Login

        Thread.sleep(3000);

        // Print Success Message

        log.info("Login Successful");

        // Close Browser

        driver.quit();

        log.info("Browser Closed");

        // End Test

        log.info("Test Execution Finished");
    }
}