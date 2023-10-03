package com.masai.simplequestion;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveUpperCase {
	
	/*
	 * sample input :                  sample output:
	 * 5
	 * MasAi                              asi     
	 */

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		 int len=sc.nextInt();
		 
		 sc.nextLine();
		 
		String str= sc.nextLine();
		
		String finres=removeUpperCase(str,len);
		
		System.out.println(finres);
		 
		 

	}

	private static String removeUpperCase(String str, int len) {
		
		char[] strArr= str.toCharArray();
		
		StringBuilder res= new StringBuilder();
		
		for(int i=0; i<len; i++) {
			if(Character.isLowerCase(strArr[i])) {
				res.append(strArr[i]);
			}
		}
		
		return res.toString();
		
		
	}

}
