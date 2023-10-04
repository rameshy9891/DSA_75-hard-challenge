package com.masai.twoDarray;

import java.util.Arrays;
import java.util.Scanner;

public class ApplyBasicMaths {
	/*
	 * find the number divide by extly 7 and it will smalles also
	 * 
	 * sample input:                              sample output:
	 * 5
	 * 14 7 8 2 4                                  1
	 * 
	 * Hint: bothe 14 and 7 are valid answer , but since 7 is the smallest, the required array index is 1
	 * 
	 */
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("plse enter the length of the array");
		
		Scanner sc= new Scanner(System.in);
		
		int len= sc.nextInt();
		
		System.out.println("plse enter the array that length is "+ len);
		
		int[] arr= new int[len];
		
		for(int i=0; i<len; i++) {
			arr[i]=sc.nextInt();
		}
		
		//Arrays.sort(arr);
		int ele=-1;
		int min=Integer.MAX_VALUE;
		
		for(int j=0; j<arr.length; j++) {
			if(arr[j]%7==0 && min>arr[j] ) {
				min=arr[j];
				ele= j;
			
			}
		}
		System.out.println(ele);

	}

}
