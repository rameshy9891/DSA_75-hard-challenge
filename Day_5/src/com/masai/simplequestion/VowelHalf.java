package com.masai.simplequestion;

import java.util.Scanner;

public class VowelHalf {
	
	/*
	 * we have one string then we have to count of that vowel if half of the vowel is 
	 * present in the string the print true else false;
	 * 
	 * sample input:                      sample output:
	 * 
	 * 6
	 * aabefe                             True
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plse enter the length of string");
		
		int len= sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("plse enter the string ");
		
		String str=sc.nextLine();
		
		if(isVowelHalf(str)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

	private static boolean isVowelHalf(String str) {
		// TODO Auto-generated method stub
		
		char[] strArr= str.toCharArray();
		int count=0;
		
		for(int i=0; i<strArr.length; i++) {
			if(strArr[i]=='a' || strArr[i]=='e' || strArr[i]=='i' || strArr[i]=='o' || strArr[i]=='u') {
				count++;
			}
		}
		
			if(count>=(strArr.length/2)) {
				
				return true;
			
		}
			else {
				return false;
			}
	}

}
