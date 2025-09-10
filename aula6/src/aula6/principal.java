package aula6;

import java.util.ArrayList;

public class principal {
	public static void main(String[] agrs) {
		
		ArrayList<String> disiplinas = new ArrayList<String>();
		disiplinas.add("Banco de dados II");
		disiplinas.add("POO");
		disiplinas.add("Desemvolvimento de Interfase");
		disiplinas.add("algebra");
		
		System.out.println(disiplinas);
		
		System.out.println(disiplinas.get(2));
		
		disiplinas.set(0, "Danco de Dados I");
		System.out.println(disiplinas);
		
		disiplinas.remove(3);
		System.out.println(disiplinas);
		
		System.out.println(disiplinas.size());
		
		for(int i = 0; i< disiplinas.size(); i++) {
			System.out.println(disiplinas.get(i));
		}
		
		for(String disiplina : disiplinas) {
			System.out.println(disiplina);
		}
		
		
		
	}

}
