package com.masai.inputtaking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SingleLinePutInTheArray {
	
	
	public static void main(String[] args) {
		
		String takethis= "1 22 13 34 58 51";
		
		//create a array List and add all the data in the form of Integers
		//fist create array List after add all the using loop
		
		//Scanner sc = new Scanner(System.in);
		
		
		List<Integer>  al= new ArrayList<>();
		
		String[] arr=takethis.split(" ");
		
		for(int i=0; i<arr.length; i++) {
			int num=   Integer.parseInt(arr[i]);
			
			al.add(num);
		}
		
		Collections.sort(al);
		
		System.out.println(al);
		
		
		
	}

}
