package com.masai.twoarraymorepractice;

import java.util.Scanner;

public class BinaryMatrix {
	
	/*
	 * Description:
	 * you are given a binary matrix of size n*m. A binary matrix is one which consists of only 
	 * 1's and 0's . you have to flip the matrix . Flipping the matrix means 
	 * converting all 1's to 0's and all 0's to 1's.
	 * 
	 * 
	 * sample input:            sample output:
	 * 3 2
	 * 1 0                        0 1
	 * 0 1                        1 0
	 * 1 1                        0 0
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int row= sc.nextInt();
		int col= sc.nextInt();
		
		int[][] mat= new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(mat[i][j]==0) {
					System.out.print(1+" ");
				}
				else {
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}

	}

}
