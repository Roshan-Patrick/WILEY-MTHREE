package com.datetime;

import java.time.LocalDate;
import java.time.Period;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate startdate = LocalDate.of(2008, 8, 24);
		LocalDate enddate = LocalDate.of(2009, 6, 28);
		
		Period periodBetween = Period.between(startdate, enddate);
		System.out.println(periodBetween);
		
		System.out.println(periodBetween.getDays()+ " -Days "+periodBetween.getMonths() + " -Months");
	}

}
