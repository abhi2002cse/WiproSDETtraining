package restApi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class LimitSkipUserTest {

    @Test
    public void limitSkipUsers() {

        given()

        .queryParam("limit", 5)
        .queryParam("skip", 10)

        .when()
            .get("https://dummyjson.com/users")

        .then()
            .statusCode(200)
            .log().all();
    }
}
