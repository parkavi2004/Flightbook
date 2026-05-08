package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasePage extends BasePage {

    By nameField = By.id("inputName");

    By addressField = By.id("address");

    By cityField = By.id("city");

    By stateField = By.id("state");

    By zipField = By.id("zipCode");

    By cardField = By.id("creditCardNumber");

    By purchaseButton = By.xpath("//input[@value='Purchase Flight']");

    By successMessage =
            By.xpath("//h1");

    public PurchasePage(WebDriver driver) {

        super(driver);
    }

    public void fillPassengerDetails(
            String name,
            String address,
            String city,
            String state,
            String zip,
            String card) {

        driver.findElement(nameField).sendKeys(name);

        driver.findElement(addressField).sendKeys(address);

        driver.findElement(cityField).sendKeys(city);

        driver.findElement(stateField).sendKeys(state);

        driver.findElement(zipField).sendKeys(zip);

        driver.findElement(cardField).sendKeys(card);
    }

    public void clickPurchaseFlight() {

        driver.findElement(purchaseButton).click();
    }

    public String getSuccessMessage() {

        return driver.findElement(successMessage).getText();
    }

    public String getPageTitle() {

        return driver.getTitle().toLowerCase();
    }
}