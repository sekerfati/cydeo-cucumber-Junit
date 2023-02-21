package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {

    GoogleSearchPage googleSearchPage=new GoogleSearchPage();

    @When("user enter {word} and clicks enter")
    public void user_enter_and_clicks_enter2(String searchKeyword) {
        googleSearchPage.searchBox.sendKeys(searchKeyword+Keys.ENTER);

    }



    @When("user enter {string} and clicks enter")
    public void user_enter_and_clicks_enter(String searchKeyword) {
googleSearchPage.searchBox.sendKeys(searchKeyword+Keys.ENTER);

    }


    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {
        String expectedTitle=string+" - Sök på Google";
        String actualTitle=Driver.getDriver().getTitle();
//Junit assertion accepts first argument as expected and second argument as actual
        Assert.assertEquals("Title is not as expected!",expectedTitle, actualTitle);
//Assert.assertTrue(expectedTitle.equals(actualTitle));


    }




    @Then("user sees {word} in the google title")
    public void user_sees_apple_in_the_google_title(String word) {
String expectedTitle=word+" - Sök på Google";
String actualTitle=Driver.getDriver().getTitle();
//Junit assertion accepts first argument as expected and second argument as actual
Assert.assertEquals("Title is not as expected!",expectedTitle, actualTitle);
//Assert.assertTrue(expectedTitle.equals(actualTitle));



    }





    @When("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
        Driver.getDriver().findElement(By.xpath("//div[.='Godkänn alla']")).click();
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
String expectedTitle="Google";
String actualTitle=Driver.getDriver().getTitle();
  Assert.assertEquals(expectedTitle,actualTitle);

    }








}
