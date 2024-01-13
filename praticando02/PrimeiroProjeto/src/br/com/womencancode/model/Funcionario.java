package br.com.womencancode.model;

//abstract é para evitar o distanciamento da class Funcionario
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	protected double salario;
	private int senha;
	private int numeroDefuncionarioGerenciados;

	public Funcionario(String nome, String cpf, double salario, int senha, int numeroDefuncionarioGerenciados) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.senha = senha;
		this.numeroDefuncionarioGerenciados = numeroDefuncionarioGerenciados;
	}

    public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	public double getSalario() {
		return salario;
	}	

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDefuncionarioGerenciados() {
		return numeroDefuncionarioGerenciados;
	}

	public void setNumeroDefuncionarioGerenciados(int numeroDefuncionarioGerenciados) {
		this.numeroDefuncionarioGerenciados = numeroDefuncionarioGerenciados;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido");
			return true;
		} else {
			System.out.println("Acesso Negado");
			return false;
		}
	}

}