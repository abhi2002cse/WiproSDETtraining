package seleniumMavenProject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        Thread.sleep(3000);

        System.out.println(driver.getTitle());

        driver.quit();
    }
}