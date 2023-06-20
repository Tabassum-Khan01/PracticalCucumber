package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BackgroundPage extends TestBase {
	WebDriver driver;

	public BackgroundPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
	WebElement SetSkyBlueBackgroundButton;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
	WebElement SetWhiteBackgroundButton;

	public void clickSkyBlueButton() {
		SetSkyBlueBackgroundButton.click();

	}

	public String getBackgroundColor() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		return (String) jsExecutor.executeScript("return window.getComputedStyle(document.body).backgroundColor");
	}
	public void clickWhiteButton() {
		SetWhiteBackgroundButton.click();
	}
}
