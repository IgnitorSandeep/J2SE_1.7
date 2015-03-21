package org.gyt.localization;
import java.util.*;
import java.text.*;
public class PatternStringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "dd-MM-yy"; /* d for day, M for month, y for year */
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);
		// the default Date constructor initializes to current date/time
		System.out.println(formatter.format(new Date()));
	}

}
