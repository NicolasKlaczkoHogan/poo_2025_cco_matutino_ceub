package aula8;

import java.util.ArrayList;

public class Biblioteca {

	private String nome;
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	
	public void adicionarLivro(Livro livro) {
		this.livros.add(livro);
	}
	
	public void removerlivro(Livro livro) {
		this.livros.remove(livro);
		
	}
	
	public void listarLivros() {
		for (Livro livro : livros) {
			System.out.println(livro.getTitulo());
		}
		
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	


}

		
