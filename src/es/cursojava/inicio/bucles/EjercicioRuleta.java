package es.cursojava.inicio.bucles;

import java.util.Scanner;

public class EjercicioRuleta {

	public static void main(String[] args) {

		double saldo = 500;
		boolean seguirJugando = true;
		// Pedimos el número por el que se va a apostar
		boolean numeroCorrecto = true;
		int numeroApostado = 0;

		do {
			System.out.println("¿Por qué numero quieres apostar? (0-36)");
			Scanner scan = new Scanner(System.in);
			numeroApostado = scan.nextInt();

			numeroCorrecto = numeroApostado <= 36 && numeroApostado > 0;

			if (!numeroCorrecto) {
				System.out.println("Número incorrecto");
			}

		} while (seguirJugando);
	}
}
