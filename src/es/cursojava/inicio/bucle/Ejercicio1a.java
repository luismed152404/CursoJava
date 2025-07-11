package es.cursojava.inicio.bucle;

import java.util.Scanner;

public class Ejercicio1a {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 2, j = 99; i <= 100; i += 2, j -=2 ) {
			System.out.println(i + "," + j);
		}
		//for (int i = 0; i <= 100; i += 2) {
		//	System.out.println(i + "," + (99 - i));
		//}
		/*
		 * int i=0; while(i<10){ for (int j=0 ; j<=10 ; i++ ) {
		 * System.out.println("Introduce un numero"); Scanner scan = new
		 * Scanner(System.in); int numero = scan.nextInt(); i++;}
		 */

	}
}
