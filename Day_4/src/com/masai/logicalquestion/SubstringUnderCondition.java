package com.masai.logicalquestion;

import java.util.Scanner;

public class SubstringUnderCondition {

	/*
	 * Description:-  you are given a string s you have to find the count of all such
	 * substrings which start and ends with the same characters.
	 * 
	 * sample input: abcab                  sample output: 7
	 * 
	 * substring like: a,abca,b,bcab,c,a,b start same end same.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("plse enter the string");
		String str= sc.nextLine();
		
		
		
		char[] strArr= str.toCharArray();
		int count=0;
		
		for(int i=0; i<=strArr.length-1; i++) {
			String bag="";
			for(int j=i; j<=strArr.length-1; j++) {
				bag=bag+strArr[j];
				//System.out.println(bag);
//				if(strArr[j]==strArr[strArr.length-1]) {
//					count++;
//				}
				
				if(strArr[j]==strArr[i]) {
					count++;
				}
				
			}
		}
		
		System.out.println(count);
		
		
		
		
		

	}

}
