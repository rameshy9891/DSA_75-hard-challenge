package com.masai.inputtaking;

import java.util.Scanner;

public class String_3 {
	
	
	/*
	 * 2
	 * 4
	 * aman
	 * 6
	 * rutwik
	 * 
	 * we have to take this input
	 */

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("plse enter the test case");
		
		int tc= sc.nextInt();
		
		for(int i=0; i<tc; i++) {
			
			System.out.println("plse enter the length of string");
			
			int n= sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("plse enter the string");
			
			String str= sc.nextLine();
			
			
		String res=	printTheString(n,str);
		
		
		System.out.println(res);
			
			
		}
	}

	private static String printTheString(int n, String str) {
		// TODO Auto-generated method stub
		
		char[] arr= str.toCharArray();
		
		StringBuilder result= new StringBuilder();
		
		for(int i=0; i<n; i++) {
			if(arr[i]=='a') {
				result.append('z');
			}
			else {
				result.append(arr[i]);
			}
		}
		return result.toString();
	}
}
