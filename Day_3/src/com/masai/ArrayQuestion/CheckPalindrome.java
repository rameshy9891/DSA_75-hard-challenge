package com.masai.ArrayQuestion;

import java.util.Scanner;

public class CheckPalindrome {
	
	/*
	 * print Yes, if string is a palindrome else print No
	 * 
	 * For Example : consider the value stored in str= "naman" , if we reverse the string
	 * will be the swame as the original string , hence the string is considered as palindrome ,
	 * therefore , the output is Yes
	 * 
	 * Note: A palindrome is a string which is the same read forwards or backwards
	 * 
	 * sample input 1:
	 * nurpul
	 * 
	 * sample output 1:
	 * No
	 * 
	 * sample output 2:
	 * naman
	 * 
	 * sample output 2:
	 * Yes
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("plse enter the length of string");
		
		Scanner sc= new Scanner(System.in);
		
		int len= sc.nextInt();
		
		sc.nextLine();
		System.out.println("plse enter the string whose length is "+ len);
		String str= sc.nextLine();
		
		
//		char[] strArr= str.toCharArray();
//		
//		StringBuffer str2= new StringBuffer();
//		
//		for(int i=strArr.length-1; i>=0; i--) {
//			str2.append(strArr[i]);
//		}
		
		String str2="";
		
		for(int i=str.length()-1; i>=0; i--) {
			str2=str2+str.charAt(i);
		}
		
		
		if(str.equals(str2)) {
			System.out.println("True or Palindrome");
		}
		else {
			System.out.println("false or (Not palindrome)");
		}
		

	}

}
