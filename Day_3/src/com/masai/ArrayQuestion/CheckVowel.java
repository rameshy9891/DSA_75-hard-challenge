package com.masai.ArrayQuestion;
//
//import java.util.Scanner;
//
//public class CheckVowel {
//	
//	/*
//	 * For Example : consider the value stored in N=6, and the value stored in str="ramesh" 
//	 * then the output will be ture since the string contains the vowel a e ;
//	 * 
//	 * sample input:                sample output: 
//	 * 4                               false
//	 * stvr
//	 * 
//	 * 
//	 */
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		
//		System.out.println("plse enter the length of string");
//		
//		int len= sc.nextInt();
//		
//		sc.nextLine();
//		System.out.println("plse provide the string whose lenght of "+ len);
//		
//		String str= sc.nextLine();
//		
//		checkVowel(len,str);
//
//	}
//
//	private static void checkVowel(int len, String str) {
//		// TODO Auto-generated method stub
//		
//		int count=0;
//		
//		char[] arr= str.toCharArray();
//		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u') {
//				count++;
//			}
//		}
//		if(count>0) {
//			System.out.println("True");
//		}
//		else {
//			System.out.println("False");
//		}
//		
//	}
//
//}



// advance code 

import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of the string");
        int len = sc.nextInt();
        sc.nextLine();

        System.out.println("Please provide the string of length " + len);
        String str = sc.nextLine();

        boolean hasVowels = containsVowels(str);

        if (hasVowels) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static boolean containsVowels(String str) {
        char[] arr = str.toCharArray();

        for (char ch : arr) {
            if (isVowel(ch)) {
                return true; // If a vowel is found, return true immediately
            }
        }

        return false; // No vowels were found, return false
    }

    private static boolean isVowel(char ch) {
        // Check if the character is a vowel (case-insensitive)
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}



