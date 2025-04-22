package com.stepDefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pages.RegisterPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {
	
	private WebDriver driver;
	private RegisterPage registerPage ;
	private Object String;
	
	public RegisterSteps()
	{
		this.driver = DriverFactory.getDriver();
		this.registerPage = new RegisterPage(driver);
	}
	
	
	
	
	
	 @When("I enter a name {string} and email address {string}")
	    public void i_enter_a_name_and_email_address(String name ,  String email) {
		 
		 registerPage.enterSignUpName(name);
		 registerPage.enterSignUpEmail(email);
		 
	 }
	 
	 @And("I click on the Signup button")
	 public void I_click_on_the_Signup_button()
	 {
		 registerPage.clickOnSignUpButton();
	 }
	 
	 @When("I fill in account details:")
	    public void i_fill_in_account_details(DataTable datatable) throws Exception {
		 registerPage.fillAccountDetails(datatable);
		 
		 
	 }
	 
	 @And("I select {string}")
	 
	    public void i_select(String checkBoxOption) {
		 
		 registerPage.clickOnSelectbutton(checkBoxOption);
		 
	 }
	 @And("I fill in personal details:")
	    public void i_fill_in_personal_details(DataTable datatable) {
		 
		 registerPage.fillPersonalDetails(datatable);
		 
	 }
	 @And("I click the Create Account button")
	 public void i_click_the_button() {
		 registerPage.clickOnCreateAccountButton();
		 
	 }
	 
	 @When("I click on the Continue button")
	 public void I_click_on_the_continue_button() 
	 {
		 registerPage.clickConitnueButton();
	 }
	 
	 @Then("I should see {string} text")
	    public void i_should_see_account_created_text(String expectedText) {
		 registerPage.verifyDisplayedText(expectedText);
	 }
	 
	 @Given("I am logged in as {string}")
	 public void I_am_logged_in_as(String expectedText)
	 {
		 registerPage.verifyDisplayedText(expectedText);
	 }
	 
	  @When("I click the Delete Account button")
	  public void I_click_the_Delete_Account_button()
	  {
		  registerPage.clickonDeleteButton();
	  }
	     
		 
	 


}
