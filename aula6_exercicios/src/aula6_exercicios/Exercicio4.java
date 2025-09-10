package aula6_exercicios;

import java.util.ArrayList;

public class Exercicio4 {
	
	public static void main(String[] agrs) {
		
		ArrayList<Integer> digitos = new ArrayList<Integer>();
		digitos.add(1);
		digitos.add(0);
		digitos.add(62);
		digitos.add(59);
		digitos.add(5);
		
		meno(digitos);
	}
	public static void meno(ArrayList<Integer> digitos) {
		int menor= digitos.get(0);
		int save = 0;
		
		for(int i=0; i < digitos.size();i++) {
			
			if (digitos.get(i) < menor){
				menor = digitos.get(i);
				save = i;						
			}
		}
		
		System.out.println(save);
		
	}
}
