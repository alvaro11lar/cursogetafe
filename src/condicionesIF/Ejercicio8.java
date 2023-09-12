package condicionesIF;

import java.util.Scanner;

public class Ejercicio8 {

	/*
	 * Herramineta para calcular el precio de una llamada. Cuando se realiza una
	 * llamada, el cobro es por el tiempo que esta dura de tal forma que: Los
	 * primeros cinco minutos cuestan 1 euro. Los siguientes 3 minutos cuestan 80
	 * centimos. Los siguientes 2 minutos a 70 centimos. Y a partir del decimo
	 * minuto, 50 centimos cada minuto. Se carga un impuesto del 3% cuando es
	 * domingo, y si es oto dia, y si es otro dia, en turno de mañana 15%, y ne
	 * turno tarde 10%.
	 * 
	 * Solicitar tiempo de llamada, dia de la semana y hora, y calcular el coste de
	 * la llamadda.
	 */

	public static void main(String[] args) {

		String dia="";
		int hora=0;
		int duracionLlamada=0;
		float costoLlamada=0f;


		System.out.println("Bienvenido al programa de calcular su coste de llamamda");
		System.out.println("Porfavor ingrese el dia de la semana:");
		Scanner scanDia = new Scanner(System.in);
		dia = scanDia.nextLine();
		if(dia.equalsIgnoreCase("Lunes") || dia.equalsIgnoreCase("Martes") || dia.equalsIgnoreCase("Miercoles") || dia.equalsIgnoreCase("Jueves")
				|| dia.equalsIgnoreCase("Viernes") || dia.equalsIgnoreCase("Sabado") || dia.equalsIgnoreCase("Domingo")) {

			System.out.println("Porfavor ingrese la hora:");
			Scanner scanHora = new Scanner(System.in);
			hora = scanHora.nextInt();

			System.out.println("Porfavor ingrese la duracion de la llamada:");
			Scanner scanDuracion = new Scanner(System.in);
			duracionLlamada = scanDuracion.nextInt();
			costoLlamada = 0;
		}else {
			System.out.println("El dia ingresado es incorrecto");
		}

		if(duracionLlamada>=0) {
			if (duracionLlamada <= 5) {
				costoLlamada = 1;
			} else if (duracionLlamada <= 8) {
				costoLlamada = 1.80f;
			} else if (duracionLlamada <= 10) {
				costoLlamada = 2.50f;
			} else {
				duracionLlamada = duracionLlamada - 10;
				costoLlamada = (duracionLlamada * 0.50f) + 2.50f;
			}
		}else {
			System.out.println("La duracion de llamada ingresada es incorrecta!!");
		}


		if(duracionLlamada>=0) {
			if(dia.equalsIgnoreCase("Lunes") || dia.equalsIgnoreCase("Martes") || dia.equalsIgnoreCase("Miercoles") || dia.equalsIgnoreCase("Jueves")
					|| dia.equalsIgnoreCase("Viernes") || dia.equalsIgnoreCase("Sabado") || dia.equalsIgnoreCase("Domingo") ) {
				if (dia.equalsIgnoreCase("Domingo")) {
					costoLlamada = (0.3f * costoLlamada) + costoLlamada;
				} else if (dia.equalsIgnoreCase("Lunes") || dia.equalsIgnoreCase("Martes") || dia.equalsIgnoreCase("Miercoles") || dia.equalsIgnoreCase("Jueves")
						|| dia.equalsIgnoreCase("Viernes") || dia.equalsIgnoreCase("Sabado")) {
					if (hora < 12) {
						costoLlamada = (0.15f * costoLlamada) + costoLlamada;
					}else {
						costoLlamada = (0.10f * costoLlamada) + costoLlamada;
					}
				}
				System.out.println("El costo de su llamada es de: " + costoLlamada);
			}else {
				//System.out.println("El dia ingresado es incorrecto");
			}
		}


	}

}
