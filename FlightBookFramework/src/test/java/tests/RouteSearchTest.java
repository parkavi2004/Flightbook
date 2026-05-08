package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.FlightListPage;
import pages.HomePage;

public class RouteSearchTest
        extends BaseTest {

    @DataProvider(name = "flightData")

    public Object[][] getData() {

        return new Object[][]{

                {"Boston", "Rome"},
                {"Paris", "London"},
                {"Mexico City", "Dublin"}
        };
    }

    @Test(dataProvider = "flightData")

    public void verifyRoutes(
            String from,
            String to) {

        HomePage home =
                new HomePage(driver);

        home.selectDeparture(from);

        home.selectDestination(to);

        home.clickFindFlights();

        FlightListPage flights =
                new FlightListPage(driver);

        Assert.assertTrue(
                flights.getFlightCount() > 0);
    }
}