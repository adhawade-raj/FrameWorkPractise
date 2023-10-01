package com.qa.opencart.tests;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class LoginPageTest extends BasePage{

	@Test(priority =1)
	public void LoginPageTitleTest()
	{
		String actTitle=loginpage.getLoginPageTitle();
		System.out.println("Page Title:"+actTitle);	
		//Assert.assertEquals(actTitle,"LoginPageTitleTest");
		org.testng.Assert.assertEquals(actTitle, "Your Store");
	}
}
