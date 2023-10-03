package com.masai.simplequestion;

import java.util.Scanner;

public class StrongTypePassword {
	
	/*
	 * if in the password we any symbole like @,$,#,* then your password is strong 
	 * else your password is week print in ruslte 
	 * 
	 * sample input:                             sample output
	 * 4
	 * test new@t mon*y ramesh                   week strong strong weak
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("plse enter the length of the array");
		
		int len= sc.nextInt();
		
		sc.nextLine();
		
		String[] arr= new String[len];
		
		for(int i=0; i<len; i++) {
			arr[i]=sc.nextLine();
		}
		
		for(int j=0; j<len; j++) {
			if(check(arr[j])) {
				System.out.print("strong ");
			}else {
				System.out.print("week ");
			}
		}
	}

	private static boolean check(String string) {
		// TODO Auto-generated method stub
		char[] strArr= string.toCharArray();
		
		for(int i=0; i<strArr.length; i++) {
			if(strArr[i]=='@' || strArr[i]=='*' || strArr[i]=='$' || strArr[i]=='#' ) {
				return true;
				
			}
			
		}
		return false;
		
	}
	

}
