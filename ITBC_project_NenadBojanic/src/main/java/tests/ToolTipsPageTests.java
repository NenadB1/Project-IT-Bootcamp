package tests;

import org.testng.annotations.Test;

public class ToolTipsPageTests extends BaseTest{
    @Test
    public void verifyUserCanHoverOverButton() {
        getIndexPage().clickOnWidgetsSpan();
        scrollDown(600);
        getToolTipsPage().clickToolsTipsTile()
                .hoverOverButton()
                .waitUntilConfirmButtonBoxIsDisplayed();
        assertVisibilityOfElement(getToolTipsPage().getConfirmTextFieldOverButton());
    }
    @Test
    public void verifyUserCanOverField() {
        getIndexPage().clickOnWidgetsSpan();
        scrollDown(600);
        getToolTipsPage().clickToolsTipsTile()
                .hoverOverField()
                .waitUntilConfirmFieldBoxIsDisplayed();
            assertVisibilityOfElement(getToolTipsPage().getConfirmTextFieldOverField());
        }
    }

