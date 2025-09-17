package aula7;

public class Principal {

	public static void main(String[] args) {
		
		String nome = "José da Silva";
		String ra = "12345678";
		
		Endereco end = new Endereco();
		end.setCep("7190900");
		end.setLogadoro("quadra 103 lot 03");
		end.setNumero(13);
		
		Aluno a1 = new Aluno(nome,ra,end);
		a1.setCpf("987.987.987-98");
		
		
		
		a1.setEndereco(end);
		
		System.out.println(a1.getNome() + 
							"-" +
							a1.getRa() +
							"-" +
							a1.getCpf() +
							"-" +
							a1.getEndereco().getLogadoro());
			
	}
	
}
