package com.masai.easyQuestion;

import java.util.Scanner;

public class ModOf10 {
	/*
	 * we have find mod of any number
	 * 
	 * sample input : 7
	 * sample output : 1 2 3 4 5 6 7 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("plse enter the which value you find of mod");
		int tar= sc.nextInt();
		
		for(int i=1; i<=tar; i++) {
			int res= i%10;
			
//			if(res==0) {
//				break;
//			}
			
			System.out.print(res+" ");
		}
		
		

	}

}
