package funciones;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] rgs) {
		
		String []arrays=devolveDatos("Ingrese su edad:Ingrese su apellido",44);
		for(String dato:arrays) {
			System.out.println(dato);
		}
	}
	
	public static String[] devolveDatos(String textosScanner, int numeroDatos){
		String[] textoPartido=textosScanner.split(":");
		String[] datosTexto=new String[textoPartido.length];
		for(int i=0;i<textoPartido.length;i++) {
			datosTexto[i]=pideDatoTexto(textoPartido[i]);
		}
		return datosTexto;
	}
	/**
	 * Esta funcion devuelve un String.
	 * @param texto
	 * @return
	 */
	static String pideDatoTexto(String texto) {
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		String datoIngresado=scan.nextLine();
		return datoIngresado;
	}
	
	static int pideDatotexto(int numero) {
		System.out.println(numero);
		Scanner scan = new Scanner(System.in);
		int datoIngresado=scan.nextInt();
		return datoIngresado;
	}

}
