package com.masai.easyQuestion;

import java.util.Scanner;

public class IdentifyPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plse enter the num which you want check it is prime or not");
		
		int num= sc.nextInt();
		
		int count=0;
		
		for(int i=1; i<=num; i++) {
			
			if(num%i==0) {
				count++;
				
				//System.out.println(num);
				System.out.println(i);
			}
		}
		
		if(count>2) {
			System.out.println("Not prime");
		}
		else {
			System.out.println("prime");
		}

	}

}
