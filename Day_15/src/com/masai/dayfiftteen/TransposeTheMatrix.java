package com.masai.dayfiftteen;

import java.util.Scanner;

public class TransposeTheMatrix {
	
	
	/*
	 * sample input:               sample output:
	 * 5 4                          0 1 2 3 4     
	 * 0 0 0 0                      0 1 2 3 4
	 * 1 1 1 1                      0 1 2 3 4
	 * 2 2 2 2                      0 1 2 3 4
	 * 3 3 3 3                      0 1 2 3 4
	 * 4 4 4 4                      0 1 2 3 4
	 */

	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the row length of the matrix");
		
		int row= sc.nextInt();
		
		System.out.println("enter the column length of the matrix");
		
		int col= sc.nextInt();
		
		int[][] matrix= new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<col; i++) {
			for(int j=0; j<row; j++) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
		
		
	}
}
