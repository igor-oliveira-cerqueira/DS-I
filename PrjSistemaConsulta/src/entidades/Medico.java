package entidades;

public class Medico {
	private int id;
	private String nome;
	private String crm;
	private Especialidade especialidade;
		
	// construtor
	public Medico() {}

	// construtor sobrecarregado
	public Medico(int id, String nome, String crm, Especialidade especialidade) {
		this.id = id;
		this.nome = nome;
		this.crm = crm;
		this.especialidade = especialidade;
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

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
}

