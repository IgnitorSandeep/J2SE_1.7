package org.gyt.io;

import java.util.ArrayList;
import java.util.Scanner;

public class Freelauncers {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int testcases;
		int startcase;

		Scanner sc= new Scanner(System.in);
		//System.out.println("enter testcase :");
		testcases = sc.nextInt();
		ArrayList<String> cases = new ArrayList<>();
		ArrayList<Integer> nooflauncers = new ArrayList<>();

		for (int i = 0; i < testcases; i++) {
			//System.out.println("Starting case " + (i + 1));
			startcase = sc.nextInt();
			//System.out.println("enter preferences");
			String caseString = "";
			for (int j = 0; j <= startcase; j++) {
				caseString += sc.nextLine();
				caseString += "\n";
			}
			cases.add(caseString);
			nooflauncers.add(startcase);
		}

		for (int i = 0; i < testcases; i++) {
			System.out.println("Case#" + (i + 1));
			System.out.println(isBestAssignmentPossible(cases.get(i),nooflauncers.get(i)));
		}
	}


	public static int isBestAssignmentPossible(String inputcases,int launcers) {
		int isPossible = 0;
		
		String preferences[] = inputcases.split("\n");
		for(String a:preferences){
			String a1[] = a.split(" ");
			Integer.parseInt(a1[1]);
			
		}
		return isPossible;

	}

	{

	}

}
