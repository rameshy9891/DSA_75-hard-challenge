package com.masai.firstunitend;

import java.util.Scanner;

public class MissingVowels {
	
	/*
	 * Description:
	 * 
	 * out of the 5 vowels (a,e,i,o,u)
	 * the word "nature" contains  a,u,e
	 * the vowel that are not present in the string are: i,o
	 * 
	 * hence the output is : io
	 * 
	 * Note: the string contains only lower case english alphabets
	 * 
	 * sample input:                     sample output:
	 * 6
	 * nature                              io
	 */
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length");
		int len= sc.nextInt();
		
		System.out.println("enter the string");
		sc.nextLine();
		
		String str= sc.nextLine();
		
		String vowels="aeiou";
		
		char[] vowelsArr= vowels.toCharArray();
		
		StringBuilder bag= new StringBuilder();
		
		for(int i=0; i<vowelsArr.length; i++) {
			if(!str.contains(String.valueOf(vowelsArr[i]))) {
				bag.append(vowelsArr[i]);
			}
			
			
		}
		
		System.out.println(bag.toString());
		
	}

}
