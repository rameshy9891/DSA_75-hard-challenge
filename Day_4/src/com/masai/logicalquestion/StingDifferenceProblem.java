package com.masai.logicalquestion;

import java.util.Scanner;

public class StingDifferenceProblem {
	/*
	 * Description:- you are given two strings s1 and s2.
	 *  you have to find the difference when s2 is subtracted from s1(s1-s2)
	 * (Sx-Sy) results in character 
	 * which are extra in Sx(in the same order it is present in Sx and not in Sy)
	 * 
	 * sample input:-                             sample output:-
	 * 
	 * ABCX                                              X
	 * ABCD
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		char[] str1= sc.nextLine().toCharArray();
		
		char[] str2= sc.nextLine().toCharArray();
		
		for(int i=0; i<str1.length; i++) {
			if(!(str1[i]==str2[i])) {
				System.out.print(str1[i]);
			}
		}
		

	}

}
