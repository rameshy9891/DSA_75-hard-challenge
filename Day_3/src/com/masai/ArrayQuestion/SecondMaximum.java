package com.masai.ArrayQuestion;

import java.util.Scanner;

public class SecondMaximum {

	// we have take three input of value 
	// and after that check it which one is secondMaximum in three value
	//  sample input: 3 7 5      sample output: 5
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("psle enter the first value");
		int V1= sc.nextInt();
		
		System.out.println("plse enter the secound value");
		
		int V2= sc.nextInt();
		
		System.out.println("plse enter the third value");
		
		int V3= sc.nextInt();
		
		
		if(V1>V2) {
			if(V1<V3) {
				System.out.println(V1);
			}
			else {
				System.out.println(V3);
			}
		}
		else {
			if(V2<V3) {
				System.out.println(V2);
			}else {
				System.out.println(V3);
			}
		}
		

	}

}
