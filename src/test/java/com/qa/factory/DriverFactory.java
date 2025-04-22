package com.qa.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class DriverFactory {
	private static WebDriver driver;

	public WebDriver init_driver(String browser) {

		System.out.println("Browser is: " + browser);

		if (browser.equalsIgnoreCase("chrome")) {

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver();

			System.out.println("Chrome browser is set");
		} else if (browser.equalsIgnoreCase("firefox")) {

			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--disable-notifications");
			driver = new FirefoxDriver();

			System.out.println("Firefox browser is set");
		} else if (browser.equalsIgnoreCase("safari")) {

			SafariOptions options = new SafariOptions();
			options.setAutomaticInspection(true);
			options.setAutomaticProfiling(true);
			driver = new SafariDriver();

			System.out.println("Safari browser is set");
		} else {
			throw new IllegalArgumentException("Invalid browser name: " + browser);
		}

		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		return getDriver();
	}

	public static synchronized WebDriver getDriver() {
		if (driver == null) {
			throw new RuntimeException("WebDriver is not initialized. Call init_driver() first.");
		}
		return driver;
	}

	public static void quitDriver() {
		if(driver!=null)
		{
		driver.quit();
	
		}
	}
	
	
	
}
