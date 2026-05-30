package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/webtables");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("addNewRecordButton")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstName"))
		.sendKeys("Abhishek");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName"))
		.sendKeys("Singh");
		Thread.sleep(2000);
		driver.findElement(By.id("userEmail"))
		.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("age"))
		.sendKeys("25");
		Thread.sleep(2000);
		driver.findElement(By.id("salary"))
		.sendKeys("50000");
		Thread.sleep(2000);
		driver.findElement(By.id("department"))
		.sendKeys("QA");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		
		System.out.println("Record Added");
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
