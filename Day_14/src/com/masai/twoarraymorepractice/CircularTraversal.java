package com.masai.twoarraymorepractice;

import java.util.Scanner;

public class CircularTraversal {
	
	/*
	 * sample input:                                        sample output:
	 * 1
	 * 3
	 * 1 2 3                                             7 4 1 2 3 6 9 8
	 * 4 5 6
	 * 7 8 9
	 */
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int tc= sc.nextInt();
		
		for(int i=0; i<tc; i++) {
			int n= sc.nextInt();
			
			int[][] mat= new int[n][n];
			
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					mat[j][k]=sc.nextInt();
				}
			}
			
			
			for(int row=mat.length-1; row>=0; row--) {
				System.out.print(mat[row][0]+" ");
				
			}
			
			for(int col=1; col<=mat[0].length-1; col++) {
				System.out.print(mat[0][col]+" ");
			}
			
			for(int row=1; row<=mat.length-1; row++) {
				System.out.print(mat[row][mat[0].length-1]+" ");
			}
			
			for(int col=mat[0].length-2; col>=1; col--) {
				System.out.print(mat[mat.length-1][col]+" ");
			}
		}
		
		
		
	}
}
