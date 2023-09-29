package com.masai.inputtaking;

import java.util.Arrays;
import java.util.Scanner;

public class String_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("plse enter string");
		
		String str=sc.nextLine();
		
		char[] stringArr= str.toCharArray();
		
		//System.out.println(Arrays.toString(stringArr));
		
		for(char ch: stringArr) {
			System.out.print(ch);
		}
		
		
	}
}
