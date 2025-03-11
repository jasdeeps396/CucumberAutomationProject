package com.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

/*	@Given("I opened automationexercise HomePage")
	public void i_opened_opencart_login_page() {

		if (DriverFactory.getDriver() == null) {
			throw new RuntimeException("WebDriver not initialized in LoginSteps. Check ApplicationHooks.");

		}
		System.out.println("Redirecting to: https://automationexercise.com/");
		DriverFactory.getDriver().get("https://automationexercise.com");

	}

	@And("I have entered a valid {} and {}")
	public void i_have_entered_a_valid_username_and_password(String username, String password) {
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		loginPage.clickOnLoginButton();
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		Assert.assertTrue(loginPage.verifyLoggedinLink(), "Login failed: Logout link not displayed");
	}

	@And("I have entered invalid {} and {}")
	public void i_have_entered_invalid_and(String username, String password) {
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
	}

	@Then("I should get invalid creds message {}")
	public void i_should_get_invalid_creds_message(String message) {
		Assert.assertEquals(loginPage.verifyInvalidCredsMessage(), message, "Invalid credentials message mismatch");
	}
	
	*/
	
	

	    @Given("I navigate to 'http://automationexercise.com'")
	    public void i_navigate_to_automation_exercise() {
	    	if (DriverFactory.getDriver() == null) {
				throw new RuntimeException("WebDriver not initialized in LoginSteps. Check ApplicationHooks.");

			}
			System.out.println("Redirecting to: https://automationexercise.com/");
			DriverFactory.getDriver().get("https://automationexercise.com");

	    }

	    @Then("I should see the home page successfully")
	    public void i_should_see_home_page_successfully() {
	        WebElement homePageElement = driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
	        Assert.assertTrue(homePageElement.isDisplayed(),"Homepage is not displayed");
	    }

	    @When("I click on the 'Signup / Login' button")
	    public void i_click_on_signup_login_button() {
	        driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
	    }

	    @Then("I should see 'Login to your account' visible")
	    public void i_should_see_login_to_your_account_visible() {
	        WebElement loginHeader = driver.findElement(By.xpath("//h2[contains(text(),'Login to your account')]")); 
	        Assert.assertTrue(loginHeader.isDisplayed());
	    }

	    @When("I enter a valid {} and {}")
	    public void i_enter_valid_email_and_password(String email, String password) {
	    	loginPage.enterUsername(email);
			loginPage.enterPassword(password);
	    }

	    @And("I click the 'login' button")
	    public void i_click_login_button() {
	        
	    }

	    @Then("I should see 'Logged in as username' visible")
	    public void i_should_see_logged_in_as_username_visible() {
	        W 
	        Assert.assertTrue(loggedInMessage.isDisplayed());
	        driver.quit();
	    }
}
