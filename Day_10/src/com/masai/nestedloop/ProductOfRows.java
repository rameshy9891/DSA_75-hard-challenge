package com.masai.nestedloop;

import java.util.Scanner;

public class ProductOfRows {
	
	/*
	 * sample input:  sample output: 
	 * 3 2             2 
	 * 1 2             12 
	 * 3 4             30
	 * 5 6
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the row length");
		
		int row= sc.nextInt();
		
		System.out.println("plese enter the col length");
		
		int col=sc.nextInt();
		
		int[][] mat= new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		for(int k=0; k<row; k++) {
			int pro=1;
			for(int m=0; m<col; m++) {
				pro=pro*mat[k][m];
			}
			System.out.println(pro);
		}
		
	}
}
