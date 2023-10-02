package com.masai.logicalquestion;

import java.util.Scanner;

public class DetectPalindrome {

	
	/*
	 *  let we have number= 1221
	 *   that is palidrome becouse you can write revers it will be same
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("please enter the number which you want to check it is palidrome or not");
		
		int num= sc.nextInt();
		
		int temp=num;
		
		int bag=0;
		while(num>0) {
			bag= (bag*10)+   (num%10);
			double extra= Math.floor(num/10);
			
			num= (int) (extra);
		}
	System.out.println(temp==bag);
		

	}

}
