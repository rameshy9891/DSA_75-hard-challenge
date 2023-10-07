package com.masai.ArrrayInterview;

import java.util.Scanner;

public class TreverselOfMatrix {
	
	/*
	 * digonal traversal
	 * 
	 * 1 2 3 4
	 * 5 6 7 8
	 * 9 1 2 3
	 * 4 5 6 7
	 * 
	 * i want the output of 4 1 7 4
	 * [30] [21] [12] [03]
	 * 
	 *  
	 */
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("plse enter the row and col value");
		
		int n= sc.nextInt();
		
		int[][] matrix= new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		int count=0;
		for(int k=matrix.length-1; k>=0; k--) {
			for(int m=count; m<matrix.length; m++) {
				System.out.print(matrix[k][m]+" ");
				count++;
				break;
			}
		}
	}

}
