package desafiosBasicos;

import java.util.Scanner;

public class Imoveis {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        String frase = leitor.nextLine();
        String dados[] = frase.split("/");
        
        String imovel = dados[0];
        String aluguel = dados[1];
        String disponibilidade = dados[2];
        
        leitor.close();
        
        System.out.printf("Imovel: %s R$%s %s", imovel, aluguel, disponibilidade);
	}
}
