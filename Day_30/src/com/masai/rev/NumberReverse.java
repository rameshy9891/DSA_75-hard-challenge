package com.masai.rev;

public class NumberReverse {
	
	public static void main(String[] args) {
		int number = 122157888;
		
		int beforeChange= number;
		
		int bag=0;
		
		while(number>0) {
			bag=bag*10 + (number%10);
			
			 number= (int) Math.ceil(number/10);
			
		//	number=numberindouble;
			
			
			
		}
		
		
		System.out.println(bag);
	
		
		
	}

	

}
