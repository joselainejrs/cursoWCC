package br.com.womencancode.model;

public class ContaPoupanca extends Conta{	
	
    public ContaPoupanca(int numero, Cliente cliente, double saldo, double limite) {
    	super(numero, cliente, saldo, limite);		
 }
    
    @Override
    public void deposita() {
		System.out.println("Deposita da Classe CONTA POUPANÇA" + 136);

	}

}

