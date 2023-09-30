package com.masai.easyQuestion;

import java.util.Scanner;

public class MinimumInArray {


	/*
	 * we have to take input form user
	 * 
	 * sample input:
	 * 5
	 * 1 2 3 4 5
	 * 
	 * sample output;
	 * 
	 * 1
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter the length of the array");
		
		int len= sc.nextInt();
		
		System.out.println("plese enter the arr array as a input with lenght is"+  len);
		
		int[] arr= new int[len];
		
		for(int i=0; i<len; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		findMaximumInArray(len,arr);
		
		

	}

	private static void findMaximumInArray(int len, int[] arr) {
		// TODO Auto-generated method stub
		
		int min=10000;
		
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		System.out.println("minimum is :"+min);
		
	}

}
