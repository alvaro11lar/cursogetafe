package bucles;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		System.out.println("Ingrese el numero de alumnos en un aula ");
		Scanner scan = new Scanner(System.in);
		int numAlumnos = scan.nextInt();
		double notaTotal=0;
		double nota=0;
		
		for(int num=1 ;num<=numAlumnos;num++ ) {
			System.out.println("Ingrese la nota de un alumno: " + num);
			Scanner scan1 = new Scanner(System.in);
			nota = scan1.nextDouble();
			notaTotal += nota;
		}
		
		System.out.println("El promedio de los " + numAlumnos + "alumnos es: " + (notaTotal / numAlumnos));
	}

}
