package org.api;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class BaseTests {

    @BeforeTest
    static void setupAllureReports() {
        RestAssured.baseURI = "https://s.gsb.co.zm";
    }
}
