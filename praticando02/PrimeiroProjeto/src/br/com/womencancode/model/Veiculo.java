package br.com.womencancode.model;

public class Veiculo {

	private String cor;
	private String modelo;
	private int ano;
	private double velocidadeAtual;
	private double velocidadeMaxima;

	/* Construtor com todos parametros */

	public Veiculo(String cor, String modelo, int ano, double velocidadeAtual, double velocidadeMaxima) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.ano = ano;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	// getters e setters
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	// metodos para ligar
	public void liga() {
		System.out.println("O carro esta ligado");
	}

	// metodo par acelerar
	public void acelera(double quantidade) {
		double velocidadeNova = this.velocidadeAtual + quantidade;
		this.velocidadeAtual = velocidadeNova;
	}

	int pegaMarchaAtual() {
		if (this.velocidadeAtual < 0) {
			return -1;
		}
		if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
			return 1;
		}
		if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
			return 2;
		}
		return 3;
	}

	@Override
	public String toString() {

		return "\nO modelo: " + this.modelo + "\nA cor: " + this.cor + "\nVelocidade: " + this.velocidadeMaxima;
	}
}
