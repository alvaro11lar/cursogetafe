package funciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		String[] texto=new String[3];
		texto[0]="1. Dar de alta";
		texto[1]="2. Dar de baja";
		texto[2]="3. Salir";
		
		String texto2="1. Dar de baja \n2. Dar de baja \n3. Salir";
		
		pintarMenu(texto2);
		
		
	}


	public static int pintarMenu(String[] texto) {
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<texto.length;i++) {
			System.out.println(texto[i]);
		}
		
		return Integer.parseInt(devolver("Escoja una opcio"));
	}
	
	public static int pintarMenu(String texto) {
		System.out.println(texto);
		return Integer.parseInt(devolver("Escoja una opcio"));
	}

	public static String devolver(String texto) {
		System.out.println(texto);
		Scanner scan=new Scanner(System.in);
		return scan.nextLine();
	}
	
	
}
