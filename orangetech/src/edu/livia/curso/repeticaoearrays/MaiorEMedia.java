package edu.livia.curso.repeticaoearrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaiorEMedia {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[5];
		int media = 0;
		
		for (int i = 0 ; i < numeros.length ; i++) {
			numeros[i] = sc.nextInt();
		}
		
		for (int i : numeros) 
			media += i;
		
		media /= 5;
		
		Arrays.sort(numeros);
		
		System.out.println("Maior: " + numeros[4]);
		System.out.println("Media: " + media);
		
		sc.close();
		
	}

	
}
