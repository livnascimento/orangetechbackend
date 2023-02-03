package edu.desafios.basicos;

import java.util.Scanner;

public class Pontos {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();
        
        if (velocidade > 80) {
          
          multas++;
          if (multas >= 3){
            System.out.printf("%d multas. Levou pontos na carteira", multas);
          } else {
            System.out.printf("%d multas. Nao levou pontos na carteira", multas);
          }
          
        } else {
        	System.out.printf("%d multas. Nao levou pontos na carteira", multas);
        }
        
        leitor.close();
	}

}
