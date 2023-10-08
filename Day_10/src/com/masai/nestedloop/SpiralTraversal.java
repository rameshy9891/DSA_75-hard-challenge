package com.masai.nestedloop;

import java.util.Scanner;

public class SpiralTraversal {

	/*
	 * sample input:                         sample output:
	 * 5 7
	 * 
	 * 11 12 13 14 15 16 17                     11 18 25 32 39 40 41 42 43 44 45 38 31 24 17 16 15 14 13 12 19 26 33 34 35 36 37 30 23 22 21 20 27 28 29
	 * 18 19 20 21 22 23 24 
	 * 25 26 27 28 29 30 31 
	 * 32 33 34 35 36 37 38
	 * 39 40 41 42 43 44 45
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int m= sc.nextInt();
		
		int[][] arr= new int[n][m];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		int minrow=0;
		int mincol=0;
		int maxrow=arr.length-1;
		int maxcol=arr[0].length-1;
		int end=n*m;
		int count=0;
		
		while(count<end) {
			
			for(int i=minrow, j=mincol; i<=maxrow && count<end; i++) {
				System.out.print(arr[i][j]+" ");
				count++;
			}
			mincol++;
			
			for(int i=maxrow,j=mincol; j<=maxcol && count<end; j++ ) {
				System.out.print(arr[i][j]+" ");
				count++;
			}
			maxrow--;
			
			for(int i= maxrow, j=maxcol;i>=minrow && count<end; i--) {
				System.out.print(arr[i][j]+" ");
				count++;
			}
			maxcol--;
			
			for(int i=minrow, j=maxcol; j>=mincol && count<end; j--) {
				System.out.print(arr[i][j]+" ");  
				count++;
			}
			minrow++;
			
		}
	}
}
