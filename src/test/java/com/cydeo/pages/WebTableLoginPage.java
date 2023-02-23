package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {


    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy(name = "username")
  public   WebElement inputUserName;

 @FindBy(name = "password")
  public   WebElement inputPassWord;

 @FindBy(xpath = "//button[.='Login']")
  public   WebElement loginButton;


    /**
     * No parameters.
     * When we call this method, it will directly login using
     * Username:Test
     * Password:Tester
     *
      */
 public void login(){
     this.inputUserName.sendKeys("Test");
     this.inputPassWord.sendKeys("Tester");
     this.loginButton.click();
 }

    /**
     * This method() will accept 2 arguments, and it will login
     * @param username
     * @param password
     */
public void login(String username, String password){
        this.inputUserName.sendKeys(username);
        this.inputPassWord.sendKeys(password);
        this.loginButton.click();
    }







}




