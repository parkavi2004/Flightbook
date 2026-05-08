package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import utils.DriverFactory;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class TestListener
        implements ITestListener {

    @Override
    public void onTestFailure(
            ITestResult result) {

        WebDriver driver =
                DriverFactory.initDriver();

        File src =
                ((TakesScreenshot) driver)
                        .getScreenshotAs(
                                OutputType.FILE);

        String path =
                "screenshots/"
                        + result.getName()
                        + ".png";

        File dest =
                new File(path);

        try {

            FileUtils.copyFile(src, dest);
        }

        catch (IOException e) {

            e.printStackTrace();
        }
    }

    @Override
    public void onStart(
            ITestContext context) {

        System.out.println(
                "Test Started");
    }

    @Override
    public void onFinish(
            ITestContext context) {

        System.out.println(
                "Test Finished");
    }
}