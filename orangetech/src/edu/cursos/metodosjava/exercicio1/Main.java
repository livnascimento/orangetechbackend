package edu.cursos.metodosjava.exercicio1;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Olá!");
		System.out.println(Mensagem.retornaMensagem(17));
		
		
		System.out.println("\nO valor de cada parcela é: ");
		System.out.println(Emprestimo.calculaParcela(1000, 5));
		
		System.out.println("\nAs operações são entre 20 e 10: ");
		System.out.println(Operacoes.soma(20, 10));
		System.out.println(Operacoes.subtracao(20, 10));
		System.out.println(Operacoes.multiplicacao(20, 10));
		System.out.println(Operacoes.divisao(20, 10));
		
	}

}
