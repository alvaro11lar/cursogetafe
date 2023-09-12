package arrays.unidimensional;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[]args) {
		
		System.out.println("Cuantos colores quieres guardar");
		Scanner scan = new Scanner(System.in);
		int numeroColores=scan.nextInt();
		String[] colores=new String[numeroColores];
		
		for(int i=0; i<numeroColores;i++) {
			System.out.println("Introduce el color " + (i+1));
			Scanner sc = new Scanner(System.in);
			colores[i]=sc.nextLine();
		}
		
		for(int i=0; i<numeroColores;i++) {
			System.out.println(colores[i]);
		}
		
		//Bucle for-each
		
		for(String color : colores) {
			System.out.println(color);
		}
		
		for(int i=0; i<numeroColores;i++) {
			//String primeraLetra = colores[i].charAt(0);
			if(colores[i].contains("o") && colores[i].charAt(0)=='a'){
				System.out.println(colores[i]);
			}
		}
		
	}

}
