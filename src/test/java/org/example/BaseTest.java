package org.example;

import io.restassured.builder.RequestSpecBuilder;

import static io.restassured.config.LogConfig.logConfig;
import static io.restassured.config.RestAssuredConfig.newConfig;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;
import pojo.endpoints;

public class BaseTest {
    protected RequestSpecification userSpec;
    @BeforeTest(alwaysRun = true)
    protected void setUpConfiguration() {



        userSpec = new RequestSpecBuilder().setBaseUri(endpoints.baseUrl2)
                .setConfig(newConfig().logConfig(logConfig().blacklistHeader("Authorization")))
                .addHeader("Authorization", endpoints.token).setAccept("application/json")
                .setContentType("application/json").build().log().all();
    }


}
