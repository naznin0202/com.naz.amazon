package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
	public static Properties prop;
	public static WebDriver driver;
	
	public MainClass(){
		prop = new Properties();
		try {
			FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+"\\Config\\config.properties");
			prop.load(fls);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void initializeWebPage() {
		System.setProperty(prop.getProperty("chromeDriver"), System.getProperty("user.dir")+"\\Driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TestData.pageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestData.pageLoadTimeout, TimeUnit.SECONDS);
	}
	
	public static void launchURL(String url) {
		driver.get(url);
	}
}
//1.  MainClass has two global variables prop and driver
//2. It has MainClass constructor. It initialize prop variable
//3. initializeWebPage() method. It initialize driver variable
//4. launchURL() method. It launches the URL