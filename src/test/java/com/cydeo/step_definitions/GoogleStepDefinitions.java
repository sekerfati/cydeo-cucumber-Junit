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

    @When("user enter apple and clicks enter")
    public void user_enter_apple_and_clicks_enter() {
googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);
    }


    @Then("user sees apple in the google title")
    public void user_sees_apple_in_the_google_title() {
String expectedTitle="apple - Sök på Google";
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
