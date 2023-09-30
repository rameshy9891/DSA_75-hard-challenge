package com.masai.easyQuestion;

import java.util.Scanner;

public class AnotherNestedLoop {

	/*
	 * sample input 4
	 * sample output:
	 * 1
	 * 1
	 * 2
	 * 1
	 * 2
	 * 3
	 * 1
	 * 2
	 * 3
	 * 4
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc= new Scanner(System.in);
	
	int num= sc.nextInt();
	
	for(int i=1; i<=num; i++) {
		for(int j=1; j<=i; j++) {
			System.out.println(j);
		}
	}
	}

}
