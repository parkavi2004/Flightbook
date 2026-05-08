package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConfirmationPage;
import pages.FlightListPage;
import pages.HomePage;
import pages.PurchasePage;

public class PurchaseTest extends BaseTest {

    @Test
    public void verifyFlightPurchase() {

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
                "Parkavi",
                "Chennai",
                "Chennai",
                "Tamil Nadu",
                "600001",
                "123456789"
        );

        purchase.clickPurchaseFlight();

        ConfirmationPage confirm =
                new ConfirmationPage(driver);

        Assert.assertTrue(
                confirm.getConfirmationText()
                        .contains("Thank you"),
                "Purchase Failed"
        );
    }
}