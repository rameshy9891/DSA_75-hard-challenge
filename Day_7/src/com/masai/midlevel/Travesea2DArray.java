package com.masai.midlevel;

import java.util.Scanner;

public class Travesea2DArray {
	/*
	 * sample input:                        sample output:
	 * 4 3
	 * 1 8 9                               4 3 2 1 5 6 7 8 12 11 10 9
	 * 2 7 10
	 * 3 6 11
	 * 4 5 12
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
		
		for(int i=0; i<col; i++) {
			for(int j= row-1; j>=0; j--) {
				System.out.print(arr[j][i]+" ");
			}
		}
		
	}
}
