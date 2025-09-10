package aula6_exercicios;

import java.util.ArrayList;

public class Exercicio5 {
	public static void main(String[] agrs) {
		
		ArrayList<String> texto = new ArrayList<String>();
		texto.add("asdfg");
		texto.add("empuram da ponte jk");
		texto.add("tomar banho com a toradera");
		texto.add("quer morer?");
		texto.add("se fu");
		texto.add("chaw");
		texto.add("oi");
		texto.add("oi");
		texto.add("oi");
		
		name(texto);
	}
	
	public static void name(ArrayList<String> texto) {
		String comp = "oi";
		int num = 0;
		for(int i=0; i < texto.size(); i++) {
			if (texto.get(i) == comp) {
				num++;
			}
		}
		System.out.println(num);
	}
}
