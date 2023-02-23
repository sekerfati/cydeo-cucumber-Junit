package com.cydeo.step_definitions;

import com.cydeo.pages.DropDownsPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DataTables_StepDefinitions {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {

        System.out.println(fruits);
        System.out.println(fruits.get(1));


    }


    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {

        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }


DropDownsPage dropDownsPage=new DropDownsPage();

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonth) {

        Select select= new Select(dropDownsPage.MonthDropDown);
        List<WebElement> actualOptionsAsWebElement = select.getOptions();
        
        List<String > actualOptionsAsString=new ArrayList<>();
        for (WebElement each : actualOptionsAsWebElement) {
          actualOptionsAsString.add(each.getText());
        }

        Assert.assertEquals(expectedMonth, actualOptionsAsString);
// Assert will check the size of the list first. If it is matching it will check content 1 by 1.


    }






}
