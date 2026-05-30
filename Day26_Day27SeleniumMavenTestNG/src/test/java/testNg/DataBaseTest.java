package testNg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataBaseTest {

    public static void main(String[] args) throws Exception {

        String url = "jdbc:mysql://localhost:3306/seleniumdb";

        String user = "root";

        String pass = "ronaldo@02";

        Connection con = DriverManager.getConnection(url, user, pass);

        System.out.println("Connection Successful");

        Statement stmt = con.createStatement(); //used to run sql query

        ResultSet rs = stmt.executeQuery("SELECT * FROM login_data");

        while (rs.next()) {

            String username = rs.getString("username");

            String password = rs.getString("password");

            System.out.println(username + " " + password);

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.saucedemo.com");

            Thread.sleep(2000);

            driver.findElement(By.id("user-name"))
                    .sendKeys(username);

            driver.findElement(By.id("password"))
                    .sendKeys(password);

            driver.findElement(By.id("login-button"))
                    .click();

            Thread.sleep(5000);

            driver.quit();
        }

        con.close();
    }
}