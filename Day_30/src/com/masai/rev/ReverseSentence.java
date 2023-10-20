package com.masai.rev;

import java.util.Arrays;

public class ReverseSentence {
	
	//input: we have a friends
	//Output: ew evah a sdenirf
	
	public static void main(String[] args) {
		
		String input= "we have a friends";
		
		String[] strArr= input.split(" ");
		
		//System.out.println(Arrays.toString(strArr));
		
		StringBuilder lastOutput= new StringBuilder();
		

		
		for(int i=0; i<=strArr.length-1; i++) {
			
			StringBuilder charreverser= new StringBuilder();
			
			char[] change= strArr[i].toCharArray();
			
			for(int j=change.length-1;  j>=0; j--) {
				charreverser.append(change[j]);
			}
			
			lastOutput.append(charreverser).append("    ");
			
			
		}
		
		
       String end= lastOutput.toString();
		
		System.out.println(end);
		
		
	}
	
	

}
