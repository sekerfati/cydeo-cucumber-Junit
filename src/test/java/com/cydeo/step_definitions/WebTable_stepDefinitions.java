package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebTable_stepDefinitions {

    WebTableLoginPage webTableLoginPage= new WebTableLoginPage();

    @Given("user is on the page of web table app")
    public void user_is_on_the_page_of_web_table_app() {
String url=ConfigurationReader.getProperty("webTableUrl");
Driver.getDriver().get(url);

    }


    @When("user enters username {string}")
    public void user_enters_username(String string) {

webTableLoginPage.inputUserName.sendKeys(string);

    }


    @When("user enters password {string}")
    public void user_enters_password(String string) {

        webTableLoginPage.inputPassWord.sendKeys(string);

    }


    @When("user clicks to login button")
    public void user_clicks_to_login_button() {

       webTableLoginPage.loginButton.click();

    }


    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {

        BrowserUtils.verifyURLContains("orders");

    }


    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String arg0, String arg1) {


    }
}




}
