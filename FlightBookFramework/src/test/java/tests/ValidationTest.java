package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FlightListPage;
import pages.HomePage;
import pages.PurchasePage;

public class ValidationTest extends BaseTest {

    @Test
    public void verifyEmptyNameValidation() {

        HomePage home = new HomePage(driver);

        home.selectDeparture("Boston");

        home.selectDestination("Rome");

        home.clickFindFlights();

        FlightListPage flight =
                new FlightListPage(driver);

        flight.chooseFlight();

        PurchasePage purchase =
                new PurchasePage(driver);

        purchase.fillPassengerDetails(
                "",
                "Chennai",
                "Chennai",
                "TN",
                "600001",
                "123456789"
        );

        purchase.clickPurchaseFlight();

        String title =
                purchase.getPageTitle();

        System.out.println(title);

        Assert.assertTrue(
                title.contains("blazedemo"),
                "Validation failed"
        );
    }
}