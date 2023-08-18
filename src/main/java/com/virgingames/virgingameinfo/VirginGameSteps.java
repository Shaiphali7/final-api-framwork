package com.virgingames.virgingameinfo;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class VirginGameSteps {
//    ValidatableResponse response = SerenityRest.given()
//            .headers("Content-Type", "application/json")
//            .queryParam("currency", currency)
//            .when()
//            .get()
//            .then().log().all().statusCode(200);
//
//    List<String> actualCurrency = response.extract().path("data.pots.currency");
//        for(String output: actualCurrency){
//        Assert.verify(output.equals(currency), currency);
//    }
//        System.out.println(actualCurrency);
//
//        return response;
    @Step("Getting all game information with currency :{0}")
    public List<String> getGameInfoWithCurrency(String currency)
    {

        return SerenityRest.given()
                .headers("Content-Type", "application/json")
                .queryParams("currency", currency)
                .when()
                .get()
                .then().log().all().statusCode(200)
                .extract().path("data.pots.currency");

    }
    }

