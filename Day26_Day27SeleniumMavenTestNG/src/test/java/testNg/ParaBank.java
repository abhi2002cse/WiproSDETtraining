package testNg;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParaBank {

    WebDriver driver;

    String username = "abhishek" + new Random().nextInt(10000);
    String password = "abhishek@123";

    @BeforeMethod
    public void setup() throws Exception {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void registerTest() throws Exception {

        // CLICK REGISTER
        driver.findElement(By.linkText("Register")).click();

        Thread.sleep(2000);

        // ENTER DETAILS
        driver.findElement(By.id("customer.firstName"))
              .sendKeys("Abhishek");

        driver.findElement(By.id("customer.lastName"))
              .sendKeys("Singh");

        driver.findElement(By.id("customer.address.street"))
              .sendKeys("Jamshedpur");

        driver.findElement(By.id("customer.address.city"))
              .sendKeys("Jamshedpur");

        driver.findElement(By.id("customer.address.state"))
              .sendKeys("Jharkhand");

        driver.findElement(By.id("customer.address.zipCode"))
              .sendKeys("831001");

        driver.findElement(By.id("customer.phoneNumber"))
              .sendKeys("9999999999");

        driver.findElement(By.id("customer.ssn"))
              .sendKeys("123456");

        // DYNAMIC USERNAME
        driver.findElement(By.id("customer.username"))
              .sendKeys(username);

        // PASSWORD
        driver.findElement(By.id("customer.password"))
              .sendKeys(password);

        driver.findElement(By.id("repeatedPassword"))
              .sendKeys(password);

        Thread.sleep(2000);

        // CLICK REGISTER BUTTON
        driver.findElement(By.xpath("//input[@value='Register']"))
              .click();

        Thread.sleep(3000);

        // VALIDATION
        String pageText = driver.getPageSource();

        Assert.assertTrue(
                pageText.contains("Your account was created successfully"));

        System.out.println("Register Test Passed");

        System.out.println("Username created : " + username);
    }

    @Test(priority = 2)
    public void loginTest() throws Exception {

        // ENTER USERNAME
        driver.findElement(By.name("username"))
              .sendKeys(username);

        Thread.sleep(1000);

        // ENTER PASSWORD
        driver.findElement(By.name("password"))
              .sendKeys(password);

        Thread.sleep(1000);

        // CLICK LOGIN
        driver.findElement(By.xpath("//input[@value='Log In']"))
              .click();

        Thread.sleep(3000);

        // VALIDATION
        Assert.assertTrue(
                driver.getPageSource().contains("Accounts Overview"));

        System.out.println("Login Test Passed");
    }

    @AfterMethod
    public void tearDown() throws Exception {

        Thread.sleep(2000);

        driver.quit();
    }
}