package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features",
        glue = {"com.qa.mystepdefs"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        publish = true,
        tags = "@AllValidations")


	
	public class TestRunner extends AbstractTestNGCucumberTests 
	{	
		
	}
