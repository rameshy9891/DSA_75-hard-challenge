package com.masai.logicalquestion;

import java.util.Scanner;

public class VowelAndConsonantCount {
	
	/*
	 * For Example: we have string  str="ramesh"
	 * then print how many vowel and consonant 
	 * output: 2 4
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter length of the string");
		
		int len= sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("plse enter the string that length should be : "+len);
		
		String str= sc.nextLine().toLowerCase();
		
		char[] strArr= str.toCharArray();
		int countVowel=0;
		int countCons=0;
		
		for(int i=0; i<len; i++) {
			if(strArr[i]=='a' || strArr[i]=='e' || strArr[i]=='i' || strArr[i]=='o' || strArr[i]=='u') {
				countVowel++;
			}
			else {
				countCons++;
			}
		}
		
		System.out.print(countVowel+" "+countCons);
		
		
		

	}

}
