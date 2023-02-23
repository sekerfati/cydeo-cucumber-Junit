package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {
    /*
       This method will accept int (in seconds) and execute Thread.sleep
       for given duration
        */
    public static void sleep(int second){
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e ) {

        }
    }

    /*
    This method accepts 3 arguments.
    Arg1: webdriver
    Arg2: expectedInUrl : for verify if the url contains given String.
        - If condition matches, will break loop.
    Arg3: expectedInTitle to be compared against actualTitle
     */
    public static void switchWindowAndVerify( String expectedInUrl, String expectedInTitle){

        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowsHandles) {

            Driver.getDriver().switchTo().window(each);

            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        //5. Assert:Title contains “expectedInTitle”
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    /*
    This method accepts a String "expectedTitle" and Asserts if it is true
     */
    public static void verifyTitle(String expectedTitle){

       Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }

    /*
    Creating a utility method for ExplicitWait, so we don't have to repeat the lines
     */
    public static void waitForInvisibilityOf(WebElement webElement){
        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }


    /**
     * this method() verifies whether the current url contains    "expected value"
     * @param expectedInUrl
     */
    public static void   verifyURLContains(String expectedInUrl){
    Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInUrl));

}


    /**
     * This method will accept a dropDown as a WebElement
     * and return all the options' text in a list of String
     * @param dropDownElement
     * @return List<String> actual options as String
     */
    public static List<String> dropDownOptionsAsString(WebElement dropDownElement){

    Select select= new Select(dropDownElement);
    //List of all actual dropDown options as web element.
    List<WebElement> actualOptionsAsWebElement = select.getOptions();


    //List of all actual dropDown options as String.
    List<String > actualOptionsAsString=new ArrayList<>();
    for (WebElement each : actualOptionsAsWebElement) {
        actualOptionsAsString.add(each.getText());
    }

    return actualOptionsAsString;

}






}
