package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import com.crm.qa.base.TestBase;

public class CreatenewContactPage extends TestBase {
	
	  @FindBy(xpath="//input[@name='first_name']") 
	  WebElement first_name;
	  @FindBy(xpath="//input[@name='last_name']") 
	  WebElement last_name;
	  @FindBy(xpath="//input[@name='value' and @placeholder = 'Email address']") 
	  WebElement id;
	  @FindBy(xpath="//div[@name='company']//input[@class='search']") 
	  WebElement comp;
	  @FindBy(xpath="//div[@name='category']//i[@class='dropdown icon']") 
	  WebElement categry; 
	  @FindBy(xpath="//span[text()='Lead']") 
	  WebElement cat1;
	  @FindBy(xpath="//div[@name='status']//i[@class='dropdown icon']") 
	  WebElement statusofperson;
	  @FindBy(xpath="//span[text()='New']") 
	  WebElement sta1;
	  @FindBy(xpath="//div[@name='channel_type']//i[@class='dropdown icon']") 
	  WebElement channelofperson;
	  @FindBy(xpath="//span[text()='Instagram']") 
	  WebElement chan1;
	  @FindBy(xpath="//i[@class='save icon']")
	  WebElement savebtn;
	 public CreatenewContactPage()
	 {
		 PageFactory.initElements(driver, this);
	 }
	
	
	public DealsPage createNewContact(String firstname,String lastname,String company,String emailid,String category,String status,String socialchannel) 
	{
		
		/*
		 * driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(
		 * firstname);
		 * driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lastname)
		 * ; driver.findElement(By.xpath("//div[@name='company']//input")).sendKeys(
		 * company); driver.findElement(By.
		 * xpath("//input[@name='value' and @placeholder='Email address']")).sendKeys(
		 * emailid); driver.findElement(By.xpath("//div[@name='category']//i")).click();
		 * driver.findElement(By.xpath("//span[text()='Lead']")).click();
		 * driver.findElement(By.
		 * xpath("//div[@name='status']//i[@class='dropdown icon']")).click();
		 * driver.findElement(By.xpath("//span[text()='New']")).click();
		 * driver.findElement(By.
		 * xpath("//div[@name='channel_type']//i[@class='dropdown icon']")).click();
		 * driver.findElement(By.
		 * xpath("//div[@class='visible menu transition']//span[text()='Facebook']")).
		 * click();
		 */
		first_name.sendKeys(firstname);
		last_name.sendKeys(lastname);
		comp.sendKeys(company);
		id.sendKeys(emailid);
		categry.click();
		cat1.click();
		statusofperson.click();
		sta1.click();
		channelofperson.click();
		chan1.click();
		savebtn.click();
		return new DealsPage();
	}
}
