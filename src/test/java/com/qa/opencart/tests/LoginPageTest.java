package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class LoginPageTest extends BaseTest {

	@Test
	public void loginPageTest() {
		// if you dont provide an access modifier in the base class loginpage ref
		// then if wont be able to locate
		
		
		String actualTitle = loginPage.getloginPageTitle();
		String expectedTitle = "Account Login";

		// if are not asserting anything, you are not testing
		// POM says: in page classes there should not have any assertion
		
		
		Assert.assertEquals(actualTitle, expectedTitle);

	}
	@Test
	public void loginPageUrlTest() {
		// if you dont provide an access modifier in the base class loginpage ref
		// then if wont be able to locate
		
		
		String actualUrl = loginPage.getloginPageUrl();
		String expectedUrl = "route=account/login";
		
		// if are not asserting anything, you are not testing
		// POM says: in page classes there should not have any assertion
		
		
		Assert.assertTrue(actualUrl.contains(expectedUrl));
	}
	@Test
	public void forgotPwdLinkExistTest() {
		Assert.assertTrue(loginPage.isForgotPwdLinkDisplayed());
	}
	@Test
	public void loginTest() {
		loginPage.doLogin("qatestertest@gmail.com","Test@123");
		
	}

}
