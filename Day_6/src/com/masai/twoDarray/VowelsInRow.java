package com.masai.twoDarray;

import java.util.Scanner;

public class VowelsInRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc= new Scanner(System.in);
		
		System.out.println("plse enter the row");
		
		int row= sc.nextInt();
		
		System.out.println("plse enter the col");
		
		int col= sc.nextInt();
		
		char[][] arr= new char[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j]=  (sc.next().charAt(0));
			}
		}
		
		for(int k=0; k<row; k++) {
			int count=0;
			for(int m=0; m<col; m++) {
				
				char checChar=Character.toLowerCase(arr[k][m]);
				if(checChar=='a' || checChar=='e' || checChar=='i' || checChar=='o' || checChar=='u') {
					count++;
				}
			}
			System.out.println(count>0 ? "Yes" : "No");
		}
		
		sc.close();

	}

}
