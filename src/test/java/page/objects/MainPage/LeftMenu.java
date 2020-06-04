package page.objects.MainPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.manager.DriverManager;
import page.objects.BasePage;
import page.objects.FishPage;
import waits.WaitForElement;

public class LeftMenu extends BasePage {

    public LeftMenu() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }


    @FindBy(css = "#SidebarContent > a:nth-child(1)")
    WebElement fishButton;

    @FindBy(css = "#SidebarContent > a:nth-child(4)")
    WebElement dogsButton;

    @FindBy(css = "#SidebarContent > a:nth-child(7) > img")
    WebElement catsButton;

    @FindBy(css = "#SidebarContent > a:nth-child(10) > img")
    WebElement reptilesButton;

    @FindBy(css = "#SidebarContent > a:nth-child(13) > img")
    WebElement birdsButton;

    public FishPage clickFishButton() {
        WaitForElement.waitUntilElementIsClickable(fishButton);
        fishButton.click();
        log().info("Click FishButton");
        return new FishPage();
    }

    public void clickingDogsButton() {
        WaitForElement.waitUntilElementIsClickable(dogsButton);
        dogsButton.click();
    }

    public void clickingCatsButton() {
        WaitForElement.waitUntilElementIsClickable(catsButton);
        catsButton.click();
    }

    public void clickingReptilesButton() {
        WaitForElement.waitUntilElementIsClickable(reptilesButton);
        reptilesButton.click();
    }

    public void clickingBirdsButton() {
        WaitForElement.waitUntilElementIsClickable(birdsButton);
        birdsButton.click();
    }
}
