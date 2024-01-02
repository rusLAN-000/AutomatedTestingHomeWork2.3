package ru.netology.rest;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

class MobileBankApiTestV1 {
    @Test
    void shouldReturnDemoAccounts() {
        // Given - When - Then
        given()
                .baseUri("https://postman-echo.com")
                .body("Test")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("Test"))
        ;
    }
}