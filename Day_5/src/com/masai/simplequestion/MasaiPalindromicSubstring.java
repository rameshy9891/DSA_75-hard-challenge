package com.masai.simplequestion;

import java.util.Scanner;

public class MasaiPalindromicSubstring {
	/*
	 * write a program that returns length of the longest palindromic substring of that string
	 * 
	 * sample input:                    sample output:
	 * 
	 * thisracecarisgood                   7
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println("plse enter the string ");
		
		Scanner sc= new Scanner(System.in);
		
		String str= sc.nextLine();
		
		int max= Integer.MIN_VALUE;
		
		//char[] strArr= str.toCharArray();
		
		for(int i=0; i<str.length(); i++) {
			StringBuilder bag= new StringBuilder();
			for(int j=i; j<str.length(); j++) {
				
				bag.append(str.charAt(j));
				
				//System.out.println(bag);
				
				if(check(bag.toString()) && max<bag.length()) {
					max=bag.length();
				}
				
				
			}
		}
		System.out.println(max);
	}

	private static boolean check(String string) {
		// TODO Auto-generated method stub
		StringBuilder bag1= new StringBuilder();
		
		for(int i=0; i<string.length(); i++) {
			bag1.append(string.charAt(i));
		}
		
		StringBuilder bag2= new StringBuilder();
		
		for(int j=string.length()-1; j>=0; j--) {
			bag2.append(string.charAt(j));
		}
		
		
		return bag1.toString().equals(bag2.toString());
	}

}
