package com.masai.simplequestion;

import java.util.Scanner;

public class CountSuchPairs {
	/*
	 * your task is to find out the number of pairs of integes present in the array
	 * whose sum is equal to the target value k
	 * 
	 * sample input:                        sample output:
	 * 5 9 
	 * 3 0 6 2 7                             2
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("plse enter the length of array");
		
		Scanner sc= new Scanner(System.in);
		
		int len= sc.nextInt();
		
		System.out.println("plse enter the target or k value");
		
		int k= sc.nextInt();
		
		int[] arr= new int[len];
		
		System.out.println("plse enter the array");
		for(int i=0; i<len; i++) {
			arr[i]=sc.nextInt();
			
		}
		
		int count=0;
		for(int j=0; j<arr.length; j++) {
		
			for(int m=j; m<arr.length; m++) {
				if(arr[j]+arr[m]==k) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
