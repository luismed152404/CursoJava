package es.cursojava.inicio.bucles;

public class Ejercicio1 {

	public static void main(String[] args) {
//		Mostrar los numeros pares del 0 al 100
		for (int i=0 ; i<10000 ;i++) {
			
		if (i%2==0) {
			
				System.out.println(i);
			
			}
	}
		
		for (int i=0, j=99 ; i<10000 ; i+=2, j-=2)
		{System.out.println(i+"-"+j);		}
	}
}
