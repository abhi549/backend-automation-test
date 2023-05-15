package org.example;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import pojo.campaignRequestBuilder;
import pojo.endpoints;

import static pojo.endpoints.password;
import static pojo.endpoints.username;

public class createCampaign extends BaseTest{
    private static Logger Log = LogManager.getLogger(createCampaign.class.getName());
    //campaignRequestBuilder crb = new campaignRequestBuilder();

    @Test
    @Description("Verify that Status code is 200 when we Create a new Email Campaign")
    @Owner("Abhishek")
    @Severity(SeverityLevel.CRITICAL)
    public void testPostCreateCampaign(){

        RestAssured.given().log().all().spec(userSpec.auth().preemptive().basic(username, password))
                .body(campaignRequestBuilder.campaignrequestPayload())
                .when()
                .post(endpoints.postCreateCampaign)
                .then()
                .assertThat()
                .statusCode(200);



    }

}
