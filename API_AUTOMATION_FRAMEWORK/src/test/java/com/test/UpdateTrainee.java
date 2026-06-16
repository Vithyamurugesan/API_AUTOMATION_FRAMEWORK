package com.test;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UpdateTrainee {

    @Test
    public void updateTrainee() {

        Map<String, Object> payload = new HashMap<>();

        payload.put("id", "1");
        payload.put("name", "Vithya");
        payload.put("email", "vithya@gmail.com");
        payload.put("company", "Zoho");

        RestAssured
            .given()
                .contentType("application/json")
                .body(payload)

            .when()
                .put("http://localhost:3000/trainees/1")

            .then()
                .statusCode(200)
                .log().all();
    }
}