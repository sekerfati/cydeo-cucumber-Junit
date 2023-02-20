package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

   public GoogleSearchPage(){
  //Create constructor
  // initialize the driver instance and this class' instance using     PageFactory.initElements
       PageFactory.initElements(Driver.getDriver(), this);
   }

// we can start locate web elements using @FindBy annotation
 @FindBy(name = "q")
 public WebElement searchBox;





}
