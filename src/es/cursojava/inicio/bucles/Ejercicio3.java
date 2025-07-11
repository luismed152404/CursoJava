package es.cursojava.inicio.bucles;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Pedir 10 numeros --> Indicar cuantos son multiplos de 3 y cuantos multiplos
		// de 5
			int contador3 = 0;
			int contador5 = 0;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Introdusce un número");
			int numero = scan.nextInt();
			
			if(numero%3==0) {
				contador3 ++;
			} if (numero%5==0) {
				contador5 ++; 
			}
		}

	}


