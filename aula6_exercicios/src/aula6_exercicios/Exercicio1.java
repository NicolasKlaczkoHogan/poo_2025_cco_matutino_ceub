package aula6_exercicios;

import java.util.ArrayList;

public class Exercicio1 {

	public static void main(String[] agrs) {
		
		ArrayList<String> cardapio = new ArrayList<String>();
		
		cardapio.add("mararao");
		cardapio.add("amburger");
		cardapio.add("quejo");
		cardapio.add("bife");
		
		System.out.println(cardapio.size());
		System.out.println(cardapio.contains("bife"));
	}
}
