package com.masai.easyQuestion;

import java.util.Scanner;

public class FirstNestedLoop {
	
	/*
	 * 1 2 3 4 5
	 * 1 2 3 4 5
	 * 1 2 3 4 5
	 * 1 2 3 4 5
	 * 1 2 3 4 5
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc= new Scanner(System.in);
	  
	  System.out.println("plse enter the number you want the pettern");
	  
	  int num= sc.nextInt();
	  
	  System.out.println("***** -: Your Pettern :- ******\n");
	  
	  for(int i=1; i<=num; i++) {
		  for(int j=1; j<=num; j++) {
			  System.out.print(j+" ");
		  }
		  System.out.println();
	  }

	}

}
