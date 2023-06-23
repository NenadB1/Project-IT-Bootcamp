package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class IndexPage extends BasePage {
    private WebElement elementsSpan;
    private WebElement widgetsSpan;
    private WebElement alertsFrameSpan;
    public IndexPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getElementsSpan() {
        elementsSpan = getDriver().findElements(By.xpath("//div[@class='card mt-4 top-card']")).get(0);
        return elementsSpan;
    }
    public WebElement getWidgetsSpan() {
        widgetsSpan = getDriver().findElements(By.xpath("//div[@class='card mt-4 top-card']")).get(3);
        return widgetsSpan;
    }
    public WebElement getAlertsFrameSpan() {
        alertsFrameSpan = getDriver().findElements(By.xpath("//div[@class='card mt-4 top-card']")).get(2);
        return alertsFrameSpan;
    }
    public IndexPage clickOnElementsSpan() {
        getElementsSpan().click();
        return this;
    }
    public IndexPage clickOnWidgetsSpan() {
        getWidgetsSpan().click();
        return this;
    }
    public IndexPage clickOnAlertsFrameSpan() {
        getAlertsFrameSpan().click();
        return this;
    }
    public IndexPage open() {
        getDriver().get("https://demoqa.com/");
        return this;
    }
}
