package br.com.womencancode.model;

public class SistenaInterno {
	public void login(Autenticavel a) {
		
		int senha = 1234;//obtem a senha de algum lugar
				
	
	boolean autenticou = a.autentica(senha);
	System.out.println("Ususario esta logado: " +autenticou);
	}

}
