package doWhile;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		int entrada=0;
		String estacion="";
		
		do{
			System.out.println("1. opcion 1 \n2. Opcion 2 \n3. Opcion 3 \n4. Opcion 4 \n5. Salir");
			System.out.println("Escoja una opcion");
			Scanner scan = new Scanner(System.in);
			entrada = scan.nextInt();
			String opcion= "";
			estacion="";
			
			switch(entrada) {
				case(1):
					System.out.println("Escoja una estacion");
					Scanner scanEstacion = new Scanner(System.in);
					estacion = scanEstacion.nextLine();
					switch(estacion) {
						case("Verano"):System.out.println("Julio , Agosto , Septiembre ");break;
						case("Invierno"):System.out.println("Enero, Febrero , Marzo ");break;
						case("Otoño"):System.out.println("Octubre, Noviembre , Diciembre");break;
						case("primavera"):System.out.println("Abril , Mayo , Junio");break;
						default:System.out.println("El mes ingresado es incorrectoo");
					};
					break;
				case(2):opcion="Ha ingresado la opcion 2";break;
				case(3):opcion="Ha ingresado la opcion 3";break;
				case(4):opcion="Ha ingresado la opcion 4";break;
				case(5):opcion="Ha sido un gusto tenerle en mi programa";break;
			}
			System.out.println(opcion);
			
			
		}while(entrada!=5);
			
	} 

}
