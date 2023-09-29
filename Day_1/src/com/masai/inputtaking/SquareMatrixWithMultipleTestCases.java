package com.masai.inputtaking;

import java.util.Scanner;

public class SquareMatrixWithMultipleTestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2
		 * 3
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * 2
		 * 1 2
		 * 3 4
		 * 
		 * take this input
		 */
		
		
		System.out.println("plse enter the text case");
		
		Scanner sc = new Scanner(System.in);
		
		int tc= sc.nextInt();
		
		for(int i=0; i<tc; i++) {
			System.out.println("plse enter the number of squer matrix");
			
			int n=sc.nextInt();
			
			int[][] arr= new int[n][n];
			
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					arr[j][k]=sc.nextInt();
				}
			}
			
			printAddOne(arr);
		}
		

	}

	private static void printAddOne(int[][] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]+1+" ");
			}
			System.out.println();
		}
		
	}

}
