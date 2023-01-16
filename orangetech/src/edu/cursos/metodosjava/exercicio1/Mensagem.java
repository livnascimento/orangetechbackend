package edu.cursos.metodosjava.exercicio1;

public class Mensagem {
	
	public static String retornaMensagem(int horario) {
		
		if (horario >=5 & horario < 12) 
			return "Bom dia!";
		 else if (horario >= 12 & horario < 19) 
			return "Boa tarde!";
		else if (horario >= 19 & horario <=23)
			return "Boa noite!";
		else if (horario >= 0 & horario < 4)
			return "Ei, tá esperando o sol nascer?";
					
		return "Horário inválido";
	}

}
