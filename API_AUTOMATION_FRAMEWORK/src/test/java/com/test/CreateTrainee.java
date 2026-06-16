package com.test;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateTrainee {

    @Test
    public void createTrainee() {

        Map<String, Object> payload = new HashMap<>();

        payload.put("name", "Vithya");
        payload.put("email", "vithya@gmail.com");
        payload.put("company", "ExpleoSolution");

        RestAssured
            .given()
                .contentType("application/json")
                .body(payload)

            .when()
                .post("http://localhost:3000/trainees")

            .then()
                .statusCode(201)
                .log().all();
    }
}