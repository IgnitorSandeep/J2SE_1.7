package org.gyt.concurrency;

import java.util.concurrent.TimeUnit;

public class TimeUnitEnumerationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.printf("One day has %d hours, %d minutes, %d seconds",
				TimeUnit.DAYS.toHours(1), TimeUnit.DAYS.toMinutes(1), TimeUnit.DAYS.toSeconds(1));
		System.out.printf("\nOne Hours has %d micros",TimeUnit.HOURS.toMicros(1));
	}

}
