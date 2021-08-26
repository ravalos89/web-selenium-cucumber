package com.cucumber.stepdefination;

import com.cucumber.base.Base;
import com.cucumber.poc.HomePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class StepDefination extends Base{

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
    	System.out.println("User is on landing page");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        System.out.println("User logged into app");
    }

    @Then("^Home Page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Home page is displayed");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	System.out.println("Cards are displayed");
    }
    
    @When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("User logged into app with user: "+strArg1+ " and pwd: "+strArg2);
    }
    
    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
    	System.out.println("Cards displayed are" + strArg1);
    }
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {      
        System.out.println("Username: "+data.asList().get(0));
        System.out.println("Password: "+data.asList().get(1));
        System.out.println("Email: "+data.asList().get(2));
        System.out.println("Country: "+data.asList().get(3));
        System.out.println("Zipcode: "+data.asList().get(4));
    }
    
    @When("^User login into application with username (.+) and password (.+) parameterizing$")
    public void user_login_into_application_with_username_and_password_parameterizing(String username, String password) throws Throwable {
        System.out.println("Username: "+username);
        System.out.println("Password: "+password);
    }
    
    @Given("^Validate browser$")
    public void validate_browser() throws Throwable {
        System.out.println("Validate Browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("Browser is triggered");
    }

    @Then("^Check if browser is started$")
    public void check_if_browser_is_started(){
    	System.out.println("Check if browser is started");
    }
    
    @Given("^User is on Greenkart page$")
    public void user_is_on_greenkart_page() throws Throwable{
    	driver = Base.getWebDriver();
    }

    @When("^User searched for (.+) vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws InterruptedException{
    	HomePage h = new HomePage(driver);
    	h.typeVegetable(strArg1);
    }

    @Then("^(.+)results are displayed$")
    public void something_results_are_displayed(String strArg1){
    	HomePage h = new HomePage(driver);
    	Assert.assertTrue(h.validateVegetableResult(strArg1));
    }
}
