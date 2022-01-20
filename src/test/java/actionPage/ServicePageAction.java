package actionPage;

import org.testng.Assert;

import pageLocator.ServicePageLocator;
import utility.MainClass;
import utility.Utility;

public class ServicePageAction extends MainClass{
	public static void verifyCustomerServicePage() {
		ServicePageLocator servicePage = new ServicePageLocator();
		Boolean result = servicePage.customerPage.isDisplayed();
		Assert.assertTrue(result);
		Utility.takeScreenShot(driver, "customerServicePage");
	}

}
//1. ServicePageAction is child class of MainClass
//2. verifyCustomerServicePage method. It verify customerServicePage is displayed. It also takes screenshot
