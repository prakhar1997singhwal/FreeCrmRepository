package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {
	@FindBy(xpath="//div[@class='ui right secondary pointing menu toolbar-container']//i[@class='dropdown icon']")
	WebElement dropdown;
	JavascriptExecutor executor;
	@FindBy(xpath="//td[contains(text(),'Abhinav Tonk')]//parent::tr//descendant::input")
	WebElement checkbox;
	@FindBy(xpath="//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[8]/a[1]")
	WebElement eyeicon;
	@FindBy(xpath="//a[@href='/contacts/new']//button[@class='ui linkedin button']")
	WebElement newcontact;
	public ContactsPage()
	{
		this.executor = (JavascriptExecutor)driver;
		PageFactory.initElements(driver, this);
	}
	public ContactsPage clickdropdownarrow()
	{
		dropdown.click();
		return this;
	}
	public ContactsPage selectCheckBox()
	{
		 executor.executeScript("arguments[0].click();",checkbox);
         return this;		
	}
	public CreatenewContactPage clickoneyelink()
	{
		executor.executeScript("arguments[0].click();", eyeicon);
		return new CreatenewContactPage();
	}
	
	public CreatenewContactPage clickonnewcontactlink()
	{
		newcontact.click();
		return new CreatenewContactPage();
		
	}
}
