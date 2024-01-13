package br.com.womencancode.programa;

import br.com.womencancode.model.Autenticavel;
import br.com.womencancode.model.Gerente;
import br.com.womencancode.model.SistenaInterno;

public class TestaLogin {

	public static void main(String[] args) {
		
		
		Autenticavel gerente = new Gerente("Aline", "1234", 0, 0, 0);
		SistenaInterno sistema = new SistenaInterno();
		sistema.login(gerente);
	}

}
