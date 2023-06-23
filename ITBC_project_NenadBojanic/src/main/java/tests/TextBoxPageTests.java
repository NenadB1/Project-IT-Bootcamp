package tests;

import org.testng.annotations.Test;

public class TextBoxPageTests extends BaseTest{
    @Test
    public void verifyNameAndEmailAreSameWeEntered() {
        getIndexPage().clickOnElementsSpan();
        getTextBoxPage().clickTextBoxTile()
                .enterFullName("Nenad")
                .enterEmail("nenad@gmail.com");
        scrollDown(300);
        getTextBoxPage().clickSubmitBtn()
                .verifyEnteredName("Nenad")
                .verifyEnteredEmail("nenad@gmail.com");
    }
    @Test
    public void verifyInvalidEmail() {
        getIndexPage().clickOnElementsSpan();
        getTextBoxPage().clickTextBoxTile()
                .enterEmail("nenad@g");
        scrollDown(300);
        getTextBoxPage().clickSubmitBtn();
        assertVisibilityOfElement(getTextBoxPage().getInvalidEmailField());
    }
}
