package com.masai.ArrrayInterview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MasaiUniqueness {
	
	/*
	 * we have to the go all character is unique or not 
	 */

	public static void main(String[] args) {
		
		System.out.println("plse enter the string");
		
		Scanner sc = new Scanner(System.in);
		
		char[] strArr= sc.nextLine().toCharArray();
		
		Set<Character> setList= new HashSet<>();
		
		for(int i=0; i<strArr.length; i++) {
			setList.add(strArr[i]);
		}
		
		
		System.out.println(strArr.length==setList.size()?"yes":"no");
		
	}
}
