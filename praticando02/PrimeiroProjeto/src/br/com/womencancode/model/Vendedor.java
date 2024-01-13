package br.com.womencancode.model;

public class Vendedor extends Funcionario implements Autenticavel {

	public Vendedor(String nome, String cpf, double salario) {
		super(this.salario, nome, cpf);

	}

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return getSalario() * 1.4 + 1000;
	}

}
