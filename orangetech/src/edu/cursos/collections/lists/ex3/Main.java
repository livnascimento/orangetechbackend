package edu.cursos.collections.lists.ex3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Map<String, Livro> livros = new HashMap<String, Livro>() {
			{
				put("Jonathan Swift", new Livro("As Viagens de Gulliver", 320));
				put("José Mauro de Vasconcelos", new Livro("O Meu Pé de Laranja Lima", 232));
				put("Morris Gleitzman", new Livro("Uma vez", 160));
			}
		};

		Set<Map.Entry<String, Livro>> ordenacaoPaginas = new TreeSet<>(new ComparatorPaginas());
		ordenacaoPaginas.addAll(livros.entrySet());

		for (Entry<String, Livro> entry : ordenacaoPaginas) {
			System.out.println(entry.getValue().getNome() + ", com " + entry.getValue().getPaginas() + " páginas");
		}
		
	}

}

class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>> {

	@Override
	public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
		return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
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
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}
	
	@Override
	public String toString() {
		return nome + " " + paginas;
	}
}
