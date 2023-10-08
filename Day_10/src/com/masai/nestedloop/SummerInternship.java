package com.masai.nestedloop;

import java.util.Scanner;

public class SummerInternship {
	
	/*
	 * 
Question: Summer internship

Description:
you want to apply for internships for the upcoming summer but for that you need show some experience in your resume.
so for that you decided to do a startup. This startup selling muffins.
you sell muffins at 5$  a price . and people are loving your muffins and are standing in a long  queue to purchase it.
Every customer purchases a single muffin and pays you in either 5$,10$or 20$ bills,your task now is to find out if you are able to provide change to everybody in the queue.
if you can provide change to everyone they will be happy and give you a good referral.
initially you have no money i.e no bills of any kind.
output: YES if you can provide change to everyone , else No.

  sample input:                                                  sample output:
  2
  5                      
  5 5 5 10 20                                                                YES
  5
  5 5 10 10 20                                                               NO


	 */
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the test case");
		
		int tc= sc.nextInt();
		
		while(tc-->0) {
			System.out.println("plse enter the length of the array");
			int len= sc.nextInt();
			
			int[] arr= new int[len];
			
			System.out.println("plse enter the array");
			
			for(int i=0; i<arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			
			check(arr);
		}
	}

	private static void check(int[] arr) {
		// TODO Auto-generated method stub
		
		int cost5=0;
		int cost10=0;
		int cost20=0;
		
		  for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == 5) {
	                cost5++;
	            } else if (arr[i] == 10) {
	                if (cost5 > 0) {
	                    cost10++;
	                    cost5--;
	                } else {
	                    System.out.println("No");
	                    return; // Exit the function early, as you can't provide change.
	                }
	            } else if (arr[i] == 20) {
	                if (cost10 > 0 && cost5 > 0) {
	                    cost20++;
	                    cost10--;
	                    cost5--;
	                } else if (cost5 >= 3) {
	                    cost20++;
	                    cost5 -= 3;
	                } else {
	                    System.out.println("No");
	                    return; // Exit the function early, as you can't provide change.
	                }
	            }		
		  }
		  
		  System.out.println("Yes");
	}
}
