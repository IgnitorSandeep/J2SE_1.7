package org.gyt.io;

import java.util.ArrayList;
import java.util.Scanner;

public class ContinuosSubsequent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int testcases;
		int startcase;

		Scanner sc= new Scanner(System.in);
	
		testcases = sc.nextInt();
	

		for (int i = 0; i < testcases; i++) {
			startcase = sc.nextInt();
			String caseString = "";
			for (int j = 0; j <= startcase; j++) {
				caseString += sc.nextLine();
			}
			
		}

		for (int i = 0; i < testcases; i++) {
			System.out.println("Case#" + (i + 1));
			//System.out.println(continiousSubsequent(,,));
		}
	}

	int continiousSubsequent(int squence[],int numbers,int divisible){
		int subsequent =0;
		
		
		return subsequent;
	}
	

}
