package com.propine.main;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.propine.pom.parseDate;
import com.propine.utilities.ReadExcel;
import com.propine.utilities.captureScreenshot;
import com.propine.utilities.initializationofBrowser;

public class mainClass 
{
	public static WebDriver driver;
	public static WebDriver dr;
	
	@BeforeMethod
	public static void getsite()
	{
		driver= initializationofBrowser.browserinitialization(dr);
		driver.get("https://vast-dawn-73245.herokuapp.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider="getData")
	public static void callparseDate(String date) throws Exception
	{
		parseDate.inputDate(driver, date);
		
		}
	
	@DataProvider
	public Object[] getData() throws Exception {
		Object[] data = ReadExcel.readfunction();
		return data;

	}
	
	@AfterMethod
	public static void closebrowser() {
		driver.quit();
	}
	
}
