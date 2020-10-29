package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.FreeCrmHomePage;
import com.crm.qa.pages.LoginPage;

public class FreeCrmHomePageTest extends TestBase {
	FreeCrmHomePage f;
	public FreeCrmHomePageTest()
	{
		 super();
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		 f = new FreeCrmHomePage();
		
	}
	@Test(priority=1)
	public void freeCrmTitleTest()
	{
       String title = f.validateLoginPageTitle();	
       Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
	}
	@Test(priority=2)
	public void loginbtntest()
	{
		LoginPage l = f.clickloginbtn();
		 String title = driver.getTitle();
		 Assert.assertEquals(title, "Cogmento CRM");
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
