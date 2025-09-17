package aula7_exercicios;

public class Livro {

	private String titulo;
	private String autor;
	private String anoPublicacao;
	
	public Livro(String titulo, String autor, String anopublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anopublicacao;

		
		
}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
}