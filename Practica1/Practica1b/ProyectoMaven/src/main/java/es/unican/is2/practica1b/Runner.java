package es.unican.is2.practica1b;

import es.unican.is2.practica1a.Calculadora; // Importamos la Calculadora de Practica1a

public class Runner {
	
	public static void main(String[] args) {
		
		int resultado = Calculadora.suma(5, 5); // Llamada a suma
        System.out.println("El resultado de la suma es: " + resultado);
		
	}

}
