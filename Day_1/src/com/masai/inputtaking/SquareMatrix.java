package com.masai.inputtaking;

import java.util.Arrays;
import java.util.Scanner;

public class SquareMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 3
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * 
		 * we want to take this input 
		 */

		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("plse enter the length or hight both");
		
		int n= sc.nextInt();
		
		int[][] arr= new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		
		for(int k=0; k<arr.length; k++) {
			//System.out.println(Arrays.toString(arr[k]));
			for(int m=0; m<arr.length; m++) {
				System.out.print(arr[k][m]+1+" ");
			}
			System.out.println();
		}
	}

}
