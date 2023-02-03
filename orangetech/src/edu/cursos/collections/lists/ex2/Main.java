package edu.cursos.collections.lists.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] perguntas = {"Telefonou para a vítima?", "Esteve no local do crime?", "Mora perto da vítima?", "Devia para a vítima?", "Já trabalhou com a vítima?"};
		List<Integer> respostas = new ArrayList<>();
		String resposta;
		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println(perguntas[i]);
			resposta = sc.next();
			
			if (resposta.equals("sim")) respostas.add(1);
			else respostas.add(0);
		}
		
		avaliaTestemunha(respostas);
		
		sc.close();
	}
	
	static void avaliaTestemunha(List<Integer> respostas) {
		
		int afirmativas = 0;
		
		for (Integer integer : respostas) {
			if (integer == 1)
				afirmativas++;
		}
		
		if (afirmativas == 2) System.out.println("Suspeito(a)");
		else if (afirmativas >= 3 & afirmativas <= 4) System.out.println("Cúmplice");
		else if (afirmativas == 5) System.out.println("Assassina");
		else System.out.println("Inocente");
		
	}

}
