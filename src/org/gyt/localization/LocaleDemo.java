package org.gyt.localization;


import java.util.*;

public class LocaleDemo {

   public static void main(String[] args) {

      // create a new locale
      Locale locale1 = new Locale("en", "US", "WIN");

      // print locale
      System.out.println("Locale:" + locale1);

      // print the locale as a string
      System.out.println("Locale:" + locale1.toString());

      // create a new locale
      Locale locale2 = new Locale("fr", "FRANCE", "WIN");

      // print locale
      System.out.println("Locale2:" + locale2);

      // print the locale as a string
      System.out.println("Locale2:" + locale2.toString());

   }
}