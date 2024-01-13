package br.com.womencancode.model;
public abstract class Conta {
	
	private int numero;
	private Cliente cliente;
	private double saldo;
	private double limite;
	
	public Conta(int numero, Cliente cliente, double saldo, double limite) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public abstract double deposita();

	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	} 

  	public void deposita(double quantidade){
		this.saldo += quantidade;
	}

	 public boolean saca(double valor){
		if(this.saldo <valor){
			System.out.println("[Saque não Realizado]"); 
			return false;
		}
		else {
			this.saldo = this.saldo -valor;
			System.out.println("[Saque Rrealizado]"); 
			return true;
		    }
	    }

	 void transfere(Conta destino, double valor){
		this.saldo = this.saldo-valor;
		destino.saldo = destino.saldo + valor;


	}
}
