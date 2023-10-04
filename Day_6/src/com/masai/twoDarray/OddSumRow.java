package com.masai.twoDarray;

import java.util.Scanner;

public class OddSumRow {
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
						if(arr[k][m]%2==1) {
							sum=sum+arr[k][m];
						}
					}
					System.out.println(sum);
				}

	}

}
