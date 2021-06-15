package br.com.cadastrarAutor.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Autor> lista = new ArrayList<Autor>();
	private static Integer chaveSequencial = 1;
	
	
	public void adiciona(Autor autor) {
		autor.setId(Banco.chaveSequencial++);
		lista.add(autor);
	}

	public List<Autor> getAutores() {
		return Banco.lista;
	}

	
	
	
}
