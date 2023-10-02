package com.masai.logicalquestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfAll {
	
	/*
	 * but there is one condition if we get 3.25 or 3.78 any greater then that vlue
	 * that value of ceil value is print
	 */
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("plse provide the legth of the arr");
		
		int n= sc.nextInt();
		
		System.out.println("plse enter the array of length n"+n);
		
		List<Integer> list= new ArrayList<>();	
		
		int[] arr= new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
			list.add(arr[i]);
		}
		
		//System.out.println(list);
		
		int sum=0;
		
		for(Integer num: list) {
			sum=sum+num;
		}
		
		double res= sum/n;
		
		int avg= (int) Math.ceil(res);
		System.out.println(avg);
		
	}

}
