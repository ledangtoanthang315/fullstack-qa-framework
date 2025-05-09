package mobile.tests;

import base.BaseTest;
import mobile.pages.LogoutPage;
import mobile.pages.MobileLoginPage;
import mobile.pages.PortfolioPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileE2ETest extends BaseTest {

    @Test
    public void testPortfolioViewFlow() {
        MobileLoginPage loginPage = new MobileLoginPage(mobileDriver);
        PortfolioPage portfolioPage = loginPage.login("teeinc86@mail.com", "TradingView!1988");

        Assert.assertTrue(portfolioPage.verifyPortfolioDataDisplayed(),
                "Portfolio data was not displayed as expected.");

        LogoutPage logoutPage = new LogoutPage(mobileDriver);
        logoutPage.logout();
    }
}
