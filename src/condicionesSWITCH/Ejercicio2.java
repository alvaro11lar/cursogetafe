package condicionesSWITCH;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String mes=scan.nextLine();
		String estacion="";
		
		switch(mes) {
			case"Enero":
			case"Febrero":
			case"Marzo":estacion="invierno";break;
			case"Abril":
			case"Mayo":
			case"Junio":estacion="primavera";break;
			case"Julio":
			case"Agosto":
			case"Septiembre":estacion="verano";break;
			case"Octubre":
			case"Noviembre":
			case"Dicimebre":estacion="otoño";break;
			default:System.out.println("Es incorrecto");
			
			
		}
		System.out.println("La estacion es: " + estacion);
	}

}
