package edu.cursos.repeticaoearrays.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class ParEImpar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0, pares = 0, impares = 0;
		int numero;
		
		int n = sc.nextInt();
		
		do {
			
			numero = sc.nextInt();
			
			if (numero % 2 == 0)
				pares++;
			else
				impares++;
	
			contador++;
		} while (contador < n);
		
		System.out.println(pares + " valores pares");
		System.out.println(impares + " valores ímpares");

		sc.close();
		
	}

}
