package com.masai.easyQuestion;

import java.util.Scanner;

public class DivisiblyByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("plse enter the number");
		
		int num= sc.nextInt();
		
		System.out.println("plse enter the k");
		int k= sc.nextInt();
		
		System.out.println(" that is your output");
		for(int i=1; i<=num; i++) {
			if(i%k==0) {
				System.out.println(i);
			}
			
			
		}

	}

}
