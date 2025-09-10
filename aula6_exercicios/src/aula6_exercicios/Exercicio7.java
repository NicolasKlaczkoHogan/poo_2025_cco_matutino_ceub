package aula6_exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exercicio7 {
	public static void main(String[] agrs) {
		Pesoa p1= new Pesoa();
		p1.setNome("nicolas");
		p1.setIdade(18);
		p1.setId("952723");
		p1.setSalario(157.64);
		
		Pesoa p2= new Pesoa();
		p2.setNome("juliano");
		p2.setIdade(52);
		p2.setId("4251");
		p2.setSalario(8563.45);
		
		Pesoa p3= new Pesoa();
		p3.setNome("retangulo");
		p3.setIdade(87);
		p3.setId("5781");
		p3.setSalario(951.63);
		
		Pesoa p4= new Pesoa();
		p4.setNome("caitano");
		p4.setIdade(5);
		p4.setId("123");
		p4.setSalario(7561.85);
		
		ArrayList<Pesoa> list = new ArrayList<Pesoa>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		
	}
	private void ordem(ArrayList<Pesoa> list) {
		Pesoa.sort(Comparator.comparingInt(Pesoa::getIdade));
	}
}
