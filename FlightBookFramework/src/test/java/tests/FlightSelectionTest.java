package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FlightListPage;
import pages.HomePage;
import pages.PurchasePage;

public class FlightSelectionTest extends BaseTest {

    @Test
    public void verifyFlightSelection() {

        HomePage home = new HomePage(driver);

        home.selectDeparture("Boston");
        home.selectDestination("Rome");
        home.clickFindFlights();

        FlightListPage flight = new FlightListPage(driver);

        flight.chooseFlight();

        PurchasePage purchase = new PurchasePage(driver);

        String title = purchase.getPageTitle();

        System.out.println("Page Title = " + title);

        Assert.assertTrue(
                title.contains("purchase"),
                "Flight selection failed"
        );
    }
}