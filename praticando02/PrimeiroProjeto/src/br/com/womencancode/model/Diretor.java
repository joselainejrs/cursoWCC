package br.com.womencancode.model;

public class Diretor extends Funcionario implements Autenticavel {


	public Diretor(String nome, String cpf, double salario, int senha, int numeroDefuncionarioGerenciados) {
		super(cpf, cpf, salario, numeroDefuncionarioGerenciados, numeroDefuncionarioGerenciados);
	}

	public double getBonificacao() {
		return this.salario * 1.3+1000;
	}

	public boolean autentica(int senha) {
		if (getSenha() == senha) {
			System.out.println("Acesso Permitido");
			return true;
		} else {
			System.out.println("Acesso Negado");
			return false;
		}
	}

}
