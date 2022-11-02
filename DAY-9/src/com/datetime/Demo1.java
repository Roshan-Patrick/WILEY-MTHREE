package com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date date = new Date();
//		System.out.println(date);
//		
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTime(date);
//		
//		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//		System.out.println(calendar.get(Calendar.YEAR));
		
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		LocalDate jan1 = LocalDate.of(2012,Month.JANUARY, 1);
		System.out.println(jan1);
		
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println(LocalDate.parse("22-Feb-2014",formatter)); //String into LocalDate
	}

}
