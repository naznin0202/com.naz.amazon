package actionPage;

import org.testng.Assert;

import pageLocator.HomePageLocator;
import utility.MainClass;
import utility.Utility;

public class HomePageAction extends MainClass{
	
	public static void customerServiceLink() {
		HomePageLocator homePage = new HomePageLocator();
		Boolean result = homePage.customer.isDisplayed();
		Assert.assertTrue(result);
		Utility.takeScreenShot(driver, "customerService");
	}
	
	public static void clickCustomerServiceLink() {
		HomePageLocator homePage = new HomePageLocator();
		homePage.customer.click();
	}
}
//1. HomePageAction is child class of MainClass
//2. customerServiceLink method. It verify customerService link is displayed. It also takes screenshot
//3. clickCustomerServiceLink method. It clicks the customerServiceLink.