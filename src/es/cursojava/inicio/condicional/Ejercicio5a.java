package es.cursojava.inicio.condicional;

import java.util.Scanner;

public class Ejercicio5a {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean salir = false;

		System.out.println("CALCULADORA DE PRECIO DE LLAMADAS");
		System.out.println("--------------------------------");

		while (!salir) {
			mostrarMenuZonas();
			int opcion = obtenerOpcionUsuario(scanner);

			switch (opcion) {
			case 1:
			case 2:
			case 3:
				procesarLlamada(scanner, opcion);
				break;
			case 4:
				salir = true;
				System.out.println("\n¡Gracias por usar el sistema!");
				break;
			default:
				System.out.println("\n❌ Opción inválida. Intente nuevamente.");
			}
		}
		scanner.close();
	}

	private static void mostrarMenuZonas() {
		System.out.println("\nZonas de llamada disponibles:");
		System.out.println("1. Zona 1  ($0.15/min - mínimo 3 min)");
		System.out.println("2. Zona 2  ($0.25/min - mínimo 2 min)");
		System.out.println("3. Zona 3  ($0.35/min - sin mínimo)");
		System.out.println("4. Salir");
		System.out.print("Seleccione una opción: ");
	}

	private static int obtenerOpcionUsuario(Scanner scanner) {
		while (!scanner.hasNextInt()) {
			System.out.print("❌ Entrada inválida. Ingrese un número: ");
			scanner.next();
		}
		return scanner.nextInt();
	}

	private static void procesarLlamada(Scanner scanner, int zona) {
		System.out.print("\nIngrese la duración de la llamada (minutos): ");
		int minutos = obtenerMinutosValidos(scanner);

		double precio = calcularPrecio(zona, minutos);
		System.out.printf("\n=== RESUMEN DE LLAMADA ===\n");
		System.out.printf("Zona: %d\nDuración: %d minutos\n", zona, minutos);
		System.out.printf("Precio total: $%.2f\n", precio);
	}

	private static int obtenerMinutosValidos(Scanner scanner) {
		int minutos;
		while (true) {
			minutos = obtenerOpcionUsuario(scanner);
			if (minutos >= 0)
				break;
			System.out.print("❌ La duración no puede ser negativa. Intente nuevamente: ");
		}
		return minutos;
	}

	private static double calcularPrecio(int zona, int minutos) {
		final double TARIFA_ZONA1 = 0.15;
		final double TARIFA_ZONA2 = 0.25;
		final double TARIFA_ZONA3 = 0.35;
		final int MINIMO_ZONA1 = 3;
		final int MINIMO_ZONA2 = 2;

		if (minutos == 0)
			return 0.0;

		switch (zona) {
		case 1:
			return minutos < MINIMO_ZONA1 ? MINIMO_ZONA1 * TARIFA_ZONA1 : minutos * TARIFA_ZONA1;
		case 2:
			return minutos < MINIMO_ZONA2 ? MINIMO_ZONA2 * TARIFA_ZONA2 : minutos * TARIFA_ZONA2;
		case 3:
			return minutos * TARIFA_ZONA3;
		default:
			return 0.0;
		}

	}
}
