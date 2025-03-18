package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"timeline:test-output-thread/" }, monochrome = true,
//tags="@Regression123",
		publish = true, glue = { "com.stepDefinitions", "AppHooks" }, features = "src/test/resources/features")

public class TestRunner extends AbstractTestNGCucumberTests {

}
