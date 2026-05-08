package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {

        this.driver = driver;
    }

    public void click(WebElement element) {

        element.click();
    }

    public void type(
            WebElement element,
            String text) {

        element.clear();

        element.sendKeys(text);
    }

    public void selectDropdown(
            WebElement element,
            String value) {

        Select select =
                new Select(element);

        select.selectByVisibleText(value);
    }

    public void waitForElement(
            WebElement element) {

        element.isDisplayed();
    }
}