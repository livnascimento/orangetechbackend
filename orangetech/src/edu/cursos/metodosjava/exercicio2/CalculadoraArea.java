package edu.cursos.metodosjava.exercicio2;

public class CalculadoraArea {

	public static double calculaArea (int l) {
		return l * l;
	}
	
	public static double calculaArea (int B, int b, int h) {
		return ((B + b) * h) / 2;
	}
	
	public static double calculaArea (int b, int h) {
		return b * h;
	}
	
}
