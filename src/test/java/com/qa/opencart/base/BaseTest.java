package com.qa.opencart.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.LoginPage;
import com.qa.opencart.tests.LoginPageTest;

public class BaseTest {
	//by default what is the access modifiers for below ref variables?-default
	DriverFactory df;
	WebDriver driver; 
	//what would be right access modifiers: either public or protected 
	//private would restrict which I dont want 
	//protected can be used in child class either in same package or in a 
	//different package can access that
	protected LoginPage loginPage; 
	
	
	@BeforeTest
	public void setup() {
		df=new DriverFactory(); 
		driver= df.initDriver("chrome");
		loginPage = new LoginPage(driver);
	
		
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
