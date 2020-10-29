package com.crm.qa.util;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.ExcelReader;

public class TestUtil extends TestBase {
	public static long PAGE_LOAD_TIMEOUT = 60;
	public static long IMPLICIT_WAIT = 30;
	static ExcelReader reader;
	public static ArrayList<Object[]> getdatafromexcel()
	{
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		try
		{
			reader = new ExcelReader("C:\\Users\\KIIT\\eclipse-workspace\\FreeCrmTest2\\src\\main\\java\\com\\crm\\qa\\testdata\\contactsdata.xlsx");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		for(int rowCnt =2;rowCnt<=reader.getRowCount("Contacts");rowCnt++)
		{
			String firstname = reader.getCellData("Contacts", "First Name" , rowCnt);
			String lastname = reader.getCellData("Contacts", "Last Name", rowCnt);
			String company = reader.getCellData("Contacts", "Company", rowCnt);
			String email= reader.getCellData("Contacts", "Email", rowCnt);
			String category= reader.getCellData("Contacts", "Category", rowCnt);
			String status= reader.getCellData("Contacts", "Status", rowCnt);
			String social_channel= reader.getCellData("Contacts", "Social Channel", rowCnt);
			Object obj[] = {firstname,lastname,company,email,category,status,social_channel};
			mydata.add(obj);
		}
		return mydata;
	}
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
}

