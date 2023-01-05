package stepObjects;

import com.codeborne.selenide.Condition;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import org.testng.Assert;
import pageObjects.CalculationPage;



public class CalculationSteps {
    CalculationPage calculationPage = new CalculationPage();

    @Step("SELL amount box must be empty")
    public CalculationSteps checkTheSellField(String sellNumber){
        calculationPage.getBuyField().sendKeys(sellNumber);
        calculationPage.getSellField().shouldBe(Condition.empty);
        return this;
    }
    @Step("enter sell number")
    public CalculationSteps enterSellNumber(String sellNumber){
        calculationPage.getBuyField().sendKeys(sellNumber);
        return this;
    }

    @Step("BUY amount box must be empty")
    public CalculationSteps checkTheBuyField(String buyNumber){
        calculationPage.getSellField().sendKeys(buyNumber);
        calculationPage.getBuyField().shouldBe(Condition.empty);
        return this;
    }
    @Step("click localization popover")
    public CalculationSteps clickLocalizationPopover(){
        calculationPage.getLocalizationPopover().click();
        return this;
    }
    @Step("click country dropdown")
    public CalculationSteps clickCountry(){
        calculationPage.getCountriesDropdown().click();
        return this;
    }
    @Step("select United Kingdom")
    public CalculationSteps selectUnitedKingdom() throws InterruptedException {
       calculationPage.getUnitedKingdom().click();
        return this;
    }
    @Step("select latvia")
    public CalculationSteps selectLatvia(){
        calculationPage.getLatvia().click();
        return this;
    }
    @Step("checking the existence of currency")
    public CalculationSteps assertCurrency(){
        calculationPage.getUnitedKingdomCurrency().shouldHave(Condition.text("GBP"));
        return this;
    }
    @Step
    public CalculationSteps theLossVisibilityAssert(){
        Assert.assertFalse(calculationPage.getLoss().text().isEmpty());
        return this;
    }
    @Step("change Eur currency")
    public CalculationSteps changeEurCurrency(){
        calculationPage.getEUR().click();
        calculationPage.getUsd().click();
        return this;
    }
    @Step("click filter button")
    public CalculationSteps clickFilterButton(){
        calculationPage.getFilterButton().click();
        return this;
    }
    @Step("click clear filter button")
    public CalculationSteps clickClearFilterButton(){
        calculationPage.getClearFilterButton().click();
        return this;
    }
    public CalculationSteps assertEurField(){
        Selenide.sleep(5000);
        calculationPage.getEUR().shouldBe(Condition.exist);
        return this;
    }


}
