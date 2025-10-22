package prova;

public class principal {
	public static void main(String[] agrs) {
		
		paciente pa1 = new paciente();
		pa1.setCpf(null);
		pa1.setName(null);
		pa1.setDataNacimento(null);
		pa1.setConvenio(null);
		pa1.setHistoricoMwdico(null);
		pa1.setIdPaciente(0);
		pa1.calcularIdade();
		
		proficional pr1 = new proficional();
		pr1.setCpf(null);
		pr1.setDataNacimento(null);
		pr1.setEspecialidade(null);
		pr1.setIdProficional(0);
		pr1.setName(null);
		pr1.setRegistroConselho(null);
		
		tratamento t1 = new tratamento();
		t1.setDataInicio(null);
		t1.setIdTratamento(0);
		t1.setStatus(null);
		t1.setPaciente(pa1);
		t1.setProficional(pr1);

		
		
	}
}



