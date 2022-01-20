package stepDef;

import actionPage.HomePageAction;
import actionPage.ServicePageAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utility.MainClass;

public class StepDef extends MainClass {
	@Given("^Launch Amazon url$")
	public void launch_Amazon_url() throws Throwable {
		MainClass.launchURL(prop.getProperty("amazonURL"));
	}

	@Then("^Verify amazon home page has customer service link$")
	public void verify_amazon_home_page_has_customer_service_link() throws Throwable {
		HomePageAction.customerServiceLink();	
	}
	
	
	@Then("^Click the customer service link$")
	public void click_the_customer_service_link() throws Throwable {
		HomePageAction.clickCustomerServiceLink();
	}

	@Then("^Verify amazon displays customer service page$")
	public void verify_amazon_displays_customer_service_page() throws Throwable {
	    ServicePageAction.verifyCustomerServicePage();    
	}
}
//1. StepDef is child class of MainClass
//2. It has 4 methods generated from feature file
//3. I'll comeback here after I finish pageLocator and pageAction Class

//2nd Time
//1. launch_Amazon_url() method. It calls  launchURL method from MainClass
//2. verify_amazon_home_page_has_customer_service_link method.  It calls customerServiceLink method from HomePageAction
//3. click_the_customer_service_link method. It calls clickCustomerServiceLink method from HomePageAction
//4. verify_amazon_displays_customer_service_page method. It calls verifyCustomerServicePage from ServicePageAction