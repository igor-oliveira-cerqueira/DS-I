package entidades;

import java.time.LocalDate;

public class Paciente {
	private int id;
	private String nome;
	private String telefone;
	private LocalDate dataNascimento;
		
	// construtor
	public Paciente() {}
	
	// construtor sobrecarregado
	public Paciente(int id, String nome, String telefone, LocalDate dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}
		
	// getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
