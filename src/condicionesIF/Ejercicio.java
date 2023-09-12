package condicionesIF;

/*Declarar e iniicializar una variable de tipo String
 * con el valor del nombre de un mes.
 * 
 * Dependienddo del nombre del mes indicar la estacion del año.
 * Si el nombre del mes es incorrecto indicarlo.
 */

public class Ejercicio {
	public static void main (String[] args) {
		String mes = "Enero";
		String estacion = "";
		
		if(mes=="Enero" || mes=="Febrero" || mes=="Marzo") {
			estacion="Estas en invierno";
		}else if(mes=="Mayo" || mes=="Abril" || mes=="Junio") {
			estacion="Estas en primavera";
		}else if (mes=="Julio" || mes=="Agosto" || mes=="Septiembre") {
			estacion="Estas en verano";
		}else if(mes=="Octubre" || mes=="Noviembre" || mes=="Diciembre") {
			estacion="Estas en otoño";
		}else {
			System.out.println("Te has equivocado y has puesto: " + mes);
		}
		
		if(estacion!="") {
			System.out.println("Estas en " + estacion);
		}
	
		System.out.println("Fin");
		
	}

}
