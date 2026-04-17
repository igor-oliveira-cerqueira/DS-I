package entidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
	private int id;
	private Paciente paciente;
	private Medico medico;
	private LocalDateTime dataHora;
	private String status;
	private String observacoes;
	
	//construtor	
	public Consulta() {}
	
	//construtor sobrecarregado
	public Consulta(int id, Paciente paciente, Medico medico, LocalDateTime dataHora, String status,
			String observacoes) {
		this.id = id;
		this.paciente = paciente;
		this.medico = medico;
		this.dataHora = dataHora;
		this.status = status;
		this.observacoes = observacoes;
	}
	
	//confirmar consulta, colocar o status em agendado
	public void confirmar() {
		this.status = "Agendada";
	}
	
	//cancelar consulta, colocar o sattus em cancelado
	public void cancelar() {
		this.status = "Cancelada";
	}
	
	//reagendar, mudar o horário atual da consulta
	public void reagendar(LocalDateTime novaDataHora) {
		this.dataHora = novaDataHora;
	}
	
	//exibir dados da consulta
	public void exibir() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("----- CONSULTA -----");
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Médico: " + medico.getNome());
        System.out.println("Data/Hora: " + dataHora.format(formato));
        System.out.println("Status: " + status);
        System.out.println("--------------------");
    }
	
	//getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	
}
