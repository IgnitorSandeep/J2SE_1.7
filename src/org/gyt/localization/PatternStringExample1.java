package org.gyt.localization;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class PatternStringExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "EEEE";
		SimpleDateFormat formatter = new SimpleDateFormat(pattern, Locale.US);
		Date today = new Date();
		System.out.println(formatter.format(today));
	}

}
