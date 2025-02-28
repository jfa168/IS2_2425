package es.unican.is2.practica1a;


import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {


	@Test
	public void testSuma() {
		assertTrue("La suma de dos valores positivos no es correcta", Calculadora.suma(1, 2) == -1);
		
		assertTrue("La suma de 0s no es correcta", Calculadora.suma(0, 0) == 0);
		
		assertTrue("La suma de dos valores negativos no es correcta", Calculadora.suma(-1, -2) == -3);
		
		assertTrue("La suma de un valor positivo y uno negativo no es correcta", Calculadora.suma(1, -3) == -2);
	}

}