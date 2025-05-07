package mobile.pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PortfolioPage {
    private final AppiumDriver driver;

    public PortfolioPage(AppiumDriver driver) {
        this.driver = driver;
    }

    private final By portfolioHeader = By.id("com.example.app:id/portfolio_header"); // cần chỉnh lại theo app thật
    private final By investmentItem = By.id("com.example.app:id/investment_item");

    public boolean verifyPortfolioDataDisplayed() {
        try {
            WebElement header = driver.findElement(portfolioHeader);
            WebElement item = driver.findElement(investmentItem);
            return header.isDisplayed() && item.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
