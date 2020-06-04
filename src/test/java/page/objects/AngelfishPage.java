package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class AngelfishPage extends BasePage{

    public AngelfishPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(css = "#Catalog > table > tbody > tr:nth-child(2) > td:nth-child(1) > a")
    WebElement largeAngelFishItemId;
    @FindBy(css = "#Catalog > table > tbody > tr:nth-child(3) > td:nth-child(1) > a")
    WebElement smallAngelFishItemId;
    @FindBy(css = "#Catalog > table > tbody > tr:nth-child(2) > td:nth-child(5) > a")
    WebElement addToCardLargeAngelFish;
    @FindBy(css = "#Catalog > table > tbody > tr:nth-child(3) > td:nth-child(5) > a")
    WebElement addToCardSmallAngelFish;

    public void addToCardLargeAngelFish() {
        WaitForElement.waitUntilElementIsClickable(addToCardLargeAngelFish);
        addToCardLargeAngelFish.click();
    }

    public ShoppingCartPage addToCardSmallAngelFish() {
        WaitForElement.waitUntilElementIsClickable(addToCardSmallAngelFish);
        addToCardSmallAngelFish.click();
        log().info("Click on add to card button");
        return new ShoppingCartPage();

    }
}
