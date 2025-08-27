package exercicioFuncionario;

public class FuncionarioCLT extends Funcionario{

	@Override
	public void calcularSalario(double fimDoMes) {
		System.out.println(getSalarioBase()*1.1);
		
	}


}
