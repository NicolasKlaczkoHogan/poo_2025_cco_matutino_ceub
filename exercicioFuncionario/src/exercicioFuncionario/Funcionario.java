package exercicioFuncionario;

public abstract class Funcionario {

	private String cpf;
	private String nome;
	private double salarioBase;
	
	public abstract void calcularSalario(double fimDoMes);

	
	
	
	
	
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the salarioBase
	 */
	public double getSalarioBase() {
		return salarioBase;
	}

	/**
	 * @param salarioBase the salarioBase to set
	 */
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	
}
