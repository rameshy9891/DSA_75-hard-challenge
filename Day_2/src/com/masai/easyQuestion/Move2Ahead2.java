package com.masai.easyQuestion;

import java.util.Scanner;

public class Move2Ahead2 {
	
	// we have to add 2 all value and start with 2 till to the target

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("plse enter the target of the element");
		int tar= sc.nextInt();
		
		for(int i=2; i<=tar; i++) {
			System.out.println(i);
			i++;
		}

	}

}
