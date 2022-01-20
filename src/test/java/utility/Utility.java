package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public static void takeScreenShot(WebDriver driver, String screenShot) {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"/Screenshot/"+screenShot+".png"));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
// Utility class has takeScreenShot method. it take and save screen shots