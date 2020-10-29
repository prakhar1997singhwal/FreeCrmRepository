package com.crm.qa.testcases;

import org.testng.annotations.*;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.CreatenewContactPage;
import com.crm.qa.pages.FreeCrmHomePage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactsPageTest extends TestBase {
	FreeCrmHomePage freecrm;
	LoginPage login;
	HomePage home;
	ContactsPage cp;
	public ContactsPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
		freecrm = new FreeCrmHomePage();
		login =  freecrm.clickloginbtn();
		login = new LoginPage();
		home = login.clickloginbtn(prop.getProperty("e-mail-address"), prop.getProperty("password"));
		Thread.sleep(4000);
		home = new HomePage();
		cp = home.clickonContacts();
		Thread.sleep(4000);
		cp = new ContactsPage();
		Thread.sleep(4000);
	}

	
	  @Test(priority=1) 
	  public void clickondropdown() { 
		  cp.clickdropdownarrow(); 
		  }
	 
	@Test(priority = 2)
	public void selectcheckBox()
	{
		cp.selectCheckBox();
	}
	
	  @Test(priority = 3) 
	  public void clickoneye() 
	  {
		  cp.clickoneyelink(); 
	  }
	 @AfterMethod
	 public void teardown()
	 {
		 driver.quit();
	 }
	
	
	

}
