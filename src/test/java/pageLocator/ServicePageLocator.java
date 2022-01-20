package pageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utility.MainClass;

public class ServicePageLocator extends MainClass{
	public ServicePageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.CSS, using="body[class=\"a-m-us a-aui_72554-c a-aui_accordion_a11y_role_354025-c a-aui_killswitch_csa_logger_372963-c a-aui_launch_2021_ally_fixes_392482-c a-aui_pci_risk_banner_210084-c a-aui_preload_261698-c a-aui_rel_noreferrer_noopener_309527-c a-aui_template_weblab_cache_333406-c a-aui_tnr_v2_180836-c a-meter-animate\"]")
	public WebElement customerPage ; 
}
//1. ServicePageLocator is child class of MainClass
//2. ServicePageLocator constructor. it initialize the pageFactory with driver
//3. It has one webElement customerPage. I have used CSS element to find it.