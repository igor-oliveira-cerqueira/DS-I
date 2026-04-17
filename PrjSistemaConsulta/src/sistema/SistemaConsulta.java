package sistema;

import java.time.LocalDateTime;
import entidades.Consulta;
import entidades.Medico;
import entidades.Paciente;

public class SistemaConsulta {
	
	//agenda a consulta, ou seja: paciente, medico e data
	public Consulta agendar(Paciente paciente, Medico medico, LocalDateTime data) {
		
		Consulta consulta = new Consulta();
		consulta.setPaciente(paciente);
		consulta.setMedico(medico);
		consulta.setDataHora(data);
		consulta.confirmar();
		return consulta;
	}
	
	//cancela a consulta, pelo sistema
	public void cancelar(Consulta consulta) {
		consulta.cancelar();
	}
	
	//reagenda a consulta pelo sistema
	public void reagendar(Consulta consulta, LocalDateTime data) {
		consulta.reagendar(data);
	}
	
	//exibir dados da consulta pelo sistema
	public void exibirConsulta(Consulta consulta) {
		consulta.exibir();
	}
	
}
