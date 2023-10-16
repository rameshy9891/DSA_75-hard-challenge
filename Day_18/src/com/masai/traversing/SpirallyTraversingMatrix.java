package com.masai.traversing;

import java.util.Scanner;

public class SpirallyTraversingMatrix {
	
	/*
	 * sample input:                           sample output:
	 * 4
	 * 1 2 3 4                          1 2 3 4 8 4 8 7 6 5 1 5 6 7 3 2
	 * 5 6 7 8 
	 * 1 2 3 4
	 * 5 6 7 8
	 */
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int[][] matrix= new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		
		int srow=0;
		int scol=0;
		int erow=n-1;
		int ecol=n-1;
		
		int check= n*n;
		
		int count=0;
		while(count<check) {
			
			for(int j=scol, i=srow; j<=ecol && count<check; j++) {
				System.out.print(matrix[i][j]+" ");
				count++;
			}
			
			srow++;
			
			for(int j=ecol, i=srow; i<=erow && count<check; i++) {
				System.out.print(matrix[i][j]+" ");
				
				count++;
			}
			
			ecol--;
			
			for(int j=ecol, i=erow; j>=scol  && count<check; j--) {
				System.out.print(matrix[i][j]+" ");
				
				count++;
			}
			
			erow--;
			
			for(int i=erow,j=scol; i>=srow  && count<check; i-- ) {
				System.out.print(matrix[i][j]+" ");
				
				count++;
			}
			scol++;
		}
		
		
	}

}
