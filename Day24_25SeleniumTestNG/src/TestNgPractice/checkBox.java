package TestNgPractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demoqa.com/checkbox");

        driver.findElement(
                By.cssSelector(".rct-option-expand-all")
        ).click();

        driver.findElement(
                By.xpath("//span[text()='Desktop']")
        ).click();

        driver.quit();
    }
}