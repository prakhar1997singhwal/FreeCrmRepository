package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//div[@id='top-header-menu']//descendant::span[text()='Prakhar Singhwal']")
	WebElement homepageText;
    @FindBy(xpath ="//div[@id='main-nav']//a[@href ='/contacts']")
    WebElement contactslink;
    @FindBy(xpath ="//div[@id='main-nav']//a[@href ='/tasks']")
    WebElement taskslink;
    @FindBy(xpath ="//div[@id='top-header-menu']//span[@class='user-display']")
    WebElement username;
    
    public HomePage()
    {
    	PageFactory.initElements(driver,this);
    }
    public String gethomePageText()
    {
		return homepageText.getText();
    	
    }
    public ContactsPage clickonContacts()
    {
           contactslink.click();
           return new ContactsPage();
    	
    }
    public TasksPage clickontasks()
    {
    	taskslink.click();
           return new TasksPage();
    	
    }
    public HomePage verifyusername()
    {
    	String text = username.getText();
    	Assert.assertEquals(text, "Prakhar Singhwal");
    	return this;
    	
    }
}
 