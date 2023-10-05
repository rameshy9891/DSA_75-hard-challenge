package com.masai.midlevel;

import java.util.Scanner;

public class RotedBy90Degrees {
	
	/*
	 * sample input:               sample output:
	 * 4
	 * 1 2 3 4                     4 8 4 8
	 * 5 6 7 8                     3 7 3 7
	 * 1 2 3 4                     2 6 2 6
	 * 5 6 7 8                     1 5 1 5
	 */
	
	public static void main(String[] args) {
		
		System.out.println("plse enter the length of the matrix");
		
		Scanner sc= new Scanner(System.in);
		
		int len= sc.nextInt();
		
		int[][] matrix= new int[len][len];
		
		for(int i=0; i<len; i++) {
			for(int j=0; j<len; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=matrix.length-1; i>=0; i--) {
			for(int j=0; j<matrix.length; j++) {
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
	}

}
