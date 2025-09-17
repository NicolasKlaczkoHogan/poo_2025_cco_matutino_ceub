package aula7_exercicios;

public class Principal {

	public static void main(String[] agrs) {
		
		String autor = "J.R.R.Tolking";
		String titulo = "Hobit";
		String anopublicacao = "21/9/1937";
		
		Livro l1 = new Livro(titulo,autor,anopublicacao);
		
		System.out.println(l1.getTitulo() +
							"-" +
							l1.getAutor() +
							"-" + 
							l1.getAnoPublicacao());

	
	
		Processador pro = new Processador();
		pro.setMarca("intel");
		pro.setFrequencia("2.66GHz");
		
		MemoriaRAM memo = new MemoriaRAM();
		memo.setTipo("DDR");
		memo.setCapacidade("16gb");
		
		Computador c1 = new Computador(pro, memo);
	
		exibirDetalhes(c1);
	
	}

	private static void exibirDetalhes(Computador c1) {
		System.out.println(c1.getMemoriaRAM().getTipo()  +
				"-" +
				c1.getMemoriaRAM().getCapacidade() +
				"-" +
				c1.getProcessador().getMarca() +
				"-" + 
				c1.getProcessador().getFrequencia());
		
	}



}
