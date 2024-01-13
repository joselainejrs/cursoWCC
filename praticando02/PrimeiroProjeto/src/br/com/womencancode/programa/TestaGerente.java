package br.com.womencancode.programa;

import br.com.womencancode.model.Gerente;

public class TestaGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente("Joana", "1234", 1000, 123, 5);

		g1.autentica(123);
			
	}

}
