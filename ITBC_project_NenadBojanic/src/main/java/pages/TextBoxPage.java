package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TextBoxPage extends BasePage{
    private WebElement textBoxTile;
    private WebElement fullNameField;
    private WebElement emailField;
    private WebElement submitBtn;
    private WebElement textBoxWindow;
    private WebElement invalidEmailField;
    public TextBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public WebElement getTextBoxTile() {
        textBoxTile = getDriver().findElement(By.xpath("//span[contains(text(),'Text Box')]"));
        return textBoxTile;
    }
    public WebElement getFullNameField() {
        fullNameField = getDriver().findElement(By.xpath("//input[@id='userName']"));
        return fullNameField;
    }
    public WebElement getEmailField() {
        emailField = getDriver().findElement(By.xpath("//input[@id='userEmail']"));
        return emailField;
    }
    public WebElement getSubmitBtn() {
        submitBtn =getDriver().findElement(By.id("submit"));
        return submitBtn;
    }
    public WebElement getTextBoxWindow() {
        textBoxWindow = getDriver().findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']"));
        return textBoxWindow;
    }
    public WebElement getInvalidEmailField() {
        invalidEmailField = getDriver().findElement
                (By.xpath("//input[@class='mr-sm-2 field-error form-control']"));
        return invalidEmailField;
    }
    public TextBoxPage clickTextBoxTile() {
        getTextBoxTile().click();
        return this;
    }
    public TextBoxPage enterFullName(String name){
        getFullNameField().sendKeys(name);
        return this;
    }
    public TextBoxPage enterEmail(String email) {
        getEmailField().sendKeys(email);
        return this;
    }
    public TextBoxPage clickSubmitBtn() {
        getSubmitBtn().click();
        return this;
    }
    public TextBoxPage verifyEnteredName(String name) {
        Assert.assertTrue(getTextBoxWindow().getText().contains(name));
        return this;
    }
    public TextBoxPage verifyEnteredEmail(String email) {
        Assert.assertTrue(getTextBoxWindow().getText().contains(email));
        return this;
    }
}
