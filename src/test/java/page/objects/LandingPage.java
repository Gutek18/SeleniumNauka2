package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import page.objects.MainPage.LeftMenu;
import waits.WaitForElement;

public class LandingPage extends BasePage {

    public LandingPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }
    @FindBy(css = "#Content > p:nth-child(2) > a")
    WebElement enterTheStoreButton;

    public LeftMenu clickingOnEnterButton() {
        WaitForElement.waitUntilElementIsClickable(enterTheStoreButton);
        enterTheStoreButton.click();
        log().info("Enter the store");
        return new LeftMenu();
    }

}
