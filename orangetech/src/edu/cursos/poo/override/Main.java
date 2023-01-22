package edu.cursos.poo.override;

public class Main {
	
	public static void main(String[] args) {
		
		SuperClasse[] classes = new SuperClasse[] {new SubClasse1(), new SubClasse2(), new SuperClasse()};
		
		for (SuperClasse classe : classes) {
			classe.metodo1();
		}
		
	}

}
