package aula8;

public class Principal {

	public static void main(String[] args) {
		
		Livro l1 = new Livro();
		l1.setTitulo("java basico");
		l1.setAno(2016);
		
		Livro l2 = new Livro();
		l2.setTitulo("php basico");
		l2.setAno(2018);
		
		Biblioteca b1 = new Biblioteca();
		b1.setNome("nicolas");
		
		b1.adicionarLivro(l1);
		b1.adicionarLivro(l2);
		
		b1.listarLivros();
		
		
		
		
		
	}
}
