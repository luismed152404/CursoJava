package es.cursojava.inicio.condicional.ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		System.out.println("Introduce un numero");

		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();

		if (numero % 2 == 0) {

			System.out.println("El numero " + numero + " es par");

		} else {

			System.out.println("El numero " + numero + " es imPAR");
		}

		// Otra forma.

		//boolean resultadoCero = numero % 2 == 0;

		//if (!resultadoCero) {

			//System.out.println("El numero " + numero + " es impar");

		//} else {

			//System.out.println("El numero " + numero + " es par");
		}
	}

