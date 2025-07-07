package es.cursojava.inicio.condicional.ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		System.out.println("MENU");
		System.out.println("1. PINTAR CUADRO");
		System.out.println("2. VALIDAD EMAIL");
		System.out.println("3. AÑADIR ALUMNO");
		System.out.println("4. SALIR");
   Scanner scane = new Scanner (System.in); 
    int interativo = scane.nextInt();
    switch (interativo) {
    case 1: 
    		System.out.println("seleccionaste la opcion pinta cuadro");
    		break;
    case 2: 
		System.out.println("seleccionaste la opcion validar enail");
		break;
    case 3: 
		System.out.println("seleccionaste la opcion añadir alumno");
		break;
    case 4: 
		System.out.println("adios");
		break;
		
		default: System.out.println("se ha equivocado");
    }
    
    
    		
	}
}
