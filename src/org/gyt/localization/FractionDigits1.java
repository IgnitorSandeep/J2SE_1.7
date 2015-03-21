package org.gyt.localization;

import java.text.NumberFormat;
import java.text.ParseException;

public class FractionDigits1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] numbers = { "1.222", "0.456789F" };
		NumberFormat numberFormat = NumberFormat.getInstance();
		numberFormat.setMaximumFractionDigits(2);
		for (String number : numbers) {
			try {
				System.out.println(numberFormat.parse(number));
			} catch (ParseException pe) {
				System.out.println("Failed parsing " + number);
			}
		}
	}

}
