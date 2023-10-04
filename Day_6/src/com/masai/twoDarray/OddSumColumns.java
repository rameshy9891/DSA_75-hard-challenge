package com.masai.twoDarray;

import java.util.Scanner;

public class OddSumColumns {
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
	
for(int k=0; k<col; k++) {
	int sum=0;
	for(int m=0; m<row; m++) {
		if(arr[m][k]%2==1) {
			sum=sum+(arr[m][k]);
		}
	}
	System.out.println(sum);
}

}
}
