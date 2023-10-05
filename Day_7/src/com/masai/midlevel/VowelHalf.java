package com.masai.midlevel;

import java.util.Scanner;

public class VowelHalf {
	
	/*
	 * sample input:                  sample output:
	 * 6
	 * aabefe                            True
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int len= sc.nextInt();
		
		sc.nextLine();
		
		char[] strArr= sc.nextLine().toCharArray();
		
		int count=0;
		
		for(int i=0; i<strArr.length; i++) {
			if(strArr[i]=='a' || strArr[i]=='e' || strArr[i]=='i' || strArr[i]=='o' ||strArr[i]=='u') {
				count++;
			}
		}
		
		System.out.println(count>=(len/2)?"Yes":"No");
		
		
	}

}
