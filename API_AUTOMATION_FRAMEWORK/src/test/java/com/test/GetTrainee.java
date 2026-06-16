package com.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetTrainee {

    @Test
    public void getTrainee() {

        RestAssured
            .given()

            .when()
                .get("http://localhost:3000/trainees/1")

            .then()
                .statusCode(200)
                .log().all();
    }
}