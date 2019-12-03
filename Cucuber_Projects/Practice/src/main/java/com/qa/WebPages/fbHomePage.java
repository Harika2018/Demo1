package com.qa.WebPages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Util.TestBase;

public class fbHomePage extends TestBase{
	
	
	
	@FindBy(xpath = "//img[contains(@alt,Facebook)]")
	public WebElement img;
	
	@FindBy(name="email")
	public WebElement email ;
	
	//TestBase tb = new TestBase();
	public fbHomePage()
	{		
		PageFactory.initElements(driver, this);
	}
	public void checkLogin()
	{
		Initialization();
		 TestBase.driver.get(prop.getProperty("url"));
			
	}
	public void validateImage()
	{
		email.sendKeys(prop.getProperty("username"));
		//if(img.isDisplayed());
			Assert.assertTrue(img.isDisplayed());
		
	}

}
