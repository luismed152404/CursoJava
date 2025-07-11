package es.cursojava.inicio.bucle;

import java.util.Scanner;

public class Ejercicio7 {
	/*
	 * 7. Solicitar por consola el numero de números de la serie de Fibonacci que se
	 * quieren mostrar Serie de Fibonacci: 0,1,1,2,3,5,8,13,21,34,55,....
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero = scan.nextInt();
//		int num1 = 0;
//		int num2 = 1;
//		System.out.print(num1+","+num2);
//		for (int i=2; i<numero; i++) {
//			int suma = num1 + num2;
//			System.out.print(","+suma);
//			num1 = num2;
//			num2 = suma;

//	}

		// int serie = 0;
		// int serie2 = 0;
		// int serie3 = 1;
		// int contador = 0;

		/*
		 * while (contador<numero) { System.out.println(serie); if (contador==0) {
		 * System.out.println(serie3); } serie = serie2 + serie3; serie2 = serie3;
		 * serie3 = serie;
		 * 
		 * contador++;
		 */

		int numPrevio = 0;
		int numActual = 1;
		int suma = 0;
		for (int i = 0; i < numero; i++) {
			System.out.println(numPrevio);
			suma = numPrevio + numActual;
			numPrevio = numActual;
			numActual = suma;
		}
	}
}
