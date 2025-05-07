package web.tests;

import drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import web.pages.*;

public class WebE2ETest {
    private WebDriver driver;


    @BeforeClass
    public void setUp() {
        driver = DriverFactory.getWebDriver();
    }


    @Test
    public void testCreateAndVerifyChallenge() {
        LoginPage loginPage = new LoginPage(driver);
        String username = "teeinc86";
        String password = "123456";
        loginPage.login(username, password);
        Assert.assertTrue(loginPage.isLoginSuccessful(), "Login failed");


        DashboardPage dashboard = new DashboardPage(driver);
        dashboard.goToCreateChallenge();


        CreateChallengePage createPage = new CreateChallengePage(driver);
        String challengeTitle = "Automation Challenge";
        String challengeDescription = "This is a test challenge created by automation.";
        createPage.createChallenge(challengeTitle, challengeDescription);


        MyChallengesPage myChallenges = new MyChallengesPage(driver);
        Assert.assertTrue(myChallenges.verifyChallengeIsPresent(challengeTitle), "Challenge not found in My Challenges");


        dashboard.logout();
    }


    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}

