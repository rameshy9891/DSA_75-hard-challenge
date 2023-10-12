package com.masai.twoarraymorepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PerformMerging {
	
	/*
	 * Description:
	 *              you are given two sorted arrays arr1 & arr2 each of length N.
	 *          your task is to write a program that merges both the arrays
	 *       such that the final array formed after merging is sorted.
	 *       
	 *   sample input:                       sample output:
	 *   
	 *   4
	 *   1 5 7 9                             1 2 4 5 6 7 8 9
	 *   2 4 6 8
	 */

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int len= sc.nextInt();
		
		int[] arr1= new int[len];
		int[] arr2= new int[len];
		
		for(int i=0; i<len; i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0; i<len; i++) {
			arr2[i]=sc.nextInt();
		}
		
		List<Integer> arrList= new ArrayList<>();
		
		
		for(int j=0; j<len; j++) {
			arrList.add(arr1[j]);
			arrList.add(arr2[j]);
		}
		

		
		//Collections.sort(arrList);
		int[] arr5= new int[arrList.size()];
		
		for(int i=0; i<arrList.size(); i++) {
			arr5[i]=arrList.get(i);
		}
		
		//System.out.println(arrList);
		
		
		// Apply bubble sort here
		for(int i=0; i<arr5.length; i++) {
			for(int j=i+1; j<arr5.length; j++ ) {
				if(arr5[i]>arr5[j]) {
					int temp=arr5[j];
					arr5[j]=arr5[i];
					arr5[i]=temp;
				}
			}
		}
		
	  System.out.println(Arrays.toString(arr5));
	}
}
