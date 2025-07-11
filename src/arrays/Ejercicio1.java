package arrays;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Solicitar el número de alumnos que hay en una clase
		System.out.println("Introduce la cantidad de alumnos");
		Scanner scan = new Scanner(System.in);
		int numeroAlumno = scan.nextInt();
		// Por cada alumno pedir su nota y la guardas en una posición del array

		double[] notas = new double[numeroAlumno];
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Introduce la nota del alumno" + (i + 1));
			scan = new Scanner(System.in);
			notas[i] = scan.nextDouble();

		}
	}

}
