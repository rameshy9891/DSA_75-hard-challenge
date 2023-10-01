package com.masai.ArrayQuestion;

import java.util.Scanner;

public class CharactersAtOddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("plse enter the length of string");
		Scanner sc= new Scanner(System.in);
		
		int len= sc.nextInt();
		
		System.out.println("plse enter the string also whose length is ="+ len);
		
		sc.nextLine();
		
		String str= sc.nextLine();
		
		char[] charArr= str.toCharArray();
		
		for(int i=0; i<charArr.length; i++) {
			if(i%2==1) {
				System.out.println(charArr[i]);
			}
		}

	}

}
