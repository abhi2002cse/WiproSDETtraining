package restApi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class FilterUserTest {

    @Test
    public void filterUsers() {

        given()

        .queryParam("limit", 5)

        .when()
            .get("https://dummyjson.com/users")

        .then()
            .statusCode(200)
            .log().all();
    }
}
