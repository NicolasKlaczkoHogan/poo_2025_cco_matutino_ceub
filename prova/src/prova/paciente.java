package prova;

public class paciente extends pessoa {
	private  int idPaciente;
	private  String convenio;
	private  String historicoMwdico;
	
	public void agendarConsulta() {
		
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public String getHistoricoMwdico() {
		return historicoMwdico;
	}

	public void setHistoricoMwdico(String historicoMwdico) {
		this.historicoMwdico = historicoMwdico;
	}
	
}
