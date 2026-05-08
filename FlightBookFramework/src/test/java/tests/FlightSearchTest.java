package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FlightListPage;
import pages.HomePage;

public class FlightSearchTest extends BaseTest {

    @Test
    public void verifyFlightSearch() {

        HomePage home =
                new HomePage(driver);

        home.selectDeparture("Boston");

        home.selectDestination("Rome");

        home.clickFindFlights();

        FlightListPage flights =
                new FlightListPage(driver);

        Assert.assertTrue(
                flights.getFlightCount() > 0);
    }
}