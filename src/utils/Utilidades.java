package utils;

import java.util.Scanner;

public class Utilidades {

	public static String pideDatoTexto(String texto) {
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		String datoIngresado=scan.nextLine();
		return datoIngresado;
	}

	public static int pideDatoNumerico(String texto) {
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		int datoIngresado=scan.nextInt();
		return datoIngresado;	
	}
	
	public static void velocidadehiculo(double km, int minutos) {
		System.out.println(km/minutos);
	}
	
}
