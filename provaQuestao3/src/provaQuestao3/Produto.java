package provaQuestao3;

public class Produto {

	private  String nome;
	private double preso;
	
	
	
	public static void main(String[] agrs) {
		Produto p1 = new Produto();
		p1.setNome("treco");
		p1.setPreso(150.95);
		p1.exibirDetalhes(p1);
		
		
	}
	
	private static void exibirDetalhes(Produto p1) {
		System.out.println(p1.getNome() + ":" + p1.getPreso());
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreso() {
		return preso;
	}

	public void setPreso(double preso) {
		this.preso = preso;
	}
	
	
}
