package com.crm.qa.testcases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.CreatenewContactPage;
import com.crm.qa.pages.FreeCrmHomePage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class CreatenewContactPageTest extends TestBase {
	FreeCrmHomePage freecrm;
	LoginPage login;
	HomePage home;
	ContactsPage cp;
	CreatenewContactPage childpage;
	String sheetName = "Contacts";
	
	public  CreatenewContactPageTest() {
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
	    Thread.sleep(3000);
		home = new HomePage();
		cp = home.clickonContacts();
		Thread.sleep(3000);
		cp = new ContactsPage();
        childpage = cp.clickonnewcontactlink();
        Thread.sleep(2000);
       
	}
	@DataProvider
	public Iterator<Object[]> getCRMTestData()
	{
		ArrayList<Object[]> data  = TestUtil.getdatafromexcel();
		return data.iterator();
	}
	@Test(dataProvider = "getCRMTestData")
	public void validateCreateNewContact(String FirstName,String lastname,String company,String email,String category,String status,String socialChannel ) 
	{
		childpage.createNewContact(FirstName,lastname,company,email,category,status,socialChannel);
		
	}
	
	  @AfterMethod public void teardown() 
	  { 
		  driver.quit(); 
	  
	  }
	 

}
