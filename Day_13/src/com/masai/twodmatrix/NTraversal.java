package com.masai.twodmatrix;

import java.util.Scanner;

public class NTraversal {
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int leng=sc.nextInt();
		
		int[][] mat= new int[leng][leng];
		
		for(int i=0; i<leng; i++) {
			
			for(int j=0; j<leng; j++) {
			
				mat[i][j]=sc.nextInt();
				
			}
		}
		
		nTraversal( mat,leng);
	}

	private static void nTraversal(int[][] mat, int leng) {
		// TODO Auto-generated method stub
		
		for(int i=mat.length-1; i>=0; i--) {
			System.out.print(mat[i][0]+" ");
		}
		
		for(int i=1; i<=mat.length-2; i++) {
			System.out.print(mat[i][i]+" ");
		}
		
		for(int i=mat.length-1; i>=0; i--) {
			System.out.print(mat[i][mat.length-1]+" ");
		}
		
	}

}
