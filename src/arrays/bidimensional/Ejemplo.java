package arrays.bidimensional;

import java.util.Scanner;

public class Ejemplo {
	public static void main(String[] args) {
		
		String[][] animales = new String[3][4];
		
		System.out.println(animales[2][1]);
		//animales[0][0]="gato";
		
		System.out.println(animales.length);  //numero de filas
		System.out.println(animales[0].length); //numero de columnas de la fila 0
		
		for(int i=0;i<animales.length;i++) {
			System.out.println("Estas en la fila " + (i+1));
			for(int j=0;j<animales[i].length;j++) {
				System.out.println("Ingrese el valor de la columna " + (j+1));
				Scanner sc = new Scanner(System.in);
				String nombre= sc.nextLine();
				animales[i][j]=nombre;
			}
		}
		
		for(String []fila:animales) {
			System.out.println();
			for(String columna:fila) {
				System.out.print(columna + " ");
			}
		}
		
	}
}
