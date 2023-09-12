package condicionesIF;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[]args) {

		//StringBuilder dd = new StringBuilder();
		System.out.println("Introduce tu nombre: ");
		Scanner scanNombre = new Scanner(System.in);
		String nombre = scanNombre.nextLine();

		System.out.println("Introduce tu edad: ");
		Scanner scanEdad = new Scanner(System.in);
		int edad = scanEdad.nextInt();

		String tipoPersona="";

		if(edad<100) {
			if(edad>=0 && edad<=5) {
				tipoPersona="es un bebe";
			}else if(edad>=6 && edad<=15)  {
				tipoPersona="es un niño";
			}else if(edad>=16 && edad<=20) {
				tipoPersona="es un adolescente";
			}else if(edad>=21 && edad<=40) {
				tipoPersona="es un adulto";
			}else if(edad>=41 && edad<=60) {
				tipoPersona="es un adulto mayor";
			}else if(edad>=61 && edad<=80) {
				tipoPersona="es un anciano";
			}else if(edad>=81 && edad<=100) {
				tipoPersona="es un muy anciano";
			}
			System.out.println(nombre + " " + tipoPersona);
		}else{
			System.out.println("Y es muy anciano quizas le queda poco tiempo de vida");
		}

		

	}

}
