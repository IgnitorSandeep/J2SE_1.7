package org.gyt.localization;

import java.util.Currency;
import java.util.Locale;

public class CurrencyDetails {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale locale = Locale.getDefault();
		Currency currencyInstance = Currency.getInstance(locale);
		System.out.println(" The currency code for locale " + locale
		+ " is: " + currencyInstance.getCurrencyCode()
		+ " \n The currency symbol is " + currencyInstance.getSymbol()
		+ " \n The currency name is " + currencyInstance.getDisplayName());
	}

}
