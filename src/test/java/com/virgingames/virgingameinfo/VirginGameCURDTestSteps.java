package com.virgingames.virgingameinfo;

import com.virgingames.testbase.TestBase;
import jxl.common.Assert;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;
@RunWith(SerenityRunner.class)
public class VirginGameCURDTestSteps extends TestBase {
    @Steps
    VirginGameSteps virginGame;

    @Title("This will get all name which have GBP currency")
    @Test
    public void test001() {
        List<String> actualCurrency = virginGame.getGameInfoWithCurrency("GBP");
        //Verifying the currency is GBP
        for (String output : actualCurrency) {
            Assert.verify(output.equals("GBP"), "GBP");
        }

    }
    @Title("This will get all name which have EUR currency")
    @Test
    public void test002() {
        List<String> actualCurrency = virginGame.getGameInfoWithCurrency("EUR");
        //Verifying the currency is EUR
        for (String output : actualCurrency) {
            Assert.verify(output.equals("EUR"), "EUR currency");
        }

    }
    @Title("This will get all name which have SEK currency")
    @Test
    public void test003() {
        List<String> actualCurrency = virginGame.getGameInfoWithCurrency("SEK");
        //Verifying the currency is SEK
        for (String output : actualCurrency) {
            Assert.verify(output.equals("SEK"), "SEK currency");
        }

    }
}