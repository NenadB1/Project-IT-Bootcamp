package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.time.Duration;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private IndexPage indexPage;
    private TextBoxPage textBoxPage;
    private ProgressBarPage progressBarPage;
    private AlertsPage alertsPage;
    private ToolTipsPage toolTipsPage;
    private JavascriptExecutor js;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C://Users//Nenad//Desktop//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        indexPage = new IndexPage(driver,wait);
        textBoxPage = new TextBoxPage(driver,wait);
        progressBarPage = new ProgressBarPage(driver,wait);
        alertsPage = new AlertsPage(driver,wait);
        toolTipsPage = new ToolTipsPage(driver,wait);
        js = (JavascriptExecutor) getDriver();
    }
    public WebDriver getDriver() {
        return driver;
    }
    public WebDriverWait getWait() {
        return wait;
    }
    public IndexPage getIndexPage() {
        return indexPage;
    }
    public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }
    public ProgressBarPage getProgressBarPage() {
        return progressBarPage;
    }
    public AlertsPage getAlertsPage() {
        return alertsPage;
    }
    public ToolTipsPage getToolTipsPage() {
        return toolTipsPage;
    }
    public JavascriptExecutor getJs() {
        return js;
    }

    @BeforeMethod
    public void beforeEachTest() {
        getIndexPage().open();
        getDriver().manage().window().maximize();
    }
    @AfterClass
    public void cleanUp() {
        getDriver().close();
    }
    public void scrollDown(int numberOfPixels) {
        js.executeScript("window.scrollBy(0," + numberOfPixels + ")", "");
    }
    public void scrollUp(int numberOfPixels) {
        js.executeScript("window.scrollBy(" + numberOfPixels + ",0)", "");
    }
    public void assertVisibilityOfElement(WebElement element) {
        Assert.assertTrue(getWait().until(ExpectedConditions.visibilityOf(element)).isDisplayed());
    }

}
