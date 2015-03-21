package org.gyt.string;

//how to search multiple occurrences of a search string ?
public class SearchString {
	public static void main(String[] s) {
		String str = "I am a learner. I am preparing for OCPJP";
		int fromIndex = 0;
		while (str.indexOf("am", fromIndex) > -1) {
			fromIndex = str.indexOf("am", fromIndex);
			System.out
					.println("Substring \"am\" occurs at index: " + fromIndex);
			fromIndex++;
		}
	}
}

/**
 * 
 ****************************************************************************************************************************
 * 							Methods to Check for Matching Prefix or Suffix in a String 										*
 ****************************************************************************************************************************
 * 					Method									*						 Description							*
 ****************************************************************************************************************************
 * boolean startsWith(String prefixString, int offset) 		*	Starting from offset,check if this string has prefixString. *					*
 ****************************************************************************************************************************
 * boolean startsWith(String prefixString)					*	Check if this string has prefixString; equivalent to        *
 * 															*	startsWith(prefixString, 0); 							    *
 ****************************************************************************************************************************
 * boolean endsWith(String suffixString) 					*		Check if this string has the suffixString.				*
 ****************************************************************************************************************************
 *
 *
 */
