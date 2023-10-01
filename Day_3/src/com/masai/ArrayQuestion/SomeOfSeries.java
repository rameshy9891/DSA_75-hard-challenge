package com.masai.ArrayQuestion;

import java.util.Scanner;

public class SomeOfSeries {
	
	/*
	 * Description:
	 *              Given two integers N,X find the value of the series 1 + x+ x*x+x*x*x+x*x*x*x+-----N the term
	 *              where N is the no. of term.
	 *              x contains the value of x
	 *              
	 *       Note: if N<=0 or X<=0 print -1
	 *       
	 *              
	 * For Example 
	 * 
	 *              Given N=3 , X=2
	 *              
	 *   "we need to find the sum of first N=3 terms, having vlaue of X=2
	 *   First 3 terms in Expression = 1 + x + x*x = 1 + 2 + 2*2 = 7
	 *   Answer is 7
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter the value of N");
		
		int N= sc.nextInt();
		
		System.out.println("please enter the value of X");
		
		int X= sc.nextInt();
		
		double sum=1;
		
		if(N<=0 && X<=0) {
			System.out.println("-1");
		}
		else {
			for(int i=1; i<=N-1; i++) {
				sum=sum+Math.pow(X,i);
			}
		}
		
		System.out.println(sum);
	}

}
