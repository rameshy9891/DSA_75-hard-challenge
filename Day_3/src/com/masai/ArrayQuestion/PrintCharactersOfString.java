package com.masai.ArrayQuestion;

import java.util.Scanner;

public class PrintCharactersOfString {

	
	/*
	 * 
	 * sample input: 
	 * 6
	 * ankush
	 * 
	 * sample output:
	 * a
	 * n
	 * k
	 * u
	 * s
	 * h
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("plse enter the length of string");
		Scanner sc= new Scanner(System.in);
		
		int len= sc.nextInt();
		
		System.out.println("plse enter the string also whose length is ="+ len);
		
		sc.nextLine();
		
		String str= sc.nextLine();
		
		char[] arr= str.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
