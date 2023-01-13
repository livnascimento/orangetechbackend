package edu.livia.curso.repeticaoearrays.arrays;

import java.util.Arrays;
import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

public class ArrayMultidimensional {
	
	public static void main(String[] args) {
		
		int[][] matriz = new int [4][4];
		
		Random random = new Random();
		
		for(int i = 0 ; i < matriz.length ; i++) {
			for(int j= 0 ; j < matriz[i].length ; j++)
				matriz[i][j] = random.nextInt(9);
		}
		
		for(int i = 0 ; i < matriz.length ; i++) {
			
			for(int j = 0 ; j < matriz[i].length ; j++) {
				
				System.out.print(" " + matriz[i][j] + "");
				
			}
			System.out.println("\n");
			
		}
	}
	
}
