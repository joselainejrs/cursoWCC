 class Conta {
	private int numero;
	private String titular;
	private double saldo;
	private double salario;

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	} 

  	void deposita(double quantidade){
		this.saldo += quantidade;
	}

	 boolean saca(double valor){
		if(this.saldo <valor){
			return true;
		}
		else {
			this.saldo =this.saldo -valor;
			return false;
		    }
	    }

	 void transfere(Conta destino, double valor){
		this.saldo = this.saldo-valor;
		destino.saldo = destino.saldo + valor;


	}
   
}