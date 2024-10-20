package org.api;

import io.restassured.http.ContentType;
import lombok.extern.slf4j.Slf4j;
import org.api.models.GetBetSlipDataCLRequest;
import org.api.models.GetBetSlipDataCLResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@Slf4j
public class Task3Tests extends BaseTests {

//    """
//        Task #3 (API)
//        1. Implement any POST API call from given website: https://s.gsb.co.zm/ (auth is not needed)
//        2. Use devTools -> Network to get data for it
//        3. Validate JSON schema for this API call //todo What should be validated here using JSON schema validation?
//        4. Use serialization/ deserialization for request/ response
//    """

    private static final String ENDPOINT = "/services/clapi/api/Bet/GetBetSlipDataCL";

    @Test
    public void testTask3(){
        var requestBody = new GetBetSlipDataCLRequest();
        requestBody.setBookingCode("123456");

        var response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(ENDPOINT)
                .then()
                .extract().response().as(GetBetSlipDataCLResponse.class);

        log.info("Response: " + response);
    }
}
