package com.masai.dayfiftteen;

import java.util.Scanner;

public class EdiblePlants {

	/*
	 * sample input1:                          sample output:
	  * 2                                         
	 * xY                                             4
	 * 6
	 * AYxxXY
	 * 
	 * 
	 * sample input2:                            sample output:
	 * 3                                            
	 * abc                                             0
	 * 6
	 * ABCxyz
	 */
	
	public static void main(String[] args) {
		
		System.out.println("plse enter the length of the string");
		
		Scanner sc= new Scanner(System.in);
		
		int n1= sc.nextInt();
		
		sc.nextLine();
		
		char[] strArr1= sc.nextLine().toCharArray();
		
		
        int n2= sc.nextInt();
		
		sc.nextLine();
		
		char[] strArr2= sc.nextLine().toCharArray();
		
		
		int count=0;
		for(int i=0; i<n1; i++) {
			for(int j=0; j<n2; j++) {
				if(strArr1[i]==strArr2[j]) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		
		
	}
}
