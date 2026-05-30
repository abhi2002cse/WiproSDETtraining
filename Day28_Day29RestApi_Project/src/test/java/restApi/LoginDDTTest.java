package restApi;
import static io.restassured.RestAssured.*;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class LoginDDTTest 
{
    @DataProvider(name = "loginData")
    public Object[][] getData() throws Exception
    {
        FileInputStream file =
                new FileInputStream("TestData/testdata.xlsx");

        Workbook workbook = new XSSFWorkbook(file);

        Sheet sheet = workbook.getSheetAt(0);

        int rows = sheet.getPhysicalNumberOfRows();

        Object[][] data = new Object[rows - 1][2];

        for(int i = 1; i < rows; i++)
        {
            Row row = sheet.getRow(i);

            data[i - 1][0] =
                    row.getCell(0).getStringCellValue();

            data[i - 1][1] =
                    row.getCell(1).getStringCellValue();
        }

        workbook.close();

        return data;
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username,
                          String password)
    {
        String requestBody = "{\n" +
                "\"username\": \"" + username + "\",\n" +
                "\"password\": \"" + password + "\"\n" +
                "}";

        given()

            .contentType(ContentType.JSON)
            .body(requestBody)

        .when()

            .post("https://dummyjson.com/user/login")

        .then()

            .statusCode(200)
            .log().all();
    }
}