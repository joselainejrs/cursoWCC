package maventest;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void deveRetornarOResultado() {
		
		
		
		Calculadora calculadora = new Calculadora(6,2);
		
		int valorEsperado = 12;		
		int resultadoDaSoma = calculadora.multiplicacao();
		Assert.assertEquals(valorEsperado,resultadoDaSoma);
		
		
	}

	
	
	
}	

