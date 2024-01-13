package br.com.womencancode.model;

import br.com.womencancode.model.Funcionario;

public class SuperIn extends Funcionario implements Autenticavel{

	private int senha;

	public SuperIn(String nome, String cpf, double salario, int senha, int numeroDefuncionarioGerenciados) {
		super(nome, cpf, salario, senha, numeroDefuncionarioGerenciados);
		this.senha = senha;
		// TODO Auto-generated constructor stub
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
