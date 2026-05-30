package seleniumMavenProject;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightBooking {

    public static void main(String[] args) throws InterruptedException {

        // CROSS BROWSER TESTING

        String browser = "chrome";

        WebDriver driver = null;

        if(browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        else if(browser.equalsIgnoreCase("edge")) {

            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        // MAXIMIZE
        driver.manage().window().maximize();

        // IMPLICIT WAIT
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // EXPLICIT WAIT
        WebDriverWait wait = new WebDriverWait(driver,
                Duration.ofSeconds(20));

        // OPEN WEBSITE
        driver.get("https://phptravels.net/");
        Thread.sleep(5000);

        
        // CLICK FLIGHTS
        

        WebElement flightsTab = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(.,'Flights')]")));

        flightsTab.click();
        
        // SOURCE CITY
       

        WebElement from =
                wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("(//input[@type='search'])[1]")));

        from.click();

        from.sendKeys("Delhi");

        Thread.sleep(2000);

        from.sendKeys(Keys.ARROW_DOWN);
        from.sendKeys(Keys.ENTER);

       
        // DESTINATION CITY
        

        WebElement to =
                wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("(//input[@type='search'])[2]")));

        to.click();

        to.sendKeys("Mumbai");

        Thread.sleep(2000);

        to.sendKeys(Keys.ARROW_DOWN);
        to.sendKeys(Keys.ENTER);

        
        // CALENDAR HANDLING
       

        driver.findElement(By.id("departure"))
              .click();

        // SELECT DATE
        driver.findElement(By.xpath("//div[contains(@class,'day') and text()='25']"))
              .click();

       
        // PASSENGERS
        

        driver.findElement(By.xpath("//a[contains(@class,'dropdown-toggle')]"))
              .click();

        // ADD ADULTS
        driver.findElement(By.xpath("(//button[contains(@class,'qtyInc')])[1]"))
              .click();

        // ADD CHILD
        driver.findElement(By.xpath("(//button[contains(@class,'qtyInc')])[2]"))
              .click();

        
        // SEARCH FLIGHTS

        driver.findElement(By.id("flights-search"))
              .click();

        // SYNCHRONIZATION

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class,'theme-search-results-item')]")));

        // SELECT FIRST FLIGHT

        driver.findElement(By.xpath("(//button[contains(text(),'Book Now')])[1]"))
              .click();

        // BOOKING VALIDATION

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h3")));

        String bookingPageText =
                driver.findElement(By.xpath("//h3"))
                      .getText();

        System.out.println("Booking Page Opened : " + bookingPageText);

        // VALIDATION

        if(bookingPageText.contains("Booking")) {

            System.out.println("Flight Booking Flow Successful");

        } else {

            System.out.println("Flight Booking Failed");
        }

        // DYNAMIC BOOKING ID
        

        try {

            WebElement bookingID =
                    driver.findElement(By.xpath("//*[contains(text(),'Booking ID')]"));

            System.out.println("Booking ID Found : "
                    + bookingID.getText());

        } catch(Exception e) {

            System.out.println("Booking ID not generated yet");
        }

        // WAIT
        Thread.sleep(5000);

        // CLOSE
        driver.quit();
    }
}
