package tests;

import driver.manager.TestBase;
import org.testng.annotations.Test;
import page.objects.*;
import page.objects.MainPage.LeftMenu;

import static org.testng.Assert.*;

public class buyingTest extends TestBase {
    @Test
    public void buyingAngelFish() {
        LandingPage landingPage = new LandingPage();
        landingPage
                .clickingOnEnterButton()
                .clickFishButton()
                .clickingAngelfishButton()
                .addToCardSmallAngelFish()
                .proceedToCheckoutButton();

        LoginPage loginPage = new LoginPage();

        assertEquals(loginPage.getWarningMessage(), "You must sign on before attempting to check out. Please sign on and try checking out again.");
    }
}
