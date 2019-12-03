package StepDefs;

import org.openqa.selenium.WebDriver;
import com.qa.WebPages.fbHomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepImplementations {
	public static WebDriver driver ;
	fbHomePage fbHome = new fbHomePage();
	
	@Given("^user opens the facebook url$")
	public void open_fb_url()
	{
		fbHome.checkLogin();		

	}
	@Then("^user is able to click on fb image$")
	public void user_is_able_to_click_on_fb_image(){
		fbHome = new fbHomePage();
		fbHome.validateImage();
	    
	}

}
