package pages;

import org.openqa.selenium.By;
import utilities.actions.BrowserActions;
import utilities.actions.ElementActions;

public class HomePage extends ElementActions {
    BrowserActions browserActions = new BrowserActions();
    //=============================Locators==================================
    By freeTrial = By.xpath("//a[normalize-space()='Get A Free Trial']");
    By tryNow = By.xpath("//a[normalize-space()='Try now']");
    By uiForReact = By.xpath("//a[@class='u-db'][normalize-space()='UI for React']");
    //===================================Methods===================================
    public void openTelerik()
    {
        browserActions.navigateToPage(getEnvironmentURL());
    }
    public void clickFreeTrial() {
        getElement(freeTrial).click();
    }
    public void clickTryNow() {
        forceClickOnElement(getElement(tryNow));
    }
    public void clickUiForReact() {
        getElement(uiForReact).click();
    }
}



