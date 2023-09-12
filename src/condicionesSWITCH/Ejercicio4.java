package condicionesSWITCH;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args)	{
		System.out.println("1. opcion 1 \n2. Opcion 2 \n3. Opcion 3 \n4. Opcion 4 \n5. Opcion 5");
		System.out.println("Escoja una opcion");
		Scanner scan = new Scanner(System.in);
		String entrada = scan.nextLine();
		String opcion= "";

		switch(entrada) {
		case("1"):opcion="Ha ingresado la opcion 1";break;
		case("2"):opcion="Ha ingresado la opcion 2";break;
		case("3"):opcion="Ha ingresado la opcion 3";break;
		case("4"):opcion="Ha ingresado la opcion 4";break;
		case("5"):opcion="Ha seleccionado la opcion 5";break;
		default:System.out.println("Has escogido una opcion incorrecta");
		}
		if(opcion!="") {
			System.out.println("+" + opcion);
		}
	}


}
