package com.masai.ArrayQuestion;

import java.util.Scanner;

public class EvenArray {
	
	/*
	 * 5
	 * 1 2 3 4 5
	 * 
	 *we have to take this input 
	 *
	 *output:
	 *
	 *2
	 *4
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
	
		System.out.println("enter the length of the array");
		int len= sc.nextInt();
		
		int[] arr= new int[len];
		
		for(int i=0; i<len; i++) {
			arr[i]=sc.nextInt();
			
		}
		
	
		checkEven(arr,len);
	}

	private static void checkEven(int[] arr, int len) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<len; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
