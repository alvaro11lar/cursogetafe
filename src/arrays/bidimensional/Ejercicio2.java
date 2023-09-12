package arrays.bidimensional;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[]args) {
		
		
		System.out.println("Ingrese el numero de filas: ");
		Scanner scan = new Scanner(System.in);
		int filaColumna=scan.nextInt();
		
		int[][] animales = new int[filaColumna][filaColumna];
		
		for(int i=0;i<animales.length;i++) {
			System.out.println("Estas en la fila " + (i+1));
			for(int j=0;j<animales[i].length;j++) {
				System.out.println("Ingrese el valor de la columna " + (j+1));
				Scanner sc = new Scanner(System.in);
				int nombre= sc.nextInt();
				animales[i][j]=nombre;
			}
		}
		
		for(int []fila:animales) {
			for(int columna:fila) {
				System.out.print(columna + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------------");
		
		int[] diagonal = new int[filaColumna];
		int contador=0;
		
		for(int i=0;i<animales.length;i++) {
			for(int j=i;j<animales[i].length;j++) {
				if(i==j) {
					diagonal[contador]=animales[i][j];
					contador++;
				}
			}
		}
		
		for(int filas:diagonal) {
			System.out.println(filas  +"");
		}
		
		int size=animales.length-1;
		for(int i=0 ,j=size;i<animales.length/2;i++, j--) { 
			int temp= animales[i][j];
			animales[i][j]=animales[j][i];
			animales[j][i]=temp;
			
		}
		
		for(int []fila:animales) {
			for(int columna:fila) {
				System.out.print(columna + " ");
			}
			System.out.println();
		}
		
	}

}
