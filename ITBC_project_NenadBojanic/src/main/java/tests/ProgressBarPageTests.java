package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ProgressBarPageTests extends BaseTest{
    @Test
    public void verifyUserCanClickStartButton() {
        getIndexPage().clickOnWidgetsSpan();
        scrollDown(400);
        getProgressBarPage().clickProgressBarTile()
                .clickStartBtn();
        assertVisibilityOfElement(getProgressBarPage().getStopBtn());
    }
    @Test
    public void verifyUserCanClickStop() {
        getIndexPage().clickOnWidgetsSpan();
        scrollDown(400);
        getProgressBarPage().clickProgressBarTile()
                .clickStartBtn()
                .clickStopBtn();
        assertVisibilityOfElement(getProgressBarPage().getStartBtn());
    }
    @Test
    public void verifyUserCanClickResetButton() {
        getIndexPage().clickOnWidgetsSpan();
        scrollDown(400);
        getProgressBarPage().clickProgressBarTile()
                .clickStartBtn()
                        .waitUntilResetButtonIsVisible()
                        .clickResetBtn();
        assertVisibilityOfElement(getProgressBarPage().getStartBtn());
    }
}
