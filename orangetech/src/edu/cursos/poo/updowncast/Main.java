package edu.cursos.poo.updowncast;

public class Main {

	Funcionario gerente = new Gerente();
	Funcionario vendedor = new Vendedor();
	Funcionario faxineiro = new Faxineiro();
	
	Gerente gerente_ = (Gerente) new Funcionario();
	
}
