package edu.livia.curso.condicionaisefluxo;

import java.util.Scanner;

public class MesAno {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int mesNumerico = leitor.nextInt();
		
		if (mesNumerico >= 1 && mesNumerico <= 12) {
			
			switch (mesNumerico) {
				case 1:
					System.out.println("janeiro");
					break;
				case 2:
					System.out.println("fevereiro");
					break;
				case 3:
					System.out.println("março");
					break;
				case 4:
					System.out.println("abril");
					break;
				case 5:
					System.out.println("maio");
					break;	
				case 6:
					System.out.println("junho");
					break;
				case 7:
					System.out.println("julho");
					break;
				case 8:
					System.out.println("agosto");
					break;
				case 9:
					System.out.println("setembro");
					break;
				case 10:
					System.out.println("outubro");
					break;
				case 11:
					System.out.println("novembro");
					break;
				case 12:
					System.out.println("dezembro");
					break;
			}
		} else {
			System.out.println("mês inválido");
		}
		
		leitor.close();
	}
	
}
