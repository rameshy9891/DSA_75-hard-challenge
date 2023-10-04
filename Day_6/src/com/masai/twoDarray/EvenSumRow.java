package com.masai.twoDarray;

import java.util.Scanner;

public class EvenSumRow {
	
	/*
	 * sample input:             sample output:
	 * 3 3
	 * 1 2 3                       2
	 * 4 5 6                       10 
	 * 7 8 9                       8
	 * 
	 * Hint:
	 * 2 (even numbers in the row are, [2], therefore , the sum becomes 2)
	 * 10 (even numbers in the row are , [4,6]. therefore , the sum become 10)
	 * 8 (Even numbers in the row are, [8] . therefore , the sum becomes 8)
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc= new Scanner(System.in);
		
		System.out.println("plse enter the row");
		
		int row= sc.nextInt();
		
		System.out.println("plse enter the col");
		
		int col= sc.nextInt();
		
		int[][] arr= new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int k=0; k<row; k++) {
			int sum=0;
			for(int m=0; m<col; m++) {
				if(arr[k][m]%2==0) {
					sum=sum+arr[k][m];
				}
			}
			System.out.println(sum);
		}

	}

}
