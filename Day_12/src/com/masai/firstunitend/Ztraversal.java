package com.masai.firstunitend;

import java.util.Scanner;

public class Ztraversal {
	/*
	 * sample input:                         sample output:
	 * 
	 * 1
	 * 3
	 * 1 2 3                               1 2 3 5 7 8 9
	 * 4 5 6
	 * 7 8 9
	 * 
	 * 
	 * 
	 * hint =          
	 * 
	 * **********
	 *         *
	 *        *
	 *       *
	 *      *
	 *     *
	 *    *
	 *   *
	 *  *
	 * ********** 
	 */
	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int testCases = scanner.nextInt();
        
        for (int t = 0; t < testCases; t++) {
            int n = scanner.nextInt();
            int[][] grid = new int[n][n];
            
            // Read the grid values
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = scanner.nextInt();
                }
            }
            
            // Perform Z-traversal
            zTraversal(grid, n);
        }
        
        scanner.close();
    }
    
    public static void zTraversal(int[][] grid, int n) {
    
    	
    	for(int i=0; i<n; i++) {
    		System.out.print(grid[0][i]+" ");
    	}
    	
    	for(int i=1, j=grid.length-2; i<n-1; i++,j--) {
    		System.out.print(grid[i][j]+" ");
    	}
    	for(int i=0; i<n; i++) {
    		System.out.print(grid[grid.length-1][i]+" ");
    	}
    	
    }
}

