package page.objects;

import driver.manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waits.WaitForElement;

public class ShoppingCartPage extends BasePage {

    public ShoppingCartPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(css = "#Cart > a")
    WebElement clickingProceedToCheckoutButton;

    public LoginPage proceedToCheckoutButton() {
        WaitForElement.waitUntilElementIsClickable(clickingProceedToCheckoutButton);
        clickingProceedToCheckoutButton.click();
        log().info("click on Proceed button");
        return new LoginPage();
    }
}
