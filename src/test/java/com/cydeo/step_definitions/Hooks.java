package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

/*
In this class we will be able to pas pre&post conditions to each scenario
 and each step
 */
public class Hooks {
 // import from io.cucumber.java not from Junit
  @Before
    public void  setupScenario(){

      System.out.println("=======Setting up browser using cucumber @Before=========");
  }

  @After
    public void tearDownScenario(){
      System.out.println("=======closing browser using cucumber @After=========");
  }





}
