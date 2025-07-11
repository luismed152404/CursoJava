package es.cursojava.inicio.bucle;

import java.util.Scanner;

public class Ejercicio7a {

	public static void main(String[] args) {

		/*
		 * 7. Solicitar por consola el numero de números de la serie de Fibonacci que se
		 * quieren mostrar Serie de Fibonacci: 0,1,1,2,3,5,8,13,21,34,55,....
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = scan.nextInt();
		int num1 = 0;
		int num2 = 1;
		System.out.print(num1 + "," + num2);
		for (int i = 2; i < numero; i++) {
			int suma = num1 + num2;
			System.out.print("," + suma);
			num1 = num2;
			num2 = suma;

		}

	}

}
