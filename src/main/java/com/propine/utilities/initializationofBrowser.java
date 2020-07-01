package com.propine.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class initializationofBrowser 
{
	public static WebDriver browserinitialization(WebDriver driver)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\dateParserAutomation\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
}
