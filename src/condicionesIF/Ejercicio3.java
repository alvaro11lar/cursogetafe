package condicionesIF;

import java.util.Scanner;

public class Ejercicio3 {

	/*Declarar e iniicializar una variable de tipo String
	 * con el valor del nombre de un mes.
	 * 
	 * Dependienddo del nombre del mes indicar la estacion del año.
	 * Si el nombre del mes es incorrecto indicarlo.
	 * 
	 * Si el mes es agosto indicar ademas que esta en vacaciones de verano
	 * y si es diciembre en vacaciones de navidad
	 */
	public static void main(String[] arrgs) {
		//cojo texto de la consola
		// ctrl + shift + o
		
		System.out.println("Introduce un mes");
		Scanner scan = new Scanner (System.in);
		
		String mes = scan.nextLine();
		String estacion = "";

		if(mes.equals("Enero") || mes=="Febrero" || mes=="Marzo") {
			estacion="Estas en invierno";
		}else if(mes=="Mayo" || mes=="Abril" || mes=="Junio") {
			estacion="Estas en primavera";
		}else if (mes=="Julio" || mes=="Agosto" || mes=="Septiembre") {
			estacion="Estas en verano";
			if(mes=="Agosto") {
				estacion+= "\tSon vacaciones de verano";
				//System.out.println("Son vacaciones de verano");
			}
		}else if(mes=="Octubre" || mes=="Noviembre" || mes=="Diciembre") {
			estacion="otoño";
			if(mes=="Diciembre") {
				estacion+= "\tSon vacaciones de navidad";
				//System.out.println("Estas en vavciones de navidad");
			}
		}else {
			System.out.println("Te has equivocado y has puesto: " + mes);
		}

		if(estacion!="") {
			System.out.println("Estas en " + estacion);
		}

		System.out.println("Fin");
	}

}
