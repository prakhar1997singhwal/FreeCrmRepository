package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.FreeCrmHomePage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.TasksPage;

public class HomePageTest extends TestBase {
	FreeCrmHomePage freecrm;
	LoginPage loginpage;
	HomePage homepage;
	TasksPage taskpage;
	ContactsPage cp;
	public HomePageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		freecrm = new FreeCrmHomePage();
		loginpage =  freecrm.clickloginbtn();
		loginpage = new LoginPage();
		homepage = loginpage.clickloginbtn(prop.getProperty("e-mail-address"), prop.getProperty("password"));
		homepage = new HomePage();
		
	}
	@Test
	public void clicktasklink() throws InterruptedException
	{
		Thread.sleep(2000);
		taskpage = homepage.clickontasks();
	}
	@Test
	public void clickContactslink() throws InterruptedException
	{
		Thread.sleep(2000);
		cp = homepage.clickonContacts();
	}
	@Test
	public void verifyusername()
	{
		homepage.verifyusername();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
