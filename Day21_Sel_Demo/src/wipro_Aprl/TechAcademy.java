package wipro_Aprl;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TechAcademy 
{
    public static void main(String[] args) throws InterruptedException 
    {
        // Initialize Chrome Driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        
        driver.get("https://skill-assist.ai/Wipro/"); 
        
        
        Thread.sleep(4000);
        
        
        WebElement emailField = driver.findElement(By.xpath("//input[@type='email' or @type='text']"));
        emailField.sendKeys("YOUR_EMAIL@example.com"); 
        
               WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
        passwordField.sendKeys("YOUR_PASSWORD"); 
        
        Thread.sleep(1000); 
        
        
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'LOGIN') or @type='submit']"));
        loginButton.click();
        
        
        Thread.sleep(6000);
        System.out.println("Dashboard Page Title: " + driver.getTitle());
        System.out.println("Dashboard URL: " + driver.getCurrentUrl());
        
        
        driver.quit();
    }
}