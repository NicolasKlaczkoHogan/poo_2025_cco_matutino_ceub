package aula6_exercicios;

import java.util.ArrayList;
import java.util.HashSet;

public class Exercicio2 {
	
	public static void main(String[] agrs) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(4);
		numeros.add(3);
		numeros.add(2);
		numeros.add(2);
		numeros.add(1);
		numeros.add(1);
		
		contarUnicos(numeros);
		
	}
	public static void contarUnicos(ArrayList<Integer> numeros){
		HashSet<Integer> soUnicos = new HashSet<Integer>(numeros);
		System.out.println(soUnicos.size());
	}
}
