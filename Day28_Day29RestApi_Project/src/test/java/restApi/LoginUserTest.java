package restApi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class LoginUserTest {

    @Test
    public void loginUser() {

        String body = "{\n"
                + "\"username\":\"emilys\",\n"
                + "\"password\":\"emilyspass\",\n"
                + "\"expiresInMins\":30\n"
                + "}";

        String token =

        given()

            .header("Content-Type", "application/json")
            .body(body)

        .when()

            .post("https://dummyjson.com/user/login")

        .then()

            .statusCode(200)
            .log().all()

            .extract()
            .path("accessToken");

        System.out.println("Generated Token is: " + token);

    }
}