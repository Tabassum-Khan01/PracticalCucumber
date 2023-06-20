package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.BackgroundPage;
import pages.TestBase;

public class SkyBlueBackGroundStepDefinition extends TestBase {
	BackgroundPage backgroundPage;

	@Before
	public void beforeRun() {
		initDriver();
		backgroundPage = PageFactory.initElements(driver, BackgroundPage.class);
	}

	@Given("User is on the test page")
	public void user_is_on_the_test_page() {
		driver.get("https://techfios.com/test/102/");
	}

	@When("User clicks on the {string} button")
	public void user_clicks_on_the_button(String string) {
		backgroundPage.clickSkyBlueButton();
	}

	@Then("The background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() {
		String backgroundColor = backgroundPage.getBackgroundColor();
		String expectedColor = "skyblue";
		Assert.assertEquals("Background color is not " + expectedColor, expectedColor, backgroundColor);
	}

}
