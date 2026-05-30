package wipro_Aprl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome 
        WebDriver driver = new ChromeDriver();

        // Maximize Browser
        driver.manage().window().maximize();

        // Open OrangeHRM 
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Wait for page to load
        Thread.sleep(3000);

        // Enter UserName
        driver.findElement(By.name("username"))
              .sendKeys("Admin");

        // Enter Password
        driver.findElement(By.name("password"))
              .sendKeys("admin123");

        // Click Login Button
        driver.findElement(By.xpath("//button[@type='submit']"))
              .click();

        // Wait after login
        Thread.sleep(5000);

        // Print Page Title
        System.out.println(driver.getTitle());

        // Close Browser
        driver.quit();
    }
}