package com.masai.dayfiftteen;

import java.util.Scanner;

public class MatrixPrimeCheck {

	/*
	 * count the number of prime in this matrix
	 * 
	 * sample input:                       sample output:
	 * 3 3
	 * 1 2 3                               4
	 * 4 5 6
	 * 7 8 9
	 */
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		int row= sc.nextInt();
		
		int col= sc.nextInt();
		
		int[][] matrix= new int[row][col];
		
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
int count=0;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(isPrimeOrNot(matrix[i][j])) {
					count++;
				}
			}
		}
		System.out.println(count);
		
	}

	private static boolean isPrimeOrNot(int i) {
		
		int count=0;
		
		for(int k=1; k<=i; k++) {
			if(i%k==0) {
				count++;
			}
		}
		
		if(count==2) {
			return true;
		}
		else {
			return false;
		}
	}
}
