package com.masai.twodmatrix;

import java.util.Arrays;
import java.util.Scanner;

public class MissingVowels {
	
	/*
	 * the value stored in N=6 , and str= nature.
	 * 
	 * out of the 5 vowels (a,e,i,o,u)
	 * the world "nature" contains a,u,e
	 * the vowel that are not present in the string are : i,o
	 * 
	 * hence the output is " io "
	 */

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int len= sc.nextInt();
		
		sc.nextLine();
		
		String str=sc.nextLine();
		
		char[] strArr= str.toCharArray();
		
		String vowels="aeiou";
		
		String[] vowelsArr= vowels.split("");
		
		char[] vowelArr2=vowels.toCharArray();
		
		System.out.println(Arrays.toString(strArr));
		
		System.out.println(Arrays.toString(vowelArr2));
		
		for(int i=0; i<vowelArr2.length; i++) {
			
			boolean found=false;
			for(int j=0; j<strArr.length; j++) {
				if(vowelArr2[i]==strArr[j]) {
					found=true;
					break;
				}
				
			}
			
			if(!found) {
				System.out.print(vowelArr2[i]+" ");
			}
					
				
			
		}
	}
}
