package edu.cursos.collections.lists.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Double> temperaturas = new ArrayList<Double>();
		String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho"};
		double temperatura, media = 0;
		
		for (int i = 0 ; i < 6 ; i++) {
			temperatura = sc.nextDouble();
			temperaturas.add(temperatura);
		}
		
		for (Double temp : temperaturas) {
			media += temp;
		}
		
		media /= 6;
		
		for (Double temp : temperaturas) {
			if (temp > media)
				System.out.printf("A temperatura %.1f estava acima da média em %s\n", temp, meses[temperaturas.indexOf(temp)]);
		}
		
		sc.close();
	}
	
}
