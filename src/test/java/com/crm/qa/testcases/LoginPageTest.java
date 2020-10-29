package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.pages.FreeCrmHomePage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	FreeCrmHomePage freecrmpage;
	
	public LoginPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		freecrmpage = new FreeCrmHomePage();
		loginpage = freecrmpage.clickloginbtn();
	}
	@Test
	public void verifyloginpageTitle()
	{
		String title = loginpage.verifyloginpageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
		 
	}
	@Test
	public void clickloginbtnTest()
	{
	     	homepage = loginpage.clickloginbtn(prop.getProperty("e-mail-address"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
