package pages;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Assertions;
import utilities.Paths;
import utilities.actions.ElementActions;
import utilities.readers.JsonReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterationPage extends ElementActions {
    JSONObject userData = (JSONObject) JsonReader.parseJson(Paths.usersDataPath).get(getTestEnvironment());
    Assertions assertions = new Assertions();
    //=============================Locators==================================
    By email_tb = By.id("email");
    By next_btn = By.xpath("//button[normalize-space()='Next']");
    By pass_tb = By.id("password");
    By F_Name_tb = By.id("fist-name");
    By L_Name_tb = By.id("last-name");
    By Company_tb = By.id("company");
    By phone_tb = By.id("phone");
    By Country_tb = By.xpath("//kendo-combobox[@id='country']//kendo-searchbar[@class='k-searchbar']/input[1]");
    By Business_Need_tb = By.id("business-need");
    By CreateBTN = By.cssSelector("button[type='submit']");
    By Captch = By.xpath("//input[@type='checkbox']");
    By SucessMSG = By.xpath("//h1[normalize-space()='Thank You for Signing Up!']");

    //===================================Methods===================================
    public void fillEmail() {
        String emailValue = userData.get("email").toString();
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String formattedTimestamp = formatter.format(date);
        getElement(email_tb).sendKeys(emailValue + formattedTimestamp + "@gmail.com");
    }

    public void clickNext() {
        getElement(next_btn).click();
    }

    public void fillregerstationform() {
        String emailValue = userData.get("password").toString();
        getElement(pass_tb).sendKeys(emailValue);
        String fnameValue = userData.get("FirstName").toString();
        getElement(F_Name_tb).sendKeys(fnameValue);
        String lnameValue = userData.get("LastName").toString();
        getElement(L_Name_tb).sendKeys(lnameValue);
        String CompanyValue = userData.get("Company").toString();
        getElement(Company_tb).sendKeys(CompanyValue);
        String phoneValue = userData.get("phone").toString();
        getElement(phone_tb).sendKeys(phoneValue);
        String countryValue = userData.get("country").toString();
        getElement(Country_tb).click();
        getElement(Country_tb).sendKeys(countryValue);
        getElement(Business_Need_tb).click();
        getElement(Business_Need_tb).sendKeys(Keys.ENTER);
        getElement(CreateBTN).click();
        forceClickOnElement(getElement(Captch));
        getElement(CreateBTN).click();
    }
    //-----------------------------------Assertions--------------------------------
    public void AssertthatSucessMsgIsEXIST() {
        assertions.assertElementExist(SucessMSG);
    }
}



