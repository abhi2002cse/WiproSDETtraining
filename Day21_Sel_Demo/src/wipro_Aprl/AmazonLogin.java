package wipro_Aprl;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin 
{
    public static void main(String[] args) throws InterruptedException 
    {
        //  Initialize the Chrome driver
        WebDriver driver = new ChromeDriver();
        
        
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        
        
        Thread.sleep(5000);
        
        
        WebElement emailField = driver.findElement(By.id("ap_email"));
        emailField.sendKeys("abhshek112@gmail.com"); // 
        
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
        
       
        Thread.sleep(3000);
        
      
        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys("Ronaldo@02"); // 
        
        WebElement signInButton = driver.findElement(By.id("signInSubmit"));
        signInButton.click();
        
        
        Thread.sleep(5000);
        System.out.println("Page Title after login attempt: " + driver.getTitle());
        
        driver.quit();
    }
}
