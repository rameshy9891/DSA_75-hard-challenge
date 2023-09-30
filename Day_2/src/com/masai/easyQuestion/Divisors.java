package com.masai.easyQuestion;

import java.util.Scanner;

public class Divisors {
	
	/*
	 * you are provided 3 integers : left , right and k
	 * 
	 * your task is tor write a program that finds out 
	 * the count of all such numbers between lefts and right (both inclusive )
	 *  which are divided by k.
	 * 
	 * sample input: 1 10 3
	 * sample output: 3
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("plse enter the value of left");
		
		int left= sc.nextInt();
		
		System.out.println("plse enter the right of value");
		
		int right= sc.nextInt();
		
		System.out.println("plse enter the k");
		
		int k= sc.nextInt();
		
		int count=0;
		
		for(int i=left; i<=right; i++) {
			if(i%k==0) {
				count++;
			}
		}
		
		System.out.println("****** :your output is :*****");
		
		System.out.println(count);
		

	}

}
