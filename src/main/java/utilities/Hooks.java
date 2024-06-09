package utilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends TestBase{
    @Before(order = 1)
    public void openBrowser() {
        launchBrowser();
    }
    @Before(order = 2)
    public void testCaseEnvironment(Scenario scenario) {
        scenario.log("Browser type is: "+getBrowserType()
                        +"\n, Test environment is: "+getTestEnvironment());
    }
//===========================To attach screenshots in the extent report then quite the browser======================
    @After(order = 1)
    public void takeScreenshot(Scenario scenario) {
//        if(scenario.isFailed()){
            //----------------------------extent report-----------------------------
            byte[] src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(src,"image/png", scenario.getName()+ ".png" );
    }
    @After(order = 0)
    public void quitBrowser() {
        getDriver().quit();
    }
}