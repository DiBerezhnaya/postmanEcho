package ru.netology;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class demoTest {

    @Test
    void shouldDemoTest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
        ;

    }

}
