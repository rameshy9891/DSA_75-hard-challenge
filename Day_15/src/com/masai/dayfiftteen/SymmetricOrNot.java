package com.masai.dayfiftteen;

import java.util.Scanner;

public class SymmetricOrNot {
	
	/*
	 * in this we will check first or last row is same also check in loop like this
	 * secend and last-1
	 * 
	 * also we will check column check in a same way
	 * 
	 * sample input:                          sample output:
	 * 
	 * 5
	 * 2
	 * 11                                        YES
	 * 11
	 * 4
	 * 0101                                      NO
	 * 0110
	 * 0110
	 * 0101
	 * 4
	 * 1001                                       YES
	 * 0000
	 * 0000
	 * 1001
	 * 5
	 * 01110                                      YES
	 * 01010
	 * 10001
	 * 01010
	 * 01110
	 * 5
	 * 00100                                       NO
	 * 01010
	 * 10001
	 * 01010
	 * 01110
	 */
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the test case");
		int tc= sc.nextInt();
		
		
		for(int i=0; i<tc; i++) {
			
			
			System.out.println("enter the length of the matrix");
			
			int len=sc.nextInt();
			
			char[][] mat= new char[len][len];
			
			
			for(int j=0; j<len; j++) {
				String line=sc.next();
				
				for(int k=0; k<len; k++) {
					mat[j][k]=line.charAt(k);
				}
			}
			
			
			 boolean isSymmetric = checkSymmetry(mat, len);
	            System.out.println(isSymmetric ? "YES" : "NO");
			
			
		}
		
		
		
	}

	 private static boolean checkSymmetry(char[][] mat, int len) {
	        for (int i = 0; i < len; i++) {
	            for (int j = 0; j < len; j++) {
	                // Check if the element at mat[i][j] is not equal to its corresponding element
	                // across the main diagonal mat[j][i]
	                if (mat[i][j] != mat[j][i]) {
	                    return false;
	                }
	            }
	        }
	        return true;
	        
	 }

}
