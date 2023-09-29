package com.masai.inputtaking;

import java.util.Scanner;

public class RectangalMatrix_MultipleTestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2
		 * 3 4
		 * 1 2 3 4
		 * 5 6 7 8
		 * 9 10 11 12
		 * 2 3
		 * 1 2 3
		 * 4 5 6
		 * 
		 * we want to take this input
		 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("plse enter the test case");
		
		int tc= sc.nextInt();
		
		for(int i=0; i<tc; i++) {
			System.out.println("plse enter the row");
			int row= sc.nextInt();
			
			System.out.println("plse enter the col");
			int col= sc.nextInt();
			
			
			int[][] arr= new int[row][col];
			
			System.out.println("plse enter the matrix");
			
			for(int j=0; j<row; j++) {
				for(int k=0; k<col; k++) {
					arr[j][k]=sc.nextInt();
				}
				
			}
			
			printThatArray(arr,row,col);
		}
	}

	private static void printThatArray(int[][] arr, int row, int col) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j]+1+" ");
			}
			System.out.println();
		}
		
	}

	

}
