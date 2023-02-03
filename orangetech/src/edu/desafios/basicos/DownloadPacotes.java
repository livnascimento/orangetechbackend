package edu.desafios.basicos;

import java.util.Scanner;

public class DownloadPacotes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        String barra = "/";
        String saida = barra.repeat(tamanho);

        System.out.println(saida);

        leitor.close();
	}
}
