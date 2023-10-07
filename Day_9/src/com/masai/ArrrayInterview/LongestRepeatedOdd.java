package com.masai.ArrrayInterview;

import java.util.Scanner;

public class LongestRepeatedOdd {
	
	/*
	 * sample input:                      sample output:
	 * 12                                   
	 * 1 1 1 1 2 2 2 2 2 1 1 1                4
	 */
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int len= sc.nextInt();
		
		int[] arr= new int[len];
		
		for(int i=0; i<len; i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=0;
		
		for(int i=0; i<arr.length; i++) {
			int count=0;
			for(int j=i; j<arr.length; j++) {
				if(arr[i]%2==1 && arr[i]==arr[j]) {
					count++;
				}else {
					break;
				}
			}
			if(max<count) {
				max=count;
			}
		}
		
		System.out.println(max);
		
	}

}
