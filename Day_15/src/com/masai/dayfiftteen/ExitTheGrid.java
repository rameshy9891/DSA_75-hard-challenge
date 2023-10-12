package com.masai.dayfiftteen;

import java.util.Scanner;

public class ExitTheGrid {
	
	/*
	 * sample input:                             sample output:
	 * 3
	 * 4      
	 * RRRR                                           4
	 * LLLL                                           1
	 * UUUU                                           0
	 * DDDD
	 * 3
	 * LRL
	 * UUU
	 * DLR
	 * 2
	 * RL
	 * DD
	 */
	
	public static void main(String[] args) {
		
		System.out.println("enter the test case");
		
		Scanner sc= new Scanner(System.in);
		
		int tc= sc.nextInt();
		
		for(int i=0; i<tc; i++) {
			System.out.println("enter the length of the matrix");
			int len= sc.nextInt();
			
			char[][] mat= new char[len][len];
			
			for(int row=0; row<len; row++) {
				String line=sc.next();
				
				
				for(int col=0; col<len; col++) {
					
					mat[row][col]=line.charAt(col);
				}
			}
			
			int rown=0;
			int coln=0;
			int n= mat.length-1;
			int count=0;
			
			while(rown>=0 && coln>=0 && rown<=n && coln<=n) {
				if(mat[rown][coln]=='a') {
					count=0;
					break;
					
				}
				
				else if(mat[rown][coln]=='R') {
					mat[rown][coln]='a';
					coln++;
					count++;
				}
				
				else if(mat[rown][coln]=='L') {
					mat[rown][coln]='a';
					coln--;
					count++;
				}
				
				
				else if(mat[rown][coln]=='D') {
					mat[rown][coln]='a';
					rown++;
					count++;
				}
				
				else if(mat[rown][coln]=='U') {
					mat[rown][coln]='a';
					rown--;
					count++;
				}
			}
			
			System.out.println(count);
			
		}
		
		
		
		
		
	}

}
