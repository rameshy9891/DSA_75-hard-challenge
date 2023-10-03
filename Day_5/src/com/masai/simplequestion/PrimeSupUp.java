package com.masai.simplequestion;

import java.util.Scanner;

public class PrimeSupUp {

	/*
	 * you have find prime number in range of 1 to given number and sum it
	 * sample input: 13                sample output: 41
	 * 
	 * hint:- 
	 * 
	 * 2
	 * 3
	 * 5
	 * 7
	 * 11
	 * 13
	 * 
	 * sum it = 41
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("enter the number of range which you want sum");
		
		Scanner sc = new Scanner(System.in);
		
		
		int num= sc.nextInt();
		
		int sum=0;
		
		for(int i=2; i<=num; i++) {
			if(isPrime(i)) {
				sum=sum+i;
			}
		}
		
		System.out.println(sum);
	}

	private static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		int count=0;
		for(int j=1; j<=i; j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count>2) {
			return false;
		}
		else {
			return true;
		}
	}
}
