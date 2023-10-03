package com.masai.simplequestion;

import java.util.Arrays;
import java.util.Scanner;

public class StringValue {
	
	/*
	 * the value of the alphabet a is 1, b is 2, c is 3.......till z is 26.
	 * 
	 * sample input :  aba                   sample output : 4
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string ");
		String str=sc.nextLine();
		
		String alpha="abcdefghijklmnopqrstuvwxyz";
		
		
//		int[] obj= new int[26];
//		
//		for(int i=0; i<26; i++) {
//			obj[i]= (i+1);
//		}
		
		//System.out.println(Arrays.toString(obj));
		
		int sum=0;
		
		for(int i=0; i<str.length(); i++) {
			char currentChar= str.charAt(i);
			
			for(int j=0; j<alpha.length(); j++) {
				if(currentChar==alpha.charAt(j)) {
					sum=sum+(j+1);
					break;
				}
			}
		}
		
		System.out.println(sum);
		
		
		

	}

}
