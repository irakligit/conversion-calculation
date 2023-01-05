package pageObjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.tagName;


public class CalculationPage {

    private SelenideElement sellField = $("[data-ng-model = 'currencyExchangeVM.filter.from_amount']");
    private SelenideElement buyField = $("[data-ng-model = 'currencyExchangeVM.filter.to_amount']");
    private SelenideElement localizationPopover = $(".js-localization-popover");
    private SelenideElement countriesDropdown = $("#countries-dropdown");

    private SelenideElement unitedKingdom = $x("//*[@class=\"dropdown-menu\"]/li//a[contains(@href,'https://www.paysera.com/v2/en-GB/fees/currency-conversion-calculator')]");

    private SelenideElement latvia = $x("//*[@class=\"dropdown-menu\"]/li//a[contains(@href,'https://www.paysera.lv/v2/en-LV/fees/currency-conversion-calculator')]");
    private SelenideElement unitedKingdomCurrency = $x("//*[text()=\"GBP\"]");

    private SelenideElement eur = $x("//*[text()=\"EUR\"]");
    private SelenideElement usd = $x("//*[text()=\"USD\"]");
    private SelenideElement loss = $x("//table/tbody/tr[1]/td[5]/span/span/span[2]");
    private SelenideElement filterButton = $("[data-ng-click='currencyExchangeVM.filterExchangeRates()']");
    private SelenideElement clearFilterButton = $("[data-ng-click='currencyExchangeVM.clearFilter()']");


    public SelenideElement getClearFilterButton() {
        return clearFilterButton;
    }
    public SelenideElement getEUR() {
        return eur;
    }
    public SelenideElement getUsd() {
        return usd;
    }
    public SelenideElement getFilterButton() {
        return filterButton;
    }

    public SelenideElement getLoss() {
        return loss;
    }

    public SelenideElement getLatvia() {
        return latvia;
    }

    public SelenideElement getUnitedKingdomCurrency() {
        return unitedKingdomCurrency;
    }
    public SelenideElement getUnitedKingdom() {
        return unitedKingdom;
    }
    public SelenideElement getCountriesDropdown() {
        return countriesDropdown;
    }

    public SelenideElement getLocalizationPopover() {
        return localizationPopover;
    }

    public SelenideElement getSellField() {
        return sellField;
    }

    public SelenideElement getBuyField() {
        return buyField;
    }
}
