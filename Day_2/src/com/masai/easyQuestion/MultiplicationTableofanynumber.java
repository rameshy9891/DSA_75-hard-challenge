package com.masai.easyQuestion;

import java.util.Scanner;

public class MultiplicationTableofanynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("plse enter the number which you want table");
		int table= sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			int res= i*table;
			
			System.out.println(res);
			System.out.println();
		}
		

	}

}
