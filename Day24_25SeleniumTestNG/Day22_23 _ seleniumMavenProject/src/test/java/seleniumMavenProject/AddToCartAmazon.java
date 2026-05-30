package seleniumMavenProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartAmazon {

    public static void main(String[] args) throws InterruptedException {

        
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://www.amazon.in/");

        
        driver.manage().window().maximize();

       
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("img"))
              .click();

        
        Thread.sleep(5000);

       
        for (String windowHandle : driver.getWindowHandles()) {

            driver.switchTo().window(windowHandle);
        }

        
        driver.findElement(By.id("add-to-cart-button"))
              .click();

      
        Thread.sleep(5000);

        // Close Browser
        driver.quit();
    }
}