package com.masai.rev;

public class ReverseWord {
	
	
	/*
	 * input: today is bright and sunny
	 * 
	 * output : yadot si thgirb dna ynnus
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String input= "today is bright and sunny";
     
     String output= reverseWords(input);
     
     System.out.println(output);

	}
	
	public static String reverseWords(String input) {
		String[] words= input.split(" ");
		
		StringBuilder reversed= new StringBuilder();
		
		for(String word: words) {
			StringBuilder reverseWord= new StringBuilder();
			
			for(int i= word.length()-1; i>=0;i--) {
			reverseWord.append(word.charAt(i));
		}
			
			reversed.append((reverseWord).append(" "));
	}

		return reversed.toString().trim();
}
}
