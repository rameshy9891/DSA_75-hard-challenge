package com.masai.easyQuestion;

import java.util.Scanner;

public class Move2Ahead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("plse enter the target of move");
		
		int target= sc.nextInt();
		
		for(int i=1; i<=target; i++) {
			System.out.println(i);
			i++;
		}
		

	}

}
