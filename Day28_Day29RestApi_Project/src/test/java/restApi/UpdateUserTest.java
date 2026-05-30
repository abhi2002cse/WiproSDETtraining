package restApi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class UpdateUserTest {

    @Test
    public void updateUser() {

        String body = "{\n"
                + "\"lastName\":\"Owais\"\n"
                + "}";

        given()

            .header("Content-Type", "application/json")
            .body(body)

        .when()

            .put("https://dummyjson.com/users/2")

        .then()

            .statusCode(200)
            .log().all();

    }
}