package prova;

import java.util.Date;

public class tratamento {
	private int idTratamento;
	private Date dataInicio;
	private String Status;
	private paciente paciente;
	private proficional proficional;
	
	public void finalizarTratamento() {
		
	}

	public int getIdTratamento() {
		return idTratamento;
	}

	public void setIdTratamento(int idTratamento) {
		this.idTratamento = idTratamento;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(paciente paciente) {
		this.paciente = paciente;
	}

	public proficional getProficional() {
		return proficional;
	}

	public void setProficional(proficional proficional) {
		this.proficional = proficional;
	}
	
	
}
