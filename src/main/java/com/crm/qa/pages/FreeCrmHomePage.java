package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class FreeCrmHomePage extends TestBase {
	
	@FindBy(xpath = "//a[@href = 'https://ui.freecrm.com']")
	WebElement loginbtn;
	@FindBy(xpath = "//span[@class ='mdi-chart-bar icon icon-md']")
	WebElement signupbtn;
	@FindBy(xpath="//ul[@class='rd-navbar-nav']//descendant::li[@class='rd-navbar--has-dropdown rd-navbar-submenu']//following-sibling::li[@class='rd-navbar--has-dropdown rd-navbar-submenu']//span")
	WebElement Appsdropdown;
	@FindBy(xpath ="//ul[@class='rd-navbar-nav']//descendant::li//following-sibling::li[@class='rd-navbar--has-dropdown rd-navbar-submenu opened']//a[text()='Android']")
	WebElement android;
	public FreeCrmHomePage()
	{
		PageFactory.initElements(driver,this);
	}
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	public LoginPage clickloginbtn()
	{
		loginbtn.click();
		return new LoginPage();
	}
	public SignUpPage clicksignUpbtn()
	{
		signupbtn.click();
		return new SignUpPage();
	}
	public AndroidPage clickandroidbtn()
	{
		android.click();
		return new AndroidPage();
	}
	public FreeCrmHomePage clickdropdownbtn()
	{
		Appsdropdown.click();
		return this;
	}
	

}
