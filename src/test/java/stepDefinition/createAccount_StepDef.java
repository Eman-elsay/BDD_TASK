package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterationPage;

public class createAccount_StepDef extends HomePage {
    RegisterationPage registerationPage = new RegisterationPage();

    @Given("I open telerik website")
    public void i_open_Telerik_website() {
        openTelerik();
    }
    @When("I click on freeTrial")
    public void i_click_on_freeTrial() {
        clickFreeTrial();
    }
    @And("I click tryNow")
    public void i_click_on_tryNow() {
        clickTryNow();
    }
    @And("I fill email")
    public void i_file_email() {
       registerationPage.fillEmail();
    }
    @And("I click uiForReact")
    public void i_click_on_uiForReact() {
       clickUiForReact();
    }
    @And("I click next")
    public void i_click_on_next() {
        registerationPage.clickNext();
    }
    @And("I fill Data")
    public void i_fill_data() {
        registerationPage.fillregerstationform();
    }

    @Then("I Assert SucessMsg is Exist")
    public void i_Assert_SucessMSG() {
        registerationPage.AssertthatSucessMsgIsEXIST();
    }
}