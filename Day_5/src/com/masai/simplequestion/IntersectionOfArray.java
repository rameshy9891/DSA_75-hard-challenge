package com.masai.simplequestion;

import java.util.Scanner;

public class IntersectionOfArray {
	
	/*
	 * your task is to write a program that finds the one iteger which is common in both arrays 
	 * (arr1 and arr2)
	 * 
	 * sample input :                sample output: 
	 * 3
	 * 4 5 7
	 * 9 2 5                            5
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("plse enter the lengt of the array");
		
		Scanner sc= new Scanner(System.in);
			
		int len= sc.nextInt();
		
		int[] arr1= new int[len];
		int[] arr2= new int[len];
		
		System.out.println("plse enter arr1 value");
		
		for(int i=0; i<len; i++) {
			arr1[i]=sc.nextInt();
			
		}
		
		for(int j=0; j<len; j++) {
			arr2[j]=sc.nextInt();
		}
	
		for(int k=0; k<len; k++) {
			for(int m=0; m<len; m++) {
				if(arr1[k]==arr2[m]) {
					System.out.println(arr1[k]);
				}
			}
		}
		 

	}

}
