package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame1");
		
		String text;
		
		text = driver.findElement(By.id("sampleHeading")).getText();
		
		System.out.println(text);
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}