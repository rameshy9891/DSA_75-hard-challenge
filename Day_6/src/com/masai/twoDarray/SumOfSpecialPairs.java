package com.masai.twoDarray;

import java.util.Scanner;

public class SumOfSpecialPairs {
	/*
	 * write a program to find the sum of the absolute difference 
	 * between all such pairs (arr[i],arr[j]) such taht i<j and (j-i) is prime.
	 * 
	 * sample input:                          sample output:
	 * 6
	 * 1 2 3 5 7 12                            45
	 * 
	 */
	public static void main(String[] args) {
		
	 Scanner sc= new Scanner(System.in);
	 
	 System.out.println("enter the length of the array");
	 
	 int len= sc.nextInt();
	 
	 System.out.println("plse eneter the array that length is "+ len);
	 
	 int[] arr= new int[len];
	 
	 for(int m=0; m<len; m++) {
		 
		 arr[m]=sc.nextInt();
	 }
	 
	 int sum=0;
	 for(int i=0; i<arr.length; i++ ) {
		 
		 for(int j=i+1; j<arr.length; j++) {
			 
			 if(checkIsPrimeOrNot(j-i)) {
				 sum=sum+Math.abs(arr[i]-arr[j]);
			 }
		 }
	 }
	 System.out.println(sum);
	 
	}

	private static boolean checkIsPrimeOrNot(int num) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1; i<=num; i++ ) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		else {
			return false;
		}
	}

}
