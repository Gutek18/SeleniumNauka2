package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class FishPage extends BasePage {

    public FishPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(css = "#Catalog > table > tbody > tr:nth-child(2) > td:nth-child(1) > a")
    WebElement angelfishButton;
    @FindBy(css = "#Catalog > table > tbody > tr:nth-child(3) > td:nth-child(1) > a")
    WebElement tigerSharkButton;
    @FindBy(css = "#Catalog > table > tbody > tr:nth-child(4) > td:nth-child(1) > a")
    WebElement koiButton;
    @FindBy(css = "#Catalog > table > tbody > tr:nth-child(5) > td:nth-child(1) > a")
    WebElement goldfishButton;

    public AngelfishPage clickingAngelfishButton() {
        WaitForElement.waitUntilElementIsClickable(angelfishButton);
        angelfishButton.click();
        log().info("click on Angel fish button");
        return new AngelfishPage();
    }

    public void clickingTigerSharkButton() {
        WaitForElement.waitUntilElementIsClickable(tigerSharkButton);
        tigerSharkButton.click();
    }

    public void clickingKoiButton() {
        WaitForElement.waitUntilElementIsClickable(koiButton);
        koiButton.click();
    }

    public void clickingGoldGishButton() {
        WaitForElement.waitUntilElementIsClickable(goldfishButton);
        goldfishButton.click();
    }
}
