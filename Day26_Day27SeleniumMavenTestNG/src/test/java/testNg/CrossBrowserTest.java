package testNg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

    WebDriver driver;

    @Test
    @Parameters("browser")

    public void launchBrowser(String browserName) throws InterruptedException {

        // Chrome
        if(browserName.equalsIgnoreCase("chrome")) {

            driver = new ChromeDriver();
        }

        // Edge
        else if(browserName.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();
        }

        // Firefox
        else if(browserName.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();
        }

        // Open Website
        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        System.out.println("Title is : " + driver.getTitle());

        Thread.sleep(3000);

        driver.quit();
    }
}
