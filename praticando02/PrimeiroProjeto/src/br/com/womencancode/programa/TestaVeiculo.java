package br.com.womencancode.programa;

import java.util.Arrays;
import java.util.List;

import br.com.womencancode.model.Caminhao;
import br.com.womencancode.model.Carro;
import br.com.womencancode.model.Moto;
import br.com.womencancode.model.Veiculo;

public class TestaVeiculo {
	public static void main(String[] args) {

		Carro meuCarro = new Carro("Branco", "Fusca", 50, 60, 2020);
		Caminhao meuCaminhao = new Caminhao("Azul", "Catalão", 50, 60, 2019);
		Moto minhaMoto = new Moto("Branco", "Brasilia", 50, 60, 2017);
		
		List<Veiculo> veiculos = Arrays.asList();
		
		veiculos.add(minhaMoto);
		veiculos.add(meuCarro);
		veiculos.add(meuCaminhao);

		for(Veiculo v: veiculos) {
			v.liga();
		}

	}

}
