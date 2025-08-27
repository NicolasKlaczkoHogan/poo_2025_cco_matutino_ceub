package exercicioFuncionario;

public class FuncionarioComissionado extends Funcionario {

	public double comisao;
	
	@Override
	public void calcularSalario(double fimDoMes) {
		System.out.println(getSalarioBase()+comisao);
		
	}

	/**
	 * @return the comisao
	 */
	public double getComisao() {
		return comisao;
	}

	/**
	 * @param comisao the comisao to set
	 */
	public void setComisao1(double comisao) {
		this.comisao = comisao;
	}

	public void setComisao(double comisao2) {
		// TODO Auto-generated method stub
		
	}



}
