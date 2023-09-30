package com.masai.easyQuestion;

import java.util.Scanner;

public class EvenSumBelowN {
	
	// we have taget element before that target element we have to sum all the element that are even

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
	  System.out.println("plse enter the target element");
	  
	  int tar= sc.nextInt();
	  
	  int sum=0;
	  
	  for(int i=1; i<=tar; i++) {
		  if(i%2==0) {
			  sum=sum+i;
		  }
	  }
	  
	  System.out.println(sum);
		

	}

}
