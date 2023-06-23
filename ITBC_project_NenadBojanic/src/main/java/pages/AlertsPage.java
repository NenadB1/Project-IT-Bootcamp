package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AlertsPage extends BasePage{
    private WebElement alertsFrameSpan;
    private WebElement alertsTile;
    private WebElement clickMeAlertBtn;
    private WebElement clickMeAlert5SecBtn;
    private WebElement clickMeConfirmBoxBtn;
    private WebElement clickMePromptBoxBtn;
    private WebElement confirmAlertBoxClickedSpan;
    private WebElement confirmAlertPromptClickedSpan;
    private Alert alert;
    public AlertsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getAlertsFrameSpan() {
        alertsFrameSpan = getDriver().findElements(By.xpath("//div[@class='card mt-4 top-card']")).get(2);
        return alertsFrameSpan;
    }

    public WebElement getAlertsTile() {
        alertsTile = getDriver().findElement(By.xpath("//span[contains(text(),'Alerts')]"));
        return alertsTile;
    }
    public WebElement getClickMeAlertBtn() {
        clickMeAlertBtn = getDriver().findElements(By.xpath
                ("//button[contains(text(),'Click me')]")).get(0);
        return clickMeAlertBtn;
    }
    public WebElement getClickMeAlert5SecBtn() {
        clickMeAlert5SecBtn = getDriver().findElements(By.xpath
                ("//button[contains(text(),'Click me')]")).get(1);
        return clickMeAlert5SecBtn;
    }
    public WebElement getClickMeConfirmBoxBtn() {
        clickMeConfirmBoxBtn = getDriver().findElements(By.xpath
                ("//button[contains(text(),'Click me')]")).get(2);
        return clickMeConfirmBoxBtn;
    }
    public WebElement getClickMePromptBoxBtn() {
        clickMePromptBoxBtn = getDriver().findElements(By.xpath
                ("//button[contains(text(),'Click me')]")).get(3);
        return clickMePromptBoxBtn;
    }
    public WebElement getConfirmAlertButtonClickedSpan() {
        confirmAlertBoxClickedSpan = getDriver().findElement(By.xpath("//span[@id='confirmResult']"));
        return confirmAlertBoxClickedSpan;
    }
    public WebElement getConfirmAlertPromptClickedSpan() {
        confirmAlertBoxClickedSpan = getDriver().findElement(By.xpath("//span[@id='promptResult']"));
        return confirmAlertBoxClickedSpan;
    }
    public Alert getAlert() {
        alert = getDriver().switchTo().alert();
        return alert;
    }
    public AlertsPage clickAlertsTile() {
        getAlertsTile().click();
        return this;
    }
    public AlertsPage clickAlertButton() {
        getClickMeAlertBtn().click();
        return this;
    }
    public AlertsPage clickAlert5SecButton() {
        getClickMeAlert5SecBtn().click();
        return this;
    }
    public AlertsPage clickConfirmBoxButton() {
        getClickMeConfirmBoxBtn().click();
        return this;
    }
    public AlertsPage clickPromptBoxButton() {
        getClickMePromptBoxBtn().click();
        return this;
    }
    public AlertsPage assertAlertText() {
        getWait().until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(getAlert().getText(),"You clicked a button");
        return this;
    }
    public AlertsPage assertAlertTextAfter5Seconds() {
        getWait().until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(getAlert().getText(),"This alert appeared after 5 seconds");
        return this;
    }
    public AlertsPage enterTextInAlertBox(String text) {
        getAlert().sendKeys(text);
        return this;
    }
    public AlertsPage clickAcceptOnAlert() {
        getAlert().accept();
        return this;
    }
}
