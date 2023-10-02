package com.masai.logicalquestion;

import java.util.Scanner;

public class UnitsConsumed {
	/*
	 * Description:- Electricity consumption is measured via slab rates for a particular , which is as follows
	 * 
	 * apart from the slab rates, a fixed charge of Rs.80 is also added to every bill.
	 *  you are given total amout of bill, N , you need to find total unit consumed.
	 *  
	 *  
	 *  
	 *  Hint: Total 930 rupees is the bill amount
	 *  
	 *  so total unit consumed would be 170 . see calculation below.
	 *  
	 *  charges for 170 units
	 *  
	 *  1- fixed charge:- 80
	 *  2- Charges for first 50 units :- 50*3 = 150
	 *  3- charges of next 100 units:- 100*5 = 500
	 *  4- charges of next 20 units:- 20*10=200
	 *  
	 *  Total Charges=> 80+150+500+200=930
	 *  
	 */
	public static void main(String[] args) {
		
		System.out.println("enter the bill I will give you unit of your bill ");
		
		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		
		int bill= num-80;
		
		if(bill<=150) {
			bill=bill/3;
		}
		else if(650>=bill) {
			bill= ((bill-150)/5)+50;
		}
		else if(bill>=650) {
			bill= ((bill-650)/10)+150;
		}
		
		System.out.println(bill);
	}

}
