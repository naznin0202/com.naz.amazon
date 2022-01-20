package runner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utility.MainClass;

@CucumberOptions(features = {"C:\\Users\\tufan\\eclipse-workspace\\com.naz.amazon\\feature"}, //Change to correct path
plugin = {"json:target/cucumber.json"},
glue = "stepDef")//, tags="@naz2")

public class Runner extends AbstractTestNGCucumberTests{
	@BeforeTest
	public void launchURL() {
		MainClass test = new MainClass();
		test.initializeWebPage();
	}
	
	@AfterTest
	public void closeURL() {
		MainClass.driver.quit();
	}
}

//1. First 3 lines are copy-paste code
//2. Runner class is child class of AbstractTestNGCucumberTests
//3. BeforeTest, launchURL method. It calls initializeWebPage() method from mainClass
//4. AfterTest, closeURL method. It closes the browser