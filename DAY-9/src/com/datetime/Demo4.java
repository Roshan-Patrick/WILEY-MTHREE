package com.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime start = LocalTime.of(10, 10, 10);
		LocalTime end = LocalTime.of(20, 20, 20);
		
		Duration d = Duration.between(start, end);
		System.out.println(d);
		
		Instant startInstant = Instant.now();
		System.out.println(startInstant);
	}

}
