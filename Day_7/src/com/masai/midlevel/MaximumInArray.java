package com.masai.midlevel;

import java.util.Scanner;

public class MaximumInArray {
	
	/*
	 * sample input:                     sample output:
	 * 5
	 * 1 2 3 4 5                           5
	 */
	
	public static void main(String[] args) {
		System.out.println("plse enter the value of length");
		
		Scanner sc= new Scanner(System.in);
		
		int len= sc.nextInt();
		
		int[] arr= new int[len];
		
		for(int i=0; i<=len-1; i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
