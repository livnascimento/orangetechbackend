package edu.desafios.basicos;

import java.util.Scanner;

public class FilaCamarote {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        
        for (int i = 0 ; i <= tamanhoDaFila ; i++){
          if (i % 2 != 0 ) {
            pessoasNoCamarote++;
          }
        }
        
        System.out.printf("%d pessoas no camarote", pessoasNoCamarote);
	
        leitor.close();
        
	}
}
