package com.masai.ArrayQuestion;

import java.util.Scanner;

public class CheckPrime {

	/*
	 * we have two value to check both value are prime or not
	 * so for that we have to create one methode it will check
	 * that method is check value is prime or not
	 * and return me true or flase
	 * 
	 * sample input: 11 17         sample output: True
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" enter the first value");
		
		Scanner sc= new Scanner(System.in);
		
		int a=sc.nextInt();
		
		System.out.println("plse enter the secound vlue");
		
		int b= sc.nextInt();
		
		boolean ans1=isPrimeOrNot(a);
		boolean ans2=isPrimeOrNot(b);	
		
		if(ans1&&ans2) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		

	}

	private static boolean isPrimeOrNot(int a) {
		// TODO Auto-generated method stub
		
		int count=0;
		
		for(int i=1; i<=a; i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count<=2) {
			return true;
		}
		else {
			return false;
		}
	}

}
