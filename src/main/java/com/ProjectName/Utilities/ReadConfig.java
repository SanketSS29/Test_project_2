package com.ProjectName.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig 
{
	
	Properties pro;
	
	FileInputStream file ;
	
	
	public ReadConfig()  
	{
	
	File src = new File("C:\\Users\\Om Computers\\eclipse-workspace\\TestProject\\Configuration\\config.properties");
	
	try {
		
	file = new FileInputStream(src);
	
	pro = new Properties();
	
	pro.load(file);

		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Exception is " + e.getMessage());
		}
	
	}
	
	
	
	public String getApplicationURL()
	{
		String url = pro.getProperty("File_BaseURL");
		
		return url;
	}
	
	
	public String getSearchValue()
	{
		String SearchValue = pro.getProperty("File_SearchValue");
		
		return SearchValue;
	}
	
	public String getSearchResult()
	{
		String searchresult = pro.getProperty("File_SearchResult");
		
		return searchresult;
	}
	
	
}
