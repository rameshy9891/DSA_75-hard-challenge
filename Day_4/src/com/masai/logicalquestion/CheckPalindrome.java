package com.masai.logicalquestion;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		String str=sc.nextLine();
		
		int len=str.length();
		
		String str2="";
		
		for(int i=str.length()-1; i>=0; i--) {
			str2=str2+str.charAt(i);
		}
		
		
		System.out.println(str.equals(str2));

	}

}
