package TestNgPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		WebElement source;
		WebElement target;
		
		source = driver.findElement(By.id("draggable"));
		
		target = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(source, target).perform();
		
		System.out.println("Drag And Drop Done");
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}