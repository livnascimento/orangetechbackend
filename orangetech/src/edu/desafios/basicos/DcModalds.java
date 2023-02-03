package edu.desafios.basicos;

import java.util.Scanner;

public class DcModalds {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.nextLine();
        String[] listaIngredientes = ingredientes.split(";");
        
        
        for (String str : listaIngredientes) {
            System.out.println(str);
        }
        
        leitor.close();
	}

}
