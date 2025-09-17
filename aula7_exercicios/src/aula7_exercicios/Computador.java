package aula7_exercicios;

public class Computador {

	private Processador processador;
	private MemoriaRAM memoriaRAM;
	
	public Computador(Processador processador, MemoriaRAM memoriaRAM) {
		this.processador = processador;
		this.memoriaRAM = memoriaRAM;
	}
	
	

	public Processador getProcessador() {
		return processador;
	}

	public void setProcessador(Processador processador) {
		this.processador = processador;
	}

	public MemoriaRAM getMemoriaRAM() {
		return memoriaRAM;
	}

	public void setMemoriaRAM(MemoriaRAM memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}
	
}
