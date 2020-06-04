package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import waits.WaitForElement;

public class LoginPage extends BasePage {

    public LoginPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    @FindBy(css = "#Content > ul > li")
    WebElement warningMessage;

    public String getWarningMessage() {
        WaitForElement.waitUntilElementIsVisible(warningMessage);
        String text = warningMessage.getText();
        log().info("Returned warning message was: {}", text);
        return text;
    }
}
