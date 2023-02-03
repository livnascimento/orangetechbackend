package edu.cursos.repeticaoearrays.arrays;

import java.util.Arrays;
import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números, seus antecessores e seus sucessores.
*/

public class NumerosAleatorios {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] numeros = new int[20];
		
		for(int i = 0 ; i < numeros.length ; i++)
			numeros[i] = random.nextInt(100);
		
		System.out.println("Números aleatórios: " + Arrays.toString(numeros));
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]--;
 		}
		
		System.out.println("Antecessores: " + Arrays.toString(numeros));
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]+=2;
 		}
		
		System.out.println("Sucessores: " + Arrays.toString(numeros));
		
	}

}
