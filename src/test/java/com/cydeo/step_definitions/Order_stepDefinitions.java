package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Order_stepDefinitions {

    WebTableLoginPage webTableLoginPage= new WebTableLoginPage();
    BasePage basePage=new BasePage();

    OrderPage orderPage=new OrderPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
  // getting the page using the url from Configuration.properties
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableUrl"));
  // calling our login method to login
        webTableLoginPage.login();
  // clicking to the "order" link to go to order page
        basePage.order.click();

    }


    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {

        Select select= new Select(orderPage.productDropDown);
        select.selectByVisibleText(string);
    }


    @And("user enters quantity {int}")
    public void userEntersQuantity(int quantity) {
 //accepting int argument(by concatenating to String) and sending it using send keys() method
 // clear method() will delete whatever is in the input box
 //       orderPage.inputQuantity.clear();

 orderPage.inputQuantity.sendKeys(Keys.BACK_SPACE);
 // sendKeys(Keys.BACK_SPACE) imitates pressing back_space button from keyBoard and will delete whatever is in the input box
        orderPage.inputQuantity.sendKeys(""+quantity);
    }



    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
       orderPage.inputCustomerName.sendKeys(string);

    }


    @When("user enters street {string}")
    public void user_enters_street(String string) {
orderPage.inputStreet.sendKeys(string);

    }


    @When("user enters city {string}")
    public void user_enters_city(String string) {
orderPage.inputCity.sendKeys(string);
    }


    @When("user enters state {string}")
    public void user_enters_state(String string) {

    orderPage.inputState.sendKeys(string);
    }


    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {

        orderPage.inputZip.sendKeys(string);
    }


    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String expectedCardType) {
// this line will loop through the list and decide which radio button to click
      BrowserUtils.clickRadioButtonWithString(orderPage.cardType, expectedCardType);
    }


    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
orderPage.cardNoInput.sendKeys(string);


    }


    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
orderPage.cardExpInput.sendKeys(string);


    }


    @When("user enters process order button")
    public void user_enters_process_order_button() {
orderPage.processOrderButton.click();

    }


    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {


    }






}
