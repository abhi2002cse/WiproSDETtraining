package TestNgPractice;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchrImplicit {
	
	 public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        // Implicit Wait
	        driver.manage().timeouts()
	              .implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://demoqa.com/dynamic-properties");

	        // This element appears after 5 sec
	        driver.findElement(By.id("visibleAfter"));

	        // Now button becomes enabled
	        driver.findElement(By.id("enableAfter")).click();

	        System.out.println("Button Clicked");

	        driver.quit();
	    }

}
