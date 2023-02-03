package edu.cursos.repeticaoearrays.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[6];
		
		for (int i = 0 ; i < numeros.length ; i++) 
			numeros[i] = sc.nextInt();
		
		Arrays.sort(numeros);
		
		for (int i = (numeros.length - 1) ; i >= 0 ; i--)
			System.out.println(numeros[i]);
		
		sc.close();
		
	}

}
