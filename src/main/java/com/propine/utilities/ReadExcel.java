package com.propine.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	public static File src;
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static Date da;
	
	public static Object[] readfunction() throws Exception
	{
		src= new File("D:\\Workspace\\dateParserAutomation\\Testdata\\TestData2.xlsx");
		fis= new FileInputStream(src);
		wb= new XSSFWorkbook(fis);
		sheet= wb.getSheetAt(0);
		int rownum=sheet.getLastRowNum();
		
		Object[] str=new Object[rownum];
		
		for(int i=1; i<str.length; i++)
		{
			str[i]=sheet.getRow(i).getCell(0).toString();
	
		}
		
		return str;
		
		
	}
}
