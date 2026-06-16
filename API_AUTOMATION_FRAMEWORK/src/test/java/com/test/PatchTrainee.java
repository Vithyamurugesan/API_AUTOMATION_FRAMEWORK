package com.test;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PatchTrainee {

    @Test
    public void patchTrainee() {

        Map<String, Object> payload = new HashMap<>();

        payload.put("company", "TCS");

        RestAssured
            .given()
                .contentType("application/json")
                .body(payload)

            .when()
                .patch("http://localhost:3000/trainees/1")

            .then()
                .statusCode(200)
                .log().all();
    }
}