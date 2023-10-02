package com.masai.logicalquestion;

import java.util.Scanner;

public class EvenSumAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int n= sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			int sum=0;
			for(int j=1; j<=i; j++) {
				if(j%2==0) {
					sum=sum+j;
				}
			}
			System.out.println(sum);
		}

	}

}
