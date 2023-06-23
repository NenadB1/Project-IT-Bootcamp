package tests;

import org.testng.annotations.Test;

public class AlertsPageTests extends BaseTest{
    @Test
    public void verifyAlertIsVisibleAfterClick() {
        getIndexPage().clickOnAlertsFrameSpan();
        scrollDown(300);
        getAlertsPage().clickAlertsTile()
                .clickAlertButton()
                .assertAlertText()
                .clickAcceptOnAlert();
    }
    @Test
    public void verifyAlertIsVisibleAfter5Seconds() {
        getIndexPage().clickOnAlertsFrameSpan();
        scrollDown(300);
        getAlertsPage().clickAlertsTile()
                .clickAlert5SecButton()
                .assertAlertTextAfter5Seconds()
                .clickAcceptOnAlert();
    }
    @Test
    public void verifyUserCanClickConfirmInAlertBox() {
        getIndexPage().clickOnAlertsFrameSpan();
        scrollDown(300);
        getAlertsPage().clickAlertsTile()
                .clickConfirmBoxButton()
                .clickAcceptOnAlert();
        assertVisibilityOfElement(getAlertsPage().getConfirmAlertButtonClickedSpan());
    }
    @Test
    public void verifyUserCanWriteTextInPromptBox() {
        getIndexPage().clickOnAlertsFrameSpan();
        scrollDown(300);
        getAlertsPage().clickAlertsTile()
                .clickPromptBoxButton()
                .enterTextInAlertBox("Nenad")
                .clickAcceptOnAlert();
        assertVisibilityOfElement(getAlertsPage().getConfirmAlertPromptClickedSpan());
    }
}
