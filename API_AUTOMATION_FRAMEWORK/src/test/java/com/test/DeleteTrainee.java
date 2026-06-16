package com.test;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteTrainee {

    @Test
    public void deleteTrainee() {

        RestAssured
            .given()

            .when()
                .delete("http://localhost:3000/trainees/2")

            .then()
                .statusCode(200)
                .log().all();
    }
}