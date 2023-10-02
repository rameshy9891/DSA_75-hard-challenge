package com.masai.logicalquestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinimumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the length of the array");
		
		Scanner sc= new Scanner(System.in);
		
		int len= sc.nextInt();
		
		System.out.println("enter the array that length should be :- "+len);
		
		List<Integer> list= new ArrayList<>();
		
		int[] arr= new int[len];
		
		for(int i=0; i<len; i++) {
			arr[i]=sc.nextInt();
			list.add(arr[i]);
			
		}
		
		System.out.println(Collections.min(list));
		

	}

}
