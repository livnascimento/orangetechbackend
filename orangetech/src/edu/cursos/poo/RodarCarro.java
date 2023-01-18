package edu.cursos.poo;

public interface RodarCarro {
		
	public static void main(String[] args) {	
		
		Carro chevette = new Carro();
		
		chevette.setCor("verde");
		chevette.setCapacidade(53);
		chevette.setAno(1987);
		
		System.out.println(chevette.getAno());
		System.out.println(chevette.getCor());
		System.out.println(chevette.getCapacidade());
		System.out.println(chevette.precoEncherTanque(5.21));
		
	}
	
}
