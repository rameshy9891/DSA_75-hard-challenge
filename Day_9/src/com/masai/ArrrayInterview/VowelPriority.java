package com.masai.ArrrayInterview;

import java.util.Scanner;

public class VowelPriority {

	/*
	 * sample input:                  sample output:
	 * 4
	 * eio                             eio
	 * masaischool                     aaioomsschl
	 * ubcdefghioel                    ueioebcdfghl
	 * rhythm                          rhythm
	 */
	
	public static void main(String[] args) {
		
		System.out.println("plse enter the test case");
		
		Scanner sc= new Scanner(System.in);
		int tc= sc.nextInt();
		
		while(tc-->0) {
			sc.nextLine();
		   System.out.println("plse enter the string");
		   char[] strArr= sc.nextLine().toCharArray();
		   
		   vowelPriorityOrder(strArr);
		}
		
	}

	private static void vowelPriorityOrder(char[] strArr) {
		// TODO Auto-generated method stub
		
		StringBuilder bag1= new StringBuilder();
		
		StringBuilder bag2= new StringBuilder();
		
		for(int i=0; i<strArr.length; i++) {
			
			if(strArr[i]=='a' || strArr[i]=='e' || strArr[i]=='i' || strArr[i]=='o' || strArr[i]=='u') {
				bag1.append(strArr[i]);
			}
			else {
				bag2.append(strArr[i]);
			}
		}
		
		String b1= bag1.toString();
		String b2= bag2.toString();
		
		System.out.println(b1.concat(b2));
		
	}
}
