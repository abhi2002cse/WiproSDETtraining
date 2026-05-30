package restApi;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class SortUserTest {

    @Test
    public void sortUsers() {

        given()

        .queryParam("sortBy", "firstName")
        .queryParam("order", "asc")

        .when()
            .get("https://dummyjson.com/users")

        .then()
            .statusCode(200)
            .log().all();
    }
}