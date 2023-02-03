package edu.cursos.repeticaoearrays.arrays;

import java.util.Scanner;
import java.util.Arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Consoantes {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] letras = new String[6];
		String[] vogais = {"a", "e", "i", "o", "u"};
		int consoantes = 0;
		
		for (int i = 0; i < letras.length ; i ++) {
			letras[i] = sc.next();
		}
		
		for (String string : letras) {
			
			boolean consoante = Arrays.stream(vogais).noneMatch(string::equals);
			
			if(consoante) {
				consoantes++;
			};
		}
		
		System.out.println(consoantes);
		
		sc.close();
		
	}

}
