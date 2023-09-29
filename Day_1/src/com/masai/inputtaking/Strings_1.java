package com.masai.inputtaking;

import java.util.Arrays;
import java.util.Scanner;

public class Strings_1 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println( "plse enter the length of string");
		
		int len= sc.nextInt();
		
		sc.nextLine();
		System.out.println("plse enter the string ");
		String str= sc.nextLine();
		
	  char[] charArr= str.toCharArray();
	  
	  //System.out.println(Arrays.toString(charArr));
	  
	//  Arrays.sort(charArr);
	  
	  for(char ch : charArr) {
		  System.out.print(ch+" ");
	  }
	}

}
