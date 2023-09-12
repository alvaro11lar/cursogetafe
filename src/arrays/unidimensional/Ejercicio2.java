package arrays.unidimensional;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		System.out.println("Cuantas notas quiere almacenar");
		Scanner scan = new Scanner(System.in);
		int numeroNotas=scan.nextInt();
		String[] nombres=new String[numeroNotas];
		int[] notas=new int[numeroNotas];
		
		for(int i=0; i<numeroNotas;i++) {
			System.out.println("Introduce el numero " + (i+1));
			Scanner sc = new Scanner(System.in);
			notas[i]=sc.nextInt();
			
			System.out.println("Introduce el nombre " + (i+1));
			Scanner snom = new Scanner(System.in);
			nombres[i]=snom.nextLine();
		}
		
		double notaPromedio=0;
		for(int nota:notas) {
			notaPromedio = notaPromedio + nota;
		}
		
		
		
		System.out.println("La nota promedio es: " + (notaPromedio/numeroNotas));
		
		int notaAlta=0;
		for(int i=0; i<numeroNotas;i++) {
			if(notas[i]>notaAlta) {
				notaAlta=notas[i];
			}
		}
		System.out.println("La nota mayor es: " + notaAlta);
		
		int notaBaja=notas[0];
		for(int i=0; i<(numeroNotas);i++) {
			if(notas[i]<notaBaja) {
				notaBaja=notas[i];
			}
		}
		System.out.println("La nota minima es: " + notaBaja);
		
		int [] notasOrdenadas=new int[numeroNotas];
		String [] nombresOrdenados=new String[numeroNotas];
		//notasOrdenadas[0]=notaAlta;
		for(int i=0; i<numeroNotas;i++) {
			int notaMedia=0;
			String nombreMedia="";
			for(int j=i;j<numeroNotas;j++) {
				if(notas[i]<notas[j]){
					notaMedia=notas[i];
					notas[i]=notas[j];
					notas[j]=notaMedia;
					
					nombreMedia=nombres[i];
					nombres[i]=nombres[j];
					nombres[j]=nombreMedia;
				}
			}
			notasOrdenadas[i]=notas[i];
			nombresOrdenados[i]=nombres[i];
			
		}
		
		for(int nota:notasOrdenadas) {
			System.out.println(nota);
		}
		
		for(String nombre:nombresOrdenados) {
			System.out.println(nombre);
		}
	}

}
