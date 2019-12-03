package com.qa.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	TestUtil utilT = new TestUtil(); 
	public TestBase()
	{
		
		try
		{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\harik\\eclipse-workspace\\practice\\Practice\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(fis);
		}
		
		catch(IOException e)
		{
			e.getMessage();
		}
	}
	
	public void Initialization()
	{
		
		String browser = prop.getProperty("browser");
		if(browser.contentEquals("FF"))
		{
			System.setProperty("webdriver.gecko.driver",prop.getProperty("firefoxDriverPath"));
			driver = new FirefoxDriver();		
		}
		else if(browser.contentEquals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",prop.getProperty("chromeDriverPath"));
			driver = new ChromeDriver();		
		}
			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(utilT.pageLoadWait, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(utilT.implicitlyWait, TimeUnit.SECONDS);
			

	}
	
	

}
