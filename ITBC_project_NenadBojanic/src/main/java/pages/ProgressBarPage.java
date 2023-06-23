package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBarPage extends BasePage{
    private WebElement progressBarTile;
    private WebElement startBtn;
    private WebElement stopBtn;
    private WebElement progressBar;
    private WebElement resetBtn;
    public ProgressBarPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getProgressBarTile() {
        progressBarTile = getDriver().findElement(By.xpath("//span[contains(text(),'Progress Bar')]"));
        return progressBarTile;
    }

    public WebElement getStartBtn() {
        startBtn = getDriver().findElement(By.xpath("//button[contains(text(),'Start')]"));
        return startBtn;
    }
    public WebElement getStopBtn() {
        startBtn = getDriver().findElement(By.xpath("//button[contains(text(),'Stop')]"));
        return startBtn;
    }
    public WebElement getProgressBar() {
        progressBar = getDriver().findElement(By.xpath("//div[@role='progressbar']"));
        return progressBar;
    }
    public WebElement getResetBtn() {
        resetBtn = getDriver().findElement(By.xpath("//button[contains(text(),'Reset')]"));
        return resetBtn;
    }

    public ProgressBarPage clickProgressBarTile() {
        getProgressBarTile().click();
        return this;
    }
    public ProgressBarPage clickStartBtn (){
        getStartBtn().click();
        return this;
    }
    public ProgressBarPage clickStopBtn() {
        getWait().until(ExpectedConditions.visibilityOf(getStopBtn()));
        getStopBtn().click();
        return this;
    }
    public ProgressBarPage clickResetBtn() {
        getWait().until(ExpectedConditions.visibilityOf(getResetBtn()));
        getResetBtn().click();
        return this;
    }
    public ProgressBarPage waitUntilResetButtonIsVisible() {
        getWait().until(ExpectedConditions.visibilityOfElementLocated
                (By.xpath("//button[contains(text(),'Reset')]")));
        return this;
    }
}
