package com.masai.ArrayQuestion;

import java.util.Scanner;

public class TheLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("plse enter the number \n you want to check \n last digit is divisible or not");
		

		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		
		int lastdigit= num%10;
		
		if(lastdigit%3==0) {
			System.out.println("Divisible");
		}
		else {
			System.out.println("Not Divisible");
		}
		
		System.out.println(lastdigit);
	}

}
