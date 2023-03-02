package edu.cursos.collections.lists.ex4;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		List< Livro> livros = new ArrayList<Livro>() {
			{
				add(new Livro("As Viagens de Gulliver", 320));
				add( new Livro("O Meu Pé de Laranja Lima", 232));
				add( new Livro("Uma vez", 160));
			}
		};

		livros.sort(Comparator.comparing(Livro::getNome));
		System.out.println(livros);
	}

}

class Livro {
	String nome;
	Integer paginas;

	public Livro(String nome, Integer paginas) {
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	@Override
	public String toString() {
		return nome + " " + paginas;
	}
}
