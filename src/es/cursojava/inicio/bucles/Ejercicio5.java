package es.cursojava.inicio.bucles;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		// Solicitar por consola el numero de alumnos de un aula.

		System.out.println("Introduce el numero de alumno");
		Scanner scan = new Scanner(System.in);

		int numero = scan.nextInt();
		int sumaNota = 0;
		int media = 0;

		for (int i = 0; i < numero; i++) {
			System.out.println("Introduce las nota del alumno");
			sumaNota = sumaNota + scan.nextInt();

		}
		media = sumaNota / numero;
		System.out.println("La media de las notas es :" + media);
		
	
	}
}
