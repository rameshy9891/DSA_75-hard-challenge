package com.masai.nestedloop;

import java.util.Scanner;

public class FindArrayThatSumK {
	
	/*
	 * sample input:                     sample output:
	 * 5 6                                   3+3
	 * 3 2 3 4 5                             2+4
	 */

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int len= sc.nextInt();
		
		int k= sc.nextInt();
		
		int[] arr= new int[len];
		
		for(int m=0; m<arr.length; m++) {
			arr[m]=sc.nextInt();
		}
		
		System.out.println("****output is here****");
		for(int i=0; i<arr.length; i++) {
			for(int j=(i+1); j<arr.length;j++ ) {
				if(arr[i]+arr[j]==k) {
					System.out.println(arr[i]+"+" +arr[j]);
				}
			}
		}
		
		
	}
}
