package org.example;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.utils.jsonFileReader;
import org.testng.annotations.Test;
import pojo.endpoints;

public class createUserTestPositive extends BaseTest {
    private static Logger Log = LogManager.getLogger(createUserTestPositive.class.getName());

    @Test
    @Description("Verify that Status code is 200 when we Create a new GitHub RequestPayloads of User")
    @Owner("Abhishek")
    @Severity(SeverityLevel.CRITICAL)
    public void testPostCreateUser(){
       RestAssured.given().log().all().spec(userSpec)
                .body(jsonFileReader.jsonfileParse("post_users.json"))
                .when()
                .post(endpoints.createUser)
                .then()
                .assertThat()
                .statusCode(201);



    }



}
