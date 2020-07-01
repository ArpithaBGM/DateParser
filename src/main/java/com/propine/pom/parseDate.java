package com.propine.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class parseDate 
{
	public static WebElement element;
	
	public static void inputDate(WebDriver driver, String Date)
	{
		try {
		// Send date
		element= driver.findElement(By.xpath("//input[@name='date']"));
		element.sendKeys(Date);
		
		// Click on submit
		element=driver.findElement(By.xpath("//input[@type='submit']"));
		element.click();
		
		
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
