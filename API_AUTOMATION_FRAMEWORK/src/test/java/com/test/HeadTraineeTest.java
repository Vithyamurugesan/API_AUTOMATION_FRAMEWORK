package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HeadTraineeTest {

    @Test
    public void headTrainee() {

        Response response = RestAssured
                .given()

                .when()
                .head("http://localhost:3000/trainees/1");

        System.out.println("Status Code: " + response.getStatusCode());

        System.out.println("Content-Type: "
                + response.getHeader("Content-Type"));

        System.out.println("Content-Length: "
                + response.getHeader("Content-Length"));

        Assert.assertEquals(response.getStatusCode(),400 );
    }
}