package currencyCalculation;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import stepObjects.CalculationSteps;

public class CurrencyCalculation {
    CalculationSteps calculationSteps = new CalculationSteps();
    @BeforeMethod
    public void beforeMethod(){
        Selenide.open("https://www.paysera.bg/v2/en-LT/fees/currency-conversion-calculator");
    }

    @Test(priority = 1)
    @Description("When user fills BUY amount,SELL amount box is being emptied and vice versa")
    public void CheckingBuyAndSellFields() throws InterruptedException {
        calculationSteps.checkTheSellField("100")
                .checkTheBuyField("100");

    }
    @Test(priority = 2)
    @Description("When user selects country, rates must be updated and currency option should be changed")
    public void changeCountry() throws InterruptedException {
        calculationSteps.clickLocalizationPopover()
                .clickCountry().
                selectUnitedKingdom()
                .assertCurrency();
    }
    @Test(priority = 3)
    @Description("When bank provider's exchange amount for selling is lower" +
            " than the amount, provided by Paysera, then a text box is displayed, representing the loss")
    public void checkTheLoss(){
        calculationSteps.clickLocalizationPopover()
                .clickCountry()
                .selectLatvia()
                .enterSellNumber("500")
                .clickFilterButton()
                .theLossVisibilityAssert();
    }
    @Test()
    @Description("When we press the clear filter, all fields should return to their default state")
    public void CheckingTheClearFilter(){
        calculationSteps.changeEurCurrency()
                .clickClearFilterButton()
                .assertEurField();
    }
}
