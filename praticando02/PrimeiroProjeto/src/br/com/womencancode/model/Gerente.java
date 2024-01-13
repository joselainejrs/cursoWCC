package br.com.womencancode.model;

public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;

	//metodos e atributos
	public Gerente(String nome, String cpf, double salario, int senha, int numeroDefuncionarioGerenciados) {
		super(cpf, cpf, salario, numeroDefuncionarioGerenciados, numeroDefuncionarioGerenciados);
	}

	public double getBonificacao() {
		return this.salario * 1.2+1000;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Negado");
			return false;
		} else {
			System.out.println();
			return true;
		}
	}

}