package br.com.womencancode.programa;

import br.com.womencancode.model.Cliente;

public class Progrma {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Wesley", "450.067.768-86");
		
		System.out.println(c1.getNome());
		System.out.println(c1.getCpf());				
	    
	}

}
