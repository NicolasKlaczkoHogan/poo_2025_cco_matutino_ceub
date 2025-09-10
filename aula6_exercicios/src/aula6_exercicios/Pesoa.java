package aula6_exercicios;

import java.util.Comparator;

public class Pesoa {

	private String nome;
	private int idade;
	private String id;
	private double salario;
	
	
	
	
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
	 * @return the idade
	 */
	public int getIdade() {
		return idade;
	}
	/**
	 * @param idade the idade to set
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param string the id to set
	 */
	public void setId(String string) {
		this.id = string;
	}
	public static void sort(Comparator<Pesoa> comparingInt) {
		// TODO Auto-generated method stub
		
	}
	
	
}

