package br.com.womencancode.model;

public class Carro extends Veiculo {

	private String modelo;
	private String cor;
	private int ano;
	private double velocidadeAtual;
	private double velocidadeMaxima;

	public Carro(String modelo, String cor, int ano, double velocidadeAtual, double velocidadeMaxima) {
		super(cor, modelo, ano, velocidadeMaxima, velocidadeMaxima);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
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

	public void liga() {
		System.out.println("O carro esta ligado");

	}

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
}
