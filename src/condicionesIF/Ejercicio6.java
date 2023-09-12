package condicionesIF;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		System.out.println("Introduce tu nombre: ");
		Scanner scanNombre = new Scanner(System.in);
		String nombre = scanNombre.nextLine();

		System.out.println("Introduce tu edad: ");
		Scanner scanEdad = new Scanner(System.in);
		int edad = scanEdad.nextInt();

		String tipoPersona="";

		if(edad>=0) {
			if(edad<=100) {
				if(edad<=5) {
					tipoPersona="es un bebe";
				}else if(edad<=15)  {
					tipoPersona="es un niño";
				}else if(edad<=20) {
					tipoPersona="es un adolescente";
				}else if(edad<=40) {
					tipoPersona="es un adulto";
				}else if(edad<=60) {
					tipoPersona="es un adulto mayor";
				}else if(edad<=80) {
					tipoPersona="es un anciano";
				}else if(edad<=100) {
					tipoPersona="es un muy anciano";
				}
				System.out.println(nombre + " " + tipoPersona);
			} else{
				System.out.println("Y es muy anciano quizas le queda poco tiempo de vida");
			}

		}else {
			System.out.println("La edad ingresada es incorrecta");
		}



	}

}
