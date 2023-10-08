package com.masai.nestedloop;

import java.util.Scanner;

public class RunningSumOfAnArray {
	
	/*
	 * sample input:                                    sample output:
	 * 1
	 * 5                                                1 3 6 10 15
	 * 1 2 3 4 5
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plse eneter the test case");
		
		int tc= sc.nextInt();
		
		for(int i=0; i<tc; i++) {
			
			System.out.println("plse enter the length of the arr");
			
			int len= sc.nextInt();
			
			int[] arr= new int[len];
			
			
			for(int j=0; j<len; j++) {
				arr[j]=sc.nextInt();
			}
			
			
			int sum=0;
			for(int k=0; k<arr.length; k++) {
				
					sum=sum+arr[k];
			
				System.out.print(sum+ " ");
			}
			
			System.out.println();
		}
	}

}
