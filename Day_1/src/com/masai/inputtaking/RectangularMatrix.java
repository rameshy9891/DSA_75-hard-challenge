package com.masai.inputtaking;

import java.util.Scanner;

public class RectangularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 3 4
		 * 1 2 3 4 
		 * 5 6 7 8 
		 * 9 10 11 12
		 * 
		 * we have to take this input
		 */

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("plse enter the row");
		int row= sc.nextInt();
		
		System.out.println("plse enter the column");
		
		int col= sc.nextInt();
		
		int[][] arr= new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j]+1+" ");
			}
			System.out.println();
		}
	}

}
