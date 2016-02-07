package org.gyt.hackerrank.datastructure.stack.balanced_parentheses;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	static boolean isNumber(char num) {
		boolean isNum = false;
		switch(num) {
		
		case '0':
			isNum = true;
			break;
			
		case '1':
			isNum = true;
			break;
			
		case '2':
			isNum = true;
			break;

		case '3':
			isNum = true;
			break;
			
		case '4':
			isNum = true;
			break;

		case '5':
			isNum = true;
			break;

		case '6':
			isNum = true;
			break;

		case '7':
			isNum = true;
			break;

		case '8':
			isNum = true;
			break;
			
		case '9':
			isNum = true;
			break;

		}
		return isNum;
	}
	static boolean isOppositePranthesis(char left, char right) {
		boolean isOpposite = false;
		switch(left) {

		case '(':
			if(right == ')')
				isOpposite = true;
			break;
		case '{':
			if(right == '}')
				isOpposite = true;
			break;
		case '[':
			if(right == ']')
				isOpposite = true;
			break;
		default :
			isOpposite = false;
		}
		return isOpposite;
	}
	static boolean isLeftParanthesis(char ch) {

		boolean isLeftPar = false;
		switch(ch) {
		case '(':
			isLeftPar = true;
			break;
		case '{':
			isLeftPar = true;
			break;
		case '[':
			isLeftPar = true;
			break;
		default:
			isLeftPar = false;
		}

		return isLeftPar;
	}

	static boolean isRightParanthesis(char ch) {

		boolean isRightPar = false;

		switch(ch) {
		case ')':
			isRightPar = true;
			break;
		case '}':
			isRightPar = true;
			break;
		case ']':
			isRightPar = true;
			break;
		default:
			isRightPar = false;
		}

		return isRightPar;
	}

	static boolean isBalanceParanthesis(String str) {
		//System.out.println("[DEBUG] "+str);
		boolean isBalance = false;
		boolean isRightParScene = false;

		Stack<Character> stack = new Stack<Character>();
		int length = str.length();
		//System.out.println("[DEBUG] "+length);
		for(int i =0;i<length ;i++ )  {

			char c = str.charAt(i);
			if(isNumber(c))
				continue;
			
			//System.out.println("[DEBUG] "+c);
			if( isLeftParanthesis(c) ){
				// if(isRightParScene)
				// 	return (isBalance = false);
				stack.push(c);
			}
			else if (isRightParanthesis(c)) {
				isRightParScene = true;
				char item = ' ';
				if(!stack.isEmpty())
				 item = stack.peek();
				else
					return (isBalance = false);
				if(isOppositePranthesis(item, c))
					stack.pop();
				//System.out.println("[DEBUG] "+item);
			}
		}
		if(stack.isEmpty())
			return (isBalance = true);

		//System.out.println("[DEBUG] "+isBalance);
		return isBalance;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Number of Test Cases
		int T = sc.nextInt();

		// Taking all inputs
		String input[]=new String[T];
		for(int i =0;i<T;i++)
		{
			input[i] = sc.next();
		}
		for(String str : input)
		{
			if(isBalanceParanthesis(str))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();

	}
}