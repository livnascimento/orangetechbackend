package edu.livia.curso.repeticaoearrays;

import java.util.Scanner;

/*
		//Faça um programa que leia conjuntos de dois valores,
		//o primeiro representando o nome do aluno e o segundo representando a sua idade.
		//(Pare o programa inserindo o valor 0 no campo nome)
 */

public class NomeIdade {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		String nome;
		int idade;
		
		while (true) {
			
			System.out.print("Nome: ");
			nome = leitor.next();
			
			if (nome.equals("0")) break;
			
			System.out.print("\nIdade: ");
			idade = leitor.nextInt();
			
		}
		
		leitor.close();
		
	}

}
