package com.masai.midlevel;

import java.util.Scanner;

public class CheckPalindrome {
	
	/*
	 * sample input:                          sample output:
	 * 6 
	 * nrupul                                     No
	 */
	
	public static void main(String[] args) {
		System.out.println("plse enter the length of string");
		Scanner sc= new Scanner(System.in);
		
		int len= sc.nextInt();
		
		System.out.println("plse enter the string");
		
		sc.nextLine();
		
		String str= sc.nextLine();
		
		System.out.println(checkPalindrome(str,len) ? "Yes" : "No");
	}

	private static boolean checkPalindrome(String str, int len) {
		// TODO Auto-generated method stub
		
		char[] strArr= str.toCharArray();
		
		StringBuilder bag= new StringBuilder();
		
		
		for(int i=strArr.length-1; i>=0; i--) {
			bag.append(strArr[i]);
		}
		
		return bag.toString().equals(str);
		
	
	}

}
