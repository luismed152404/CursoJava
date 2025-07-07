package es.cursojava.inicio.condicional.ejercicios;

public class NotasAlumnos {

	public static void main(String [ ] args) {
		//declarando
		String asignatura = "Matematicas";
		String nombreAlumno = "Luis";
		int notaAlumno = 10;
		// inicializando
		//String asignatura = "Matematicas";
		//String nombreAlumno = "Luis";
		//int notaAlumno = 10;
		
		if(notaAlumno<5) {
			System.out.println("El alumno " +nombreAlumno + "en" + asignatura + "tiene un suspeso");
		}else if (notaAlumno<7){
			System.out.println ("El alumno " +nombreAlumno + "en" + asignatura + "tiene una nota aprobatoria");
		} else if (notaAlumno<9){
			System.out.println ("El alumno " +nombreAlumno + "en" + asignatura + "tiene una nota notable"); 
		} else if (notaAlumno<=10) { 
			System.out.println("El alumno " +nombreAlumno + "en" + asignatura + "tiene una nota sobresaliente");
			
		}
		
		
		
	}
}
