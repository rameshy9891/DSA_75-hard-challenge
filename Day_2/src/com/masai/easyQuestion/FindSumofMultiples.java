package com.masai.easyQuestion;

import java.util.Scanner;

public class FindSumofMultiples {
	
	/*
	 * you are given three integers : n, k, y.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plse enter the n");
		
		int num= sc.nextInt();
		
		System.out.println("plse enter of length");
		
		int length= sc.nextInt();
		
		System.out.println("please enter of divider check");
		
		int div= sc.nextInt();
		
		int res=0;
		for(int i=1; i<=length; i++) {
			
			if((i*num)%div==0) {
				res= res+(i*num);
			}
		}
		System.out.println("******* your output is *******");
		System.out.println(res);
		
		

	}

}
