package pageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utility.MainClass;

public class HomePageLocator extends MainClass {
	public HomePageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.LINK_TEXT, using="Customer Service")
	public WebElement customer ; 
}
//1. HomePageLocator is child class of MainClass
//2. HomePageLocator constructor. it initialize the pageFactory with driver
//3. It has one webElement customer. I have used LinkText to find it.