package com.masai.firstunitend;

import java.util.Arrays;
import java.util.Scanner;

public class MissingInteger {
	
	/*
	 * sample input:                       sample output:
	 * 
	 * 4 5 1 3                              2
	 */

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String  input= sc.nextLine();
		
		String[] strArr= input.split(" ");
		
		int[] arr= new int[strArr.length];
		
		for(int i=0; i<strArr.length; i++) {
			arr[i]=Integer.parseInt(strArr[i]);
		}
		
		//System.out.println(Arrays.toString(arr));
		//for(int num: arr) {
			//System.out.println(num+1);
		//}
		
		int n= (arr.length+1);
		
		int expectedSum= n*(n+1)/2;
		
		int actulSum=0;
		
		for(int num: arr) {
			actulSum=actulSum+num;
		}
		
		System.out.println(expectedSum-actulSum);
	}
}
