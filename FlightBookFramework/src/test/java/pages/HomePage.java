package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        super(driver);

        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "fromPort")
    WebElement departureDropdown;

    @FindBy(name = "toPort")
    WebElement destinationDropdown;

    @FindBy(xpath = "//input[@value='Find Flights']")
    WebElement findFlightsBtn;

    public void selectDeparture(String city) {

        selectDropdown(departureDropdown, city);
    }

    public void selectDestination(String city) {

        selectDropdown(destinationDropdown, city);
    }

    public void clickFindFlights() {

        click(findFlightsBtn);
    }
}