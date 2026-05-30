package restApi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetUserTest {

    @Test
    public void getUsers() {

        given()

        .when()
            .get("https://dummyjson.com/users/1")

        .then()
            .statusCode(200)
            .log().all();
    }
}