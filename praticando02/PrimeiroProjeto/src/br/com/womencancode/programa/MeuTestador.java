package br.com.womencancode.programa;

import java.util.Arrays;
import java.util.List;

import br.com.womencancode.model.Autenticavel;
import br.com.womencancode.model.Diretor;
import br.com.womencancode.model.Funcionario;
import br.com.womencancode.model.Gerente;
import br.com.womencancode.model.SistenaInterno;
import br.com.womencancode.model.SuperIn;
import br.com.womencancode.model.Vendedor;

public class MeuTestador {
	public static void main(String[] args) {

		Autenticavel s = new SuperIn("Adailda", "123.321.321-52", 100, 321, 123);
		Autenticavel g = new Gerente("Souza", "144.445.556-85.", 100, 175, 3);
		Autenticavel d = new Diretor("Aline", "144.445.556-85.", 100, 175, 3);
		Autenticavel v = new Vendedor("Aline", "144.445.556-85.", 100);

		List<Funcionario> funcionario = Arrays.asList(s, g, d, v);
		for (Funcionario f : funcionario) {
			System.out.println(f.getBonificacao());
		}

		List<Autenticavel> funcionarioAutenticavel = Arrays.asList(g, s, d, v);

		SistenaInterno sistema = new SistenaInterno();
		for (Autenticavel f : funcionarioAutenticavel) {
			sistema.login(f);
		}
	}
}
