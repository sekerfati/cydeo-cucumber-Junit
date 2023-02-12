package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

/*
In this class we will be able to pas pre&post conditions to each scenario
 and each step
 */
public class Hooks {
 // import from io.cucumber.java not from Junit
  @Before(order = 1)
    public void  setupScenario(){

      System.out.println("=======Setting up browser using cucumber @Before=========");
  }

    @Before(value = "@login", order = 2)
    public void  setupScenarioForLogins(){

        System.out.println("=======this will only apply for scenarios with @login tag=========");
    }

    @Before(value = "@database", order = 0)
    public void  setupScenarioForDatabaseScenarios(){

        System.out.println("=======this will only apply for scenarios with @database tag=========");
    }



  @After
    public void tearDownScenario(){
      System.out.println("=======closing browser using cucumber @After=========");
      System.out.println("=======scenario ended/take screenshot if failed=========");

  }



@BeforeStep
    public void setupStep(){
    System.out.println("------------applying setup using @BeforeStep----------- ");
}

@AfterStep
    public void tearDownStep(){
    System.out.println("------------applying tearDown using @AfterStep----------- ");
}








}
