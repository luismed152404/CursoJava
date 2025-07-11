package es.cursojava.inicio.problemacodigo;

import java.util.List;

public class Ejercicio1 {

	// public static void main(String[] args) {

	public static double calcularPromedio(List<Double> numeros) {
		if (numeros == null || numeros.isEmpty()) {
			return 0.0; // Manejo de lista vacía o nula
		}

		double suma = 0.0;
		for (double numero : numeros) {
			suma += numero;
		}
		return suma / numeros.size();
	}

}
