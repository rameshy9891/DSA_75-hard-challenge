
package com.masai.twoDarray;

import java.util.Arrays;
import java.util.Scanner;

public class First2DArray {
/*
 * N=3 , M=2
 * 
 * sample input:           sample output: 
 * 
 * 3 2                      
 * 1 2                       1 2
 * 3 4                       3 4
 * 5 6                       5 6
 * 
 */
	
	public static void main(String[] args) {
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
			for(int m=0; m<col; m++) {
				System.out.print(arr[k][m]+" ");
			}
			System.out.println();
		}
	}
}
