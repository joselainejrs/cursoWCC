package br.com.womencancode.programa;

import java.util.Arrays;
import java.util.List;

import br.com.womencancode.model.Diretor;
import br.com.womencancode.model.Funcionario;
import br.com.womencancode.model.Gerente;
import br.com.womencancode.model.SuperIn;

public class TestaSuperIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario s = new SuperIn("Adailda", "123.321.321-52", 100, 321, 123);
		Funcionario g = new Gerente("Souza", "144.445.556-85.", 100, 175, 3);
		Funcionario d = new Diretor("Aline", "144.445.556-85.", 100, 175, 3);

		List<Funcionario> funcionario = Arrays.asList(s, g, d);

		for (Funcionario f : funcionario) {

			System.out.println(f.getBonificacao());
			

		}

	}
}