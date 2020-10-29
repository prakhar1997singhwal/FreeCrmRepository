package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//page factory or object repository
	@FindBy(xpath ="//a[@href ='https://ui.freecrm.com']")
	WebElement log_inbutton;
	@FindBy(xpath ="//input[@name='email']")
	WebElement email_address;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//div[text()='Login']")
	WebElement loginbtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	public String verifyloginpageTitle()
	{
		return driver.getTitle();
	}
	public HomePage clickloginbtn(String email_add,String pass)
	{
		email_address.sendKeys(email_add);
		password.sendKeys(pass);
		loginbtn.click();
		return new HomePage();
	}
	

}
