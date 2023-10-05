package com.masai.midlevel;

import java.util.Scanner;

public class Travese2DArray3 {
	
	/*
	 * sample input:                        sample output:
	 * 4 3
	 * 1 8 9                               9 10 11 12 8 7 6 5 1 2 3 4
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
		
		for(int i=col-1; i>=0; i--) {
			for(int j= 0; j<=row-1; j++) {
				System.out.print(arr[j][i]+" ");
			}
		}
		
	}

}
