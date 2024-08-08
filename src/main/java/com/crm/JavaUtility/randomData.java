package com.crm.JavaUtility;

import java.time.LocalDate;
import java.util.Random;

public class randomData {
	public static int genrateRandomData(int limit) {
		Random random = new Random();
		return random.nextInt(limit);	
	}
	public static String startDate() {
		LocalDate start=LocalDate.now();
		return start.toString();
	
	}

}
