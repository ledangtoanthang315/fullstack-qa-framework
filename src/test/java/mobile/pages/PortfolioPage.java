package mobile.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PortfolioPage {
    private final AppiumDriver driver;

    public PortfolioPage(AppiumDriver driver) {
        this.driver = driver;
    }

    private final By portfolioHeader = By.xpath("//XCUIElementTypeStaticText[@name='Portfolio']");
    private final By investmentItem = By.xpath("//XCUIElementTypeCell");

    public boolean verifyPortfolioDataDisplayed() {
        try {
            WebElement header = driver.findElement(portfolioHeader);
            List<WebElement> items = driver.findElements(investmentItem);

            System.out.println("Found " + items.size() + " investment items.");
            return header.isDisplayed() && !items.isEmpty();
        } catch (Exception e) {
            System.out.println("Error verifying portfolio: " + e.getMessage());
            return false;
        }
    }
}
