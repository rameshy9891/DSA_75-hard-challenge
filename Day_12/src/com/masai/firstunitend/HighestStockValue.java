package com.masai.firstunitend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HighestStockValue {
	
	/*
	 * sample input:                          sample output:
	 * 
	 * 5
	 * 1 -3 4 3 -2                               5
	 *
	 *sample input:                           sample output:
	 *
	 *4
	 *-3 2 -2 -1                                 0
	 *
	 *Hint:
	 *
	 *in simple1 ,n =5 arr=[1,-3,4,3,-2]
	 *
	 *Day starts with value 0. 
	 *then it goes up by 1, new value 0+1=1. 
	 *Then it goes down by 3, new value 1-3=-2.
	 *then it goes up by 4, new value -2+4=2.
	 *then it goes up by 3, new value 2+3=5.
	 *so the value of the stocks throwghout the day will be [0,1,-2,2,5,3]
	 *the highest value of the stock is 5. thus the output is 5.
	 */
	
	public static void main(String[] args) {
		
		System.out.println("plse enter the  length of the array");
		
		Scanner sc = new Scanner(System.in);
		
		int len= sc.nextInt();
		
		System.out.println("plse enter the array that length is "+len);
		
	
		
		int[] arr= new int[len];
		
		for(int i=0; i<len; i++) {
			arr[i]=sc.nextInt();
		}
		
		List<Integer> stockList= new ArrayList<>();
		int sum=0;
		stockList.add(sum);
		for(int i=0; i<arr.length; i++) {
			
			
			sum=sum+arr[i];
			stockList.add(sum);
			
		}
		
		Collections.sort(stockList);
		
	int maxvalue=	Collections.max(stockList);
		
		System.out.println(maxvalue);
		
	}

}
