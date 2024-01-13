package br.com.womencancode.model;

public class ContaSalario extends Conta{	
	
    public ContaSalario(int numero, Cliente cliente, double saldo, double limite) {
    	super(numero, cliente, saldo, limite);		
    }
    
    @Override
    public void deposita() {
		System.out.println("Deposita da Classe CONTA SALARIO" + 362);

	}

}
