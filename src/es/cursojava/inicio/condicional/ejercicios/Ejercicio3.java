package es.cursojava.inicio.condicional.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Pedir 10 numeros
		int contador3 = 0;
		int contador5 = 0;

		for (int i = 0; i < 10; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Introduce un numero");
			int numero = scan.nextInt();
			if (numero % 3 == 0) {
				contador3++;

			}


			if (numero % 5 == 0) {
				contador5++;
			}
			System.out.println("Multiplo de 3: " + contador3);
			System.out.println("Multiplo de 5: " + contador5);

		}
	}
}