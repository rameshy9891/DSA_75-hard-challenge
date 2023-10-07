package com.masai.ArrrayInterview;

import java.util.Scanner;

public class BagOfLatters {
	
	/*
	 * sample input:                       sample output: 
	 * 5                                      Yes
	 * aabbc
	 * 3
	 * abc
	 * 
	 * 
	 * 
	 * 
	 * sample input:                       sample output:
	 * 5                                       No
	 * aabbc
	 * 4
	 * abcd
	 */
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the length first string");
		
		int len1= sc.nextInt();
		
		sc.nextLine();
		System.out.println("enter the string or bag of letter");
		char[] strArr1= sc.nextLine().toCharArray();
		
		System.out.println("enter the length of clay");
		int len2=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("enter of the clay string");
		char[] strArr2= sc.nextLine().toCharArray();
		
		int count=0;
		
		for(int i=0; i<len2; i++) {
			for(int j=0; j<len1; j++) {
				if(strArr1[i]==strArr2[j]) {
					count++;
					break;
				}
			}
		}
		
		System.out.println(len2==count?"Yes":"No");
		
		
	}

}
