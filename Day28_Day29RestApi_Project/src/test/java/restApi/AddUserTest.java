package restApi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class AddUserTest {

    @Test
    public void addUser() {

        String body = "{ \"firstName\": \"Abhishek\" }";

        given()

        .header("Content-Type", "application/json")
        .body(body)

        .when()
            .post("https://dummyjson.com/users/add")

        .then()
            .statusCode(201)
            .log().all();
    }
}