package com.masai.twoarraymorepractice;

import java.util.Scanner;

public class SubstringEndingWithK {
	
	/*
	 * you are given a string A, of length N, and a character K.
	 *  Find the count of all the substring of A. Which end at K.
	 *  
	 *  sample input:                  sample output:
	 *  
	 *  1                                   4
	 *  4
	 *  aman
	 *  a
	 *  
	 *  Hint: in the given sample test case , the value of k= "a" . the total nuber of substrings of A,
	 *  which are ending at k="a" , are {a,ama,ma,a}. therefore the required output 4.
	 *  
	 */
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int tc= sc.nextInt();
		
		for(int i=0; i<tc; i++) {
			
			int len= sc.nextInt();
			
			sc.nextLine();
			
			char[] strArr= sc.nextLine().toCharArray();
			
			char check= sc.nextLine().charAt(0);
			
			checkingOfSubstingNumber(len,strArr,check);
		}
	}

	private static void checkingOfSubstingNumber(int len, char[] strArr, char k) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0; i<len; i++) {
			
			StringBuilder bag= new StringBuilder();
			
			for(int j=i; j<len; j++) {
				bag.append(strArr[j]);
				
			char[] strArr2=	bag.toString().toCharArray();
				
				if(strArr2[strArr2.length-1]== k) {
					count++;
				}
			}
			
		}
		
		System.out.println(count);
		
	}
	

}
