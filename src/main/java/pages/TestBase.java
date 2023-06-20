package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBase {
	public static WebDriver driver;

	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public int generateRandomNum(int boundNum) {
		Random rnd = new Random();
		int generatedNum = rnd.nextInt(boundNum);
		return generatedNum;

	}
	
	public void selectFromDropDown(WebElement element, String visibleText) {

		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}
	

//	public void takeScreenshot(WebDriver driver) {
//		TakesScreenshot ts = (TakesScreenshot) driver;// type casting
//		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//		
//		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
//		Date date = new Date();
//		
//		String label = formatter.format(date);
//		
//		//use label in place of System.currentTimeMillis()
//		
//		File destinationFile = new File(
//				System.getProperty("user.dir") + "/screenshots/" + label + ".png");
//		try {
//			FileUtils.copyFile(sourceFile, destinationFile);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

}
