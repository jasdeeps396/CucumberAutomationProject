package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class DriverFactory {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public WebDriver init_driver(String browser) {

		System.out.println("Browser is: " + browser);

		if (browser.equalsIgnoreCase("chrome")) {

//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--disable-notifications");
			driver.set(new ChromeDriver());
			System.out.println("Chrome browser is set");
		} else if (browser.equalsIgnoreCase("firefox")) {

//            FirefoxOptions options = new FirefoxOptions();
//            options.addArguments("--disable-notifications");
			driver.set(new FirefoxDriver());
			System.out.println("Firefox browser is set");
		} else if (browser.equalsIgnoreCase("safari")) {
//        	
//            SafariOptions options = new SafariOptions();
//            options.setAutomaticInspection(true);
//            options.setAutomaticProfiling(true);
			driver.set(new SafariDriver());
			System.out.println("Safari browser is set");
		} else {
			throw new IllegalArgumentException("Invalid browser name: " + browser);
		}

		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}

	public static synchronized WebDriver getDriver() {
		if (driver.get() == null) {
			throw new RuntimeException("WebDriver is not initialized. Call init_driver() first.");
		}
		return driver.get();
	}
}
