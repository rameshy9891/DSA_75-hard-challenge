package com.masai.midlevel;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MasaiUniqueness {

	/*
	 * we have to find (no repeated character)
	 * 
	 * sample input:                      sample output:
	 * masai                               No
	 */
	
	public static void main(String[] args) {
		System.out.println("plse enter the string");
		Scanner sc= new Scanner(System.in);
		
		char[] strArr= sc.nextLine().toCharArray();
		
		Set<Character> set= new HashSet<>();
		
		for(int i=0; i<strArr.length; i++) {
			set.add(strArr[i]);
		}
		

		
		System.out.println(strArr.length==set.size()?"Yes":"No");
	}
}
