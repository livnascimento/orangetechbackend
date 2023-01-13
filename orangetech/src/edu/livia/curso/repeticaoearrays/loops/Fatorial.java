package edu.livia.curso.repeticaoearrays;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fatorial = sc.nextInt();
		int cont = fatorial;
		
		
		for (int i = 1; i < cont ; i++) {
			fatorial *= i;
		}
		
		System.out.printf("O fatorial de %d é: %d",cont,  fatorial);
		
		sc.close();
		
	}
	
}
