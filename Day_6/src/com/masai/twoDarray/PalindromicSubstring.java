package com.masai.twoDarray;

import java.util.Scanner;

public class PalindromicSubstring {
	/*
	 * longest substring count
	 * thisracecarisgood           7
	 * 
	 */
	public static void main(String[] args) {
		
		System.out.println("plse enter the string");
		Scanner sc= new Scanner(System.in);
		
		String str= sc.nextLine();
		
		int max=Integer.MIN_VALUE;
		
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
		
		StringBuilder bag= new StringBuilder();
		
		for(int i=string.length()-1; i>=0; i--) {
		    bag.append(string.charAt(i));
		}
		return bag.toString().equals(string);
	}

}
