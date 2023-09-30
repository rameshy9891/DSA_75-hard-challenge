package com.masai.inputtaking;

import java.util.Scanner;

public class ArrayWithMultipleTestCasesAndAnAddedValue {
	
	
	/*
	 * 2
	 * 3 2
	 * 1 2 3
	 * 3 1
	 * 1 2 3
	 * 
	 * we have to take this input
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("plse enter the test case");
		
		int tc= sc.nextInt();
		
		for(int i=0; i<tc; i++) {
			
			System.out.println("plse enter the length of the array");
			
			int len= sc.nextInt();
			
			System.out.println("plse enter k value ");
			
			int k= sc.nextInt();
			
			System.out.println("plse enter the array");
			
			int[] arr= new int[len];
			
			for(int j=0; j<len; j++) {
				arr[j]=sc.nextInt();
			}
			
			printThatArray(arr,len,k);
		}

	}

	private static void printThatArray(int[] arr, int len, int k) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+k+" ");
		}
		
		System.out.println();
	}

}
