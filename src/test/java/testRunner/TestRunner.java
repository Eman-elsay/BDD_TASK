package testRunner;

import io.cucumber.testng.CucumberOptions;
import utilities.TestBase;

@CucumberOptions(features = {"src/test/java"}
        ,glue = {"stepDefinition","utilities"}
        ,tags = (" @TC1")
        ,plugin = {"pretty"
                ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                ,"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }
)
public class TestRunner extends TestBase {

}