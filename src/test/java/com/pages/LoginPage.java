package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

	private WebDriver driver;
	private By emailId = By.id("input-email");
	private By passwordField = By.id("input-password");
	private By submit = By.xpath("//input[@type='submit']");
	private By logoutLinkLocator = By.linkText("Logout");
	private By homePageElement = By.id("slider-carousel");
	private By signupLoginButton = By.xpath("//a[@href='/login']");
	private By loginHeader = By.xpath("//h2[contains(text(),'Login to your account')]");
	private By loggedInMessage = By.xpath("//a[contains(text(),'Logged in as')]");
	private By warningMessageLocater = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	private By loginButton = By.xpath("//button[contains(text(),'Login')]");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String userName) {
		driver.findElement(emailId).sendKeys(userName);

	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}

	public void clickOnLoginButton() {
		driver.findElement(submit).click();
	}

	public boolean verifyLoggedinLink() {
		return driver.findElement(logoutLinkLocator).isDisplayed();
	}

	public String verifyInvalidCredsMessage() {
		return driver.findElement(warningMessageLocater).getText();
	}

}
