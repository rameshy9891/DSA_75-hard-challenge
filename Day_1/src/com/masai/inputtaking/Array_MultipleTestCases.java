package com.masai.inputtaking;

import java.util.Arrays;
import java.util.Scanner;

public class Array_MultipleTestCases {
	
	
	public static void printThat(int[] arr,int len) {
		
		//System.out.println(Arrays.toString(arr));
		
		for(int ch: arr) {
			System.out.print(ch+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  2
		 *  5
		 *  1 2 3 4 5
		 *  4
		 *  1 2 3 4
		 *  
		 *  we have to take this input
		 */
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("plse enter the test case");
		
		int tc= sc.nextInt();
		
		for(int i=0; i<tc; i++) {
			
		
		
		System.out.println("plse enter the length of the array");
		
		int len= sc.nextInt();
		
		
		int[] arr= new int[len];
		
		System.out.println("plse enter the array ");
		
		for(int j=0; j<len; j++) {
			arr[j]=sc.nextInt();
		}
		
	//	System.out.println(Arrays.toString(arr));
		
		printThat(arr,len);
		
		
		}
		
		
		
		
		
		

	}

}
