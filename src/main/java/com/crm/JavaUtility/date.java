package com.crm.JavaUtility;

import java.time.LocalDate;

public class date {
	public static String startdate()
	{
		LocalDate date = LocalDate.now();
		return date.toString();
	}
	public static String enddate()
	{
		LocalDate date = LocalDate.now();
		return date.plusYears(1).toString();
	}

}