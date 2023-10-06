package com.masai.hardquestion;

import java.util.Scanner;

public class GoInZigZag {
	
	/*
	 * sample input:                      sample output:
	 * 5 5 
	 * 4 7 1 1 7                         7 1 1 7 4 8 9 9 6 1 1 5 9 4 6 7 7 4 7 7 5 5 2 6 8
	 * 8 9 9 6 1
	 * 6 4 9 5 1
	 * 7 7 4 7 7
	 * 8 6 2 5 5
	 */
	
	public static void main(String[] args) {
	  
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("plse enter the row");
		
		int row= sc.nextInt();
		
		System.out.println("plse enter the col");
		
		int col= sc.nextInt();
		
		int[][] arr= new int[row][col];
		
		for(int m=0; m<row; m++) {
			for(int n=0; n<col; n++) {
				arr[m][n]=sc.nextInt();
			}
		}
		
		
		for(int i=0; i<row; i++) {
			if(i%2==0) {
				for(int j=col-1; j>=0; j--) {
					System.out.print(arr[i][j]+" ");
				}
			}else {
				for(int k=0; k<col; k++) {
					System.out.print(arr[i][k]+" ");
				}
			}
		}
		
	}

}
