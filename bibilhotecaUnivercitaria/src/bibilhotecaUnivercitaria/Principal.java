package bibilhotecaUnivercitaria;

public class Principal {
	public static void main(String[]args) {
		
		
		
		livro livro1 = new livro();
		livro1.nome = "lovro";
		livro1.anoPublicaco = 1000;
		livro1.edicao = 1;
		livro1.genego = "ficcao";
		livro1.idioma = "portuges";
		livro1.ISBN = "5128";
		livro1.pagCount = 452;
		livro1.editora = "???";
		
		revista revista1 = new revista();
		revista1.anoPublicaco = 2025;
		revista1.editora = "vivo";
		revista1.idioma = "sumario";
		revista1.ISSN = "852";
		revista1.nome = "gilgamesh";
		revista1.pagCount = 67;
		revista1.volume = 8;
		
		tese tese1 = new tese();
		tese1.anoPublicaco = 2;
		tese1.area = "tera planismo";
		tese1.editora = "syence";
		tese1.idioma = "latim";
		tese1.pagCount = 30;
		
	}
}
