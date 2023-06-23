package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTipsPage extends BasePage{
    private WebElement hoverButton;
    private WebElement hoverField;
    private WebElement toolsTipsTile;
    private Actions action;
    private WebElement confirmTextFieldOverButton;
    private WebElement confirmTextFieldOverField;
    public ToolTipsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getHoverButton() {
        hoverButton = getDriver().findElement(By.xpath("//button[@id='toolTipButton']"));
        return hoverButton;
    }
    public WebElement getHoverField() {
        hoverField = getDriver().findElement(By.xpath("//input[@id='toolTipTextField']"));
        return hoverField;
    }
    public WebElement getToolsTipsTile() {
        toolsTipsTile = getDriver().findElement(By.xpath("//span[contains(text(),'Tool Tips')]"));
        return toolsTipsTile;
    }
    public WebElement getConfirmTextFieldOverButton() {
        confirmTextFieldOverButton = getDriver().findElement(By.xpath("//div[@class='tooltip-inner']"));
        return confirmTextFieldOverButton;
    }
    public WebElement getConfirmTextFieldOverField() {
        confirmTextFieldOverField = getDriver().findElement(By.xpath("//div[@class='tooltip-inner']"));
        return confirmTextFieldOverField;
    }
    public Actions getAction() {
        action = new Actions(getDriver());
        return action;
    }
    public ToolTipsPage hoverOverButton() {
        getAction().moveToElement(getHoverButton()).build().perform();
        return this;
    }
    public ToolTipsPage hoverOverField() {
        getAction().moveToElement(getHoverField()).build().perform();
        return this;
    }
    public ToolTipsPage waitUntilConfirmButtonBoxIsDisplayed() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//div[@class='tooltip-inner']")));
        return this;
    }
    public ToolTipsPage waitUntilConfirmFieldBoxIsDisplayed() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//div[@class='tooltip-inner']")));
        return this;
    }
    public ToolTipsPage clickToolsTipsTile() {
        getToolsTipsTile().click();
        return this;
    }
}
