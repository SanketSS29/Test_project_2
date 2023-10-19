package com.ProjectName.Testclass;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


import com.ProjectName.PageObjectModelClass.BaseClass;
import com.ProjectName.PageObjectModelClass.LoginPage_POM;
import com.ProjectName.Utilities.ExcelOperations;
import com.ProjectName.Utilities.RandomValues;
import com.ProjectName.Utilities.Screenshots;
import com.aventstack.extentreports.Status;



public class LoginTestVerification extends BaseClass
{
	@Test 
	public void Method_LoginTest() throws IOException, InterruptedException
	{
		test = extent.createTest("Verify Application opening");					//title for verification
		
		LoginPage_POM login = new LoginPage_POM(driver);
		
		login.searchValue(Value);
		test.log(Status.PASS, "Value entered successfully");
		
//		login.clickButton();
		
		String expectedTitle = "Google";
		
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle))
		{
			test.log(Status.PASS, "Title verification complete");
		}
		else {
			test.log(Status.FAIL, "Title verification Failed");
			
			String ScreenshotPath = Screenshots.CaptureScreenshot();
			test.addScreenCaptureFromPath(ScreenshotPath);
		}
		System.out.println("verification completed");
	}
	
	
	@Test      // (enabled = false)
	public void SearchDropdown() throws IOException, InterruptedException
	{
		LoginPage_POM login = new LoginPage_POM(driver);
		
		login.getDropDown(SearchResult);
		
		test.log(Status.PASS, "Search Value entered successfully");
		
		System.out.println(driver.getTitle());
		
		String expectedTitile = "google earth - Google Search1";
		
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitile))
		{
			test.log(Status.PASS, "Search Title verification complete");
		}
		else {
			test.log(Status.FAIL, "Search Title verification Failed");
			
			String ScreenshotPath = Screenshots.CaptureScreenshot();
			test.addScreenCaptureFromPath(ScreenshotPath);
		}
		
		String email = RandomValues.randomString()+"@gmail.com";				//from line no. 86
		System.out.println(email);
		
		String pw = RandomValues.randomNumber();
		System.out.println(pw);
		
		
	}
	
	
//	@Test
//	public void dropdown() throws AWTException
//	{
//		LoginPage_POM login = new LoginPage_POM(driver);
//		
//		Robot robot = new Robot();
//		
//		robot.keyPress(java.awt.event.KeyEvent.VK_DOWN);
//		if(login.getText().equals(SearchResult))
//		{
//			robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
//		}
//		robot.keyPress(java.awt.event.KeyEvent.VK_DOWN);
//		robot.keyPress(java.awt.event.KeyEvent.VK_DOWN);
//		robot.keyPress(java.awt.event.KeyEvent.VK_DOWN);	
//	}

	
	
	
	
	
	
}
