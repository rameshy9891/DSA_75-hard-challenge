package com.masai.inputtaking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SingleArray {
	
	//   we have length like 5
	// and array= 1 2 3 4 5
	
	// how to take input 
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("plse enter the length of the array");
		
		int n= sc.nextInt();
		
		int[] arr= new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		
		//System.out.println(Arrays.toString(arr));
		
		List<Integer> al= new ArrayList<>();
		
		
		for(int i=0; i<n; i++) {
			al.add(arr[i]);
		}
		
		System.out.println(al);
		
	}

}
