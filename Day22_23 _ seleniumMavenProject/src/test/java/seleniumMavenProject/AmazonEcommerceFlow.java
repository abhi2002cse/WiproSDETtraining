package seleniumMavenProject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonEcommerceFlow {

    public static void main(String[] args)
            throws InterruptedException {

        
        WebDriver driver =
                new ChromeDriver();

     
        driver.get("https://www.amazon.in/");

        
        driver.manage().window()
              .maximize();

       
        Thread.sleep(3000);

        // ---------------- LOGIN ----------------

       
        driver.findElement(
          By.id("nav-link-accountList"))
              .click();

     
        Thread.sleep(2000);

       
        driver.findElement(
          By.id("ap_email"))
              .sendKeys("abhshek112@gmail.com");

        
        driver.findElement(
          By.id("continue"))
              .click();

        
        Thread.sleep(2000);

       
        driver.findElement(
          By.id("ap_password"))
              .sendKeys("Crisronaldo@02");

       
        driver.findElement(
          By.id("signInSubmit"))
              .click();

        
        Thread.sleep(5000);

        // ---------------- ADD TO CART ----------------

        
        driver.findElement(
          By.cssSelector("img"))
              .click();

        
        Thread.sleep(5000);

       
        for (String windowHandle :
                driver.getWindowHandles()) {

            driver.switchTo()
                  .window(windowHandle);
        }

       
        driver.findElement(
          By.id("add-to-cart-button"))
              .click();

       
        Thread.sleep(5000);

        // ---------------- VALIDATION ----------------

        String pageTitle =
                driver.getTitle();

        // Validate Cart Page
        if (pageTitle.contains("Amazon")) {

            System.out.println(
              "Product Added To Cart Successfully");

        } else {

            System.out.println(
              "Add To Cart Failed");
        }

     
        Thread.sleep(3000);

      
        driver.quit();
    }
}