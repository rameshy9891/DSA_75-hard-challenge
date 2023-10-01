package com.masai.ArrayQuestion;

import java.util.Scanner;

public class DivisionTask {
	
	/* 
	 * we have divede 32 number by you take input of n
	 * if that divide Floor result is Zero then print "Too Low"
	 * in case it is not possible to generate a valid number print -1
	 * in all other cases print x or result;
	 * 
	 *  sample input: 4    sample output: 8
	 *  sample input: 3    sample output: 10
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("please enter the number so we can divide(32/number)");
	
	Scanner sc= new Scanner(System.in);
	
	int num= sc.nextInt();
	
	int res= Math.floorMod(32,num);
	
	System.out.println(res);

	}

}
