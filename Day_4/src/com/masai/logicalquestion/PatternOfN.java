package com.masai.logicalquestion;

import java.util.Scanner;

/*
 * sample output is :
 * 
 * 1 2 3 
 * 4 5 6
 * 7 8 9
 */
public class PatternOfN {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("plse enter the n number ");
		int n= sc.nextInt();
		
		int c=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(c+" ");
				c++;
				
			}
			System.out.println();
		}
	}

}
