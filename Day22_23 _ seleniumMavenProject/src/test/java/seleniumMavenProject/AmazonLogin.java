package seleniumMavenProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open Amazon
        driver.get("https://www.amazon.in/");

        // Maximize Window
        driver.manage().window().maximize();

        // Wait for 2 seconds
        Thread.sleep(2000);

        // Click Sign In
        driver.findElement(By.id("nav-link-accountList"))
              .click();

        // Wait
        Thread.sleep(2000);

        // Enter Mobile Number or Email
        driver.findElement(By.id("ap_email"))
              .sendKeys("abhshek112@gmail.com");

        // Click Continue
        driver.findElement(By.id("continue"))
              .click();

        // Wait
        Thread.sleep(2000);

        // Enter Password
        driver.findElement(By.id("ap_password"))
              .sendKeys("Ronaldo@02");

        // Click Sign In
        driver.findElement(By.id("signInSubmit"))
              .click();

        // Wait for login
        Thread.sleep(5000);

        // Print Title
        System.out.println(driver.getTitle());

        // Close Browser
        driver.quit();
    }
}
