package aula8;

import java.util.ArrayList;

public class Departamento {

	private String nome;
	
	private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	
	public void addProfesor(Profesor profesor) {
		this.addProfesor(profesor);

	}
	
	public void remuveProfesor(Profesor profesor) {
		this.remuveProfesor(profesor);

	}
	
	public void listProfesor() {
		for (Profesor profesor : profesores) {
			System.out.println(profesor.getNome());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}
	
	
	
	
}
