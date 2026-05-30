package restApi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class UserAuthTest {

    @Test
    public void authUser() {

        String token =
        given()

            .header("Content-Type", "application/json")
            .body("{\"username\":\"emilys\",\"password\":\"emilyspass\"}")

        .when()
            .post("https://dummyjson.com/auth/login")

        .then()
            .statusCode(200)
            .extract()
            .path("accessToken");



        given()

            .header("Authorization", "Bearer " + token)

        .when()
            .get("https://dummyjson.com/auth/me")

        .then()
            .statusCode(200)
            .log().all();
    }
}