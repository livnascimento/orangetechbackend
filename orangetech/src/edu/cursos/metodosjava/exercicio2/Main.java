package edu.cursos.metodosjava.exercicio2;

/* Usando sobrecarga, crie uma aplicação que calcule
 * a área dos 3 quadriláteros notáveis:
 * quadrado, retângulo e trapézio.
 */

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("A área do quadrado de lado 6 é:");
		System.out.println(CalculadoraArea.calculaArea(6));
		
		System.out.println("A área do retângulo de base 6 e altura 7 é:");
		System.out.println(CalculadoraArea.calculaArea(6, 7));
		
		System.out.println("A área do trapézio de base maior 7, base menor 6 e altura 8 é:");
		System.out.println(CalculadoraArea.calculaArea(7, 6, 8));
		
	}

}
