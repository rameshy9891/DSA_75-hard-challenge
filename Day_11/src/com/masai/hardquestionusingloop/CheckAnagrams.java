package com.masai.hardquestionusingloop;

import java.util.Scanner;

public class CheckAnagrams {
	
	/*
	 * check anagrams means we want to check not both string are have same charcter or not
	 * means we same length same correct in anouther string .
	 * 
	 * sample input:
	 * cat       tac     Yes anaram
	 * dog       ogd     Yes 
	 * aab       aba     Yes
	 * adc       add     No
	 * cdf       fde     No
	 * bacdc     dcbac    Yes
	 * bacdc      dcbad   No
	 */
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter first string");
	char[] str1Arr= sc.nextLine().toCharArray();
	
	
	
	System.out.println("enter second string");
	char[] str2Arr= sc.nextLine().toCharArray();
	
	boolean[] visted= new boolean[str2Arr.length];
	
	int count=0;
	
	if(str1Arr.length==str2Arr.length) {
		
	
	for(int i=0; i<str1Arr.length; i++) {
		for(int j=0; j<str2Arr.length; j++) {
			if(str1Arr[i]==str2Arr[j] && !visted[j]) {
				visted[j]=true;
				count++;
				break;
			}
		}
	}
	}
	
	System.out.println((str2Arr.length+str1Arr.length)-(count+count));
	System.out.println(count);
	if((str2Arr.length)==count) {
		System.out.println("Anagram");
	}
	else {
		System.out.println("No Anagram");
	}
}
}
