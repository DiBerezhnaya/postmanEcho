package ru.netology;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;

public class demoTest {

    @Test
    void shouldDemoTest() {
        ValidatableResponse some_data = given()
                .baseUri("https://postman-echo.com")
                .header("Content-Type","application/json")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                ;

    }

}
