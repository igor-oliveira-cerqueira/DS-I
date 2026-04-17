

import java.time.LocalDate;
import java.time.LocalDateTime;

import entidades.Consulta;
import entidades.Especialidade;
import entidades.Medico;
import entidades.Paciente;
import sistema.SistemaConsulta;

public class App {

	public static void main(String[] args) {
		
		//instanciando um objeto cardio do tipo Especialidade
		Especialidade cardio = new Especialidade();
		cardio.setId(1);
		cardio.setNome("Cardiologia");
		cardio.setDescricao("Doenças do coração e sistema cardiovascular.");
		
		
		//instanciando um medico do tipo Medico
		Medico medico = new Medico();
		medico.setId(1);
		medico.setCrm("CRM-SP 123456");
		medico.setEspecialidade(cardio);
		medico.setNome("Dra. Ana");
		
		//instanciando um objeto paciente do tipo Paciente
		Paciente paciente = new Paciente();
		paciente.setId(1);
		paciente.setNome("Pedro Silva");
		paciente.setTelefone("+55 (11) 1234-5678");
		paciente.setDataNascimento(LocalDate.of(2000, 4, 30));
		
		//instanciando um objeto sistema do tipo SistemaConsulta e instanciando uma consulta do tipo Consulta
		SistemaConsulta sistema = new SistemaConsulta();
		Consulta consulta = sistema.agendar(paciente, medico, LocalDateTime.now());
		sistema.exibirConsulta(consulta);
		
		
	}

}
