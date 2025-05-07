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
        MobileLoginPage login = new MobileLoginPage(mobileDriver);
        PortfolioPage portfolio = login.login("test@mail.com", "password123");
        Assert.assertTrue(portfolio.verifyPortfolioDataDisplayed());

        LogoutPage logout = new LogoutPage(mobileDriver);
        logout.logout();
    }
}