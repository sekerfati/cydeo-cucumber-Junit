package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BasePage {
   public OrderPage(){
       PageFactory.initElements(Driver.getDriver(), this);
   }

   @FindBy(name = "product")
    public WebElement productDropDown;





}
