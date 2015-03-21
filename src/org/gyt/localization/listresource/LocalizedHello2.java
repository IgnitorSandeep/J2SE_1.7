package org.gyt.localization.listresource;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedHello2 {
	
	//Retrun movie details
	public static void printMovieDetails(ResourceBundle resBundle){
		
		String movieName = resBundle.getString("MovieName");
		Long grossRevenue = (Long)resBundle.getObject("GrossRevenue");
		Integer year = (Integer)resBundle.getObject("Year");
		System.out.printf("Movie name : "+movieName+", Gross Revenue : "+grossRevenue+",Release Year :"+year);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Get current locale
		Locale locale = Locale.getDefault();
		printMovieDetails(ResourceBundle.getBundle("ResBundle", locale));
		
		// print the largest box-office hit movie for Italian locale
		locale = new Locale("it", "IT", "");
		printMovieDetails(ResourceBundle.getBundle("ResBundle", locale));

	}

}
