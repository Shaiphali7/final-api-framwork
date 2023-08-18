package com.virgingames.virgingameinfo;

import com.virgingames.testbase.TestBase;
import jxl.common.Assert;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;
@RunWith(SerenityRunner.class)
public class VirginGameCURDTest extends TestBase {
    @Title("This will get all name which have GBP currency")
    @Test
    public void getAllNameHavingCurrencyGBP() {
        List<String> actualCurrency = SerenityRest.given()
                .headers("Content-Type", "application/json")
                .queryParams("currency", "GBP")
                .when()
                .get()
                .then().log().all().statusCode(200)
                .extract().path("data.pots.currency");
        //Verifying the currency is GBP
        for (String output : actualCurrency) {
            Assert.verify(output.equals("GBP"), "GBP");

        }
    }
}