package edu.cursos.repeticaoearrays.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Nota {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		float nota = leitor.nextFloat();
		
		while (nota < 0 || nota > 10) {
			
			System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 10");
			
			nota = leitor.nextFloat();
			
		}
		
		leitor.close();
		
	}
	
}
