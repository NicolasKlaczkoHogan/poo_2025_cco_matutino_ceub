package provaQuesto2;

public abstract class Principal {

	public static void main(String[] agrs) {
		
		Violino v1 = new Violino();
		v1.tocar();
		
		Violino v2 = new Violino();
		v2.tocar();
		
		piano p1 = new piano();
		p1.tocar();
		
		piano p2 = new piano();
		p2.tocar();
	
	}
}
