package maventest;

public class Calculadora {

	private int valor1;
	private int valor2;
	
	public Calculadora(int valor1, int valor2) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public int soma() {
		// TODO Auto-generated method stub
		return valor2 + valor1;
	}
	public int divisao() {
		// TODO Auto-generated method stub
		return valor1 / valor2;
	}
	public int multiplicacao() {
		// TODO Auto-generated method stub
				return valor1 * valor2;
	}
}

