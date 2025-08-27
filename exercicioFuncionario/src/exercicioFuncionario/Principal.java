package exercicioFuncionario;

public class Principal {

	public static void main(String[]args) {
		
		FuncionarioCLT clt1 = new FuncionarioCLT();
		clt1.setNome("vagabundo");
		clt1.setSalarioBase(1500.30);
		clt1.calcularSalario(clt1.getSalarioBase());
		
		FuncionarioPJ pj1 = new FuncionarioPJ();
		pj1.setNome("vagabundo dois");
		pj1.setSalarioBase(1370.00);
		clt1.calcularSalario(pj1.getSalarioBase());
		
		FuncionarioComissionado fc1 = new FuncionarioComissionado();
		fc1.setNome("tres vagabundos");
		fc1.setSalarioBase(1458.32);
		fc1.setComisao(430.00);
		clt1.calcularSalario(fc1.getSalarioBase());
	}
}
