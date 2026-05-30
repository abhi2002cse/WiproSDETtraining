package seleniumMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankLogin {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://parabank.parasoft.com/parabank/register.htm");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("customer.firstName")).sendKeys("Abhishek ");
		 Thread.sleep(2000);
		 driver.findElement(By.id("customer.lastName")).sendKeys("Singh ");
		 Thread.sleep(2000);
		 driver.findElement(By.id("customer.address.street")).sendKeys("Bitupur g-town ");
		 Thread.sleep(2000);
		 driver.findElement(By.id("customer.address.city")).sendKeys("Jamshedpur ");
		 Thread.sleep(2000);
		 driver.findElement(By.id("customer.address.state")).sendKeys("Jharkhand ");
		 Thread.sleep(2000);
		 driver.findElement(By.id("customer.address.zipCode")).sendKeys("4564 ");
		 Thread.sleep(2000);
		 driver.findElement(By.id("customer.phoneNumber")).sendKeys("8002997467 ");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("customer.ssn")).sendKeys("123456789 ");
		 Thread.sleep(2000);
		 driver.findElement(By.id("customer.username")).sendKeys("abhishek12345 ");
		 Thread.sleep(2000);
		 driver.findElement(By.id("customer.password")).sendKeys("Password123 ");
		 Thread.sleep(2000);
		 driver.findElement(By.id("repeatedPassword")).sendKeys("Password123 ");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@value = 'Register']")).click();
		 Thread.sleep(3000);
		 
		 System.out.println("Account Registered Successfully");
		 driver.quit();
		 
	}
}
