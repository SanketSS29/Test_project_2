package com.ProjectName.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class getDataFromExcelSheet 
{
	
	public static String getDataFromExcel(int i, int j) throws IOException
	{
//	give excel sheet path here
	
	File file = new File("C:\\Users\\Om Computers\\eclipse-workspace\\TestProject\\Report\\htmlreport2023-10-118.html");
	
	FileInputStream inputstream = new FileInputStream(file);	//Excel file convert into InputStream
	
//	WorkbookFactory method supports only one format of excel file
//	XSSFWorkbook method supports all formats of excel file
	
	XSSFWorkbook wb = new XSSFWorkbook(inputstream);			//Excel application open
	
	XSSFSheet sheet = wb.getSheet("Sheet1");					//taking 1st Excel Sheet (enter Sheet Name)
//	XSSFSheet sheetNum = wb.getSheetAt(0);						//taking sheet with index number
	
	XSSFRow row =  sheet.getRow(i);								//taking 'i' row
	
	XSSFCell cell = row.getCell(j);								//taking 'j' column
	
	String data = cell.getStringCellValue();					//getting value of row and cell in string value
	
	return data;
	
	}
	
	
	public void ReadExcelSheet() throws IOException
	{
		File file = new File("C:\\Users\\Om Computers\\eclipse-workspace\\TestProject\\Report\\htmlreport2023-10-118.html");
		
		FileInputStream inputstream = new FileInputStream(file);	//Excel file convert into InputStream
		
		XSSFWorkbook wb = new XSSFWorkbook(inputstream);			//Excel application open
		
		XSSFSheet sheet = wb.getSheet("Sheet1");					//taking 1st Excel Sheet (enter Sheet Name)
//		XSSFSheet sheetNum = wb.getSheetAt(0);						//taking sheet with index number
		
		int rowcount = sheet.getLastRowNum();						//returns row count (getting last row count)
		
		int colcount = sheet.getRow(0).getLastCellNum();			//returns column/cell count
		
		for(int i=0; i<rowcount; i++)
		{
			XSSFRow currentrow = sheet.getRow(i);					//focused on current row
			
			for(int j=0; j<colcount; j++)
			{
				String value = currentrow.getCell(j).toString();	//read the value from cell
//				we used here getStringValue, getNumericCellValue, getBooleanCellValue method but we used toString is generic method for all data
				
				System.out.print("  " + value);
			}
			System.out.println();
		}
		
	}
	
	
//	@DataProvider(name = "LoginData")				//give this name to @test for that which test is to be run
//	public String [][]getData() throws IOException
//	{
//		String path = "path of excel sheet";
//		
//		ExcelOperations excelop = new ExcelOperations(path);
//		
//		int totalrows = excelop.getRowCount("Sheet1");
//		int totalcols = excelop.getCellCount("Sheet1", 1);
//		
//		String loginData[][] = new String [totalrows][totalcols];
//		
//		for(int i =1; i<=totalrows; i++)
//		{
//			for(int j=0; j<totalcols; j++)
//			{
//				loginData [i-1][j] = excelop.getCellData("Sheet1", i, j);
//				
//			}
//		}
//		
//		return loginData;
//	}
	
	

}
