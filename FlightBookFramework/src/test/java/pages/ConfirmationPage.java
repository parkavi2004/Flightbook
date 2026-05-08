package pages;

import base.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage
        extends BasePage {

    public ConfirmationPage(
            WebDriver driver) {

        super(driver);

        PageFactory.initElements(
                driver,
                this);
    }

    @FindBy(tagName = "h1")

    WebElement confirmationText;

    public String getConfirmationText() {

        return confirmationText.getText();
    }
}