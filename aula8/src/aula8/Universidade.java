package aula8;

import java.util.ArrayList;

public class Universidade {
	
	private String nome;
	
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
	
	public void addDepartamento(Departamento departamento) {
		this.addDepartamento(departamento);

	}
	
	public void remuveDepartamento(Departamento departamento) {
		this.remuveDepartamento(departamento);

	}
	
	public void listDepartamentos() {
		for (Departamento departamento : departamentos) {
			System.out.println(departamento.getNome());
		}
	}
	

}
