package com.ProjectName.Utilities;

import java.time.LocalDateTime;


public class DateAndTime 
{
	
	public static LocalDateTime currentDateTime()
	{
		LocalDateTime ldt = LocalDateTime.now();	
		System.out.println(ldt);
		return ldt;
	}
	
	

}
