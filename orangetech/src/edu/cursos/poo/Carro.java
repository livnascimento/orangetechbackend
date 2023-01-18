package edu.cursos.poo;

public class Carro {
		
		private int portas;
		private int ano;
		private int capacidadeTanque;
		private String cor;
		
		void setCapacidade(int capacidadeTanque) { this.capacidadeTanque = capacidadeTanque; }

		int getCapacidade() { return capacidadeTanque; }
		
		void setCor(String cor) {this.cor = cor;}
		
		String getCor() { return cor; }
		
		void setAno (int ano) {this.ano = ano;}
		
		int getAno() {return ano;}
		
		public double precoEncherTanque(double precoGasolina) {
			return precoGasolina * capacidadeTanque;	
		}
				
}

