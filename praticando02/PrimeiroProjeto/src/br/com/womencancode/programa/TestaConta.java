package br.com.womencancode.programa;
import java.util.List;
import java.util.Arrays;

import br.com.womencancode.model.*;
import br.com.womencancode.programa.*;


public class TestaConta {

	public static void main(String[] args) {		
	  Cliente Mario = new Cliente("Mario", "000.000.000-00" );
	  Cliente Gabriel = new Cliente("Gabriel", "000.000.000-00" );
	 
	  ContaPoupanca cp = new ContaPoupanca(123, Mario, 452, 562);	 
	  ContaSalario cs = new ContaSalario(123, Gabriel, 452, 562);
	
	 
	  List<Conta> contas = Arrays.asList(cp, cs);
	 
	 contas.add(cp);
	 contas.add(cs);
	 	
		for(Conta conta : contas) {
			conta.deposita(100);

	}	
  }
}
