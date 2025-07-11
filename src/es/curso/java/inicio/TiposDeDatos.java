	package es.curso.java.inicio;

	import java.util.Scanner;

	public class TiposDeDatos {
	public static void main (String [ ] args ) {   
		
		// tipos primitivos 
		// enteros 
		
		byte edad = 10;  
		
				
		String nombre = "luis";
		int numero = 23;
		System.out.println(Math.random());
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tus apellidos");
		String apellidos = scan.nextLine();
		
		
		System.out.println("introduce tu altura");
		double altura = scan.nextDouble();
		System.out.println(nombre +" "+apellidos +" " + altura );
		// tipos objetos 
	}
}
