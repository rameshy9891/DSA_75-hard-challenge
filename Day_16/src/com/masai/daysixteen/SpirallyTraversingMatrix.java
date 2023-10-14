package com.masai.daysixteen;

import java.util.Scanner;

public class SpirallyTraversingMatrix {
	
	/*
	 * sample input :                       sample output:
	 * 
	 * 4
	 * 1 2 3 4                         1 2 3 4 8 4 8 7 6 5 1 5 6 7 3 2
	 * 5 6 7 8
	 * 1 2 3 4
	 * 5 6 7 8
	 */
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int check=n*n;
		
		int[][] arr= new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		

		int minrow=0;
		int mincol=0;
		int maxrow=arr.length-1;
		int maxcol=arr[0].length-1;
		int end=n*n;
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
