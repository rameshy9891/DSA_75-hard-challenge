package com.masai.inputtaking;

import java.util.Scanner;

public class SingleLineMultipleIntegers {
	
	public static void main(String[] args) {
		
		String takethis= "1 2 3 4";
		
		//take input and after that add 1 and print it
		
		//Scanner sc = new Scanner(System.in);
		
		String[] arr=takethis.split(" ");
		
		for(int i=0; i<arr.length; i++) {
			int num=   Integer.parseInt(arr[i]);
			
			System.out.println(num+1);
		}
		
		
	}

}
