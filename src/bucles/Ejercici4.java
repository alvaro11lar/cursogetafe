package bucles;

import java.util.Scanner;

public class Ejercici4 {
	
	//Ejercicio donde se pide por consola el numero de coches para luego pedir cada vaelocidad
	//de cada de los coches para luego compararlos y dar como resultado la menor velocidad.
	public static void main(String[] args) {

		System.out.println("Ingrese el numero de coches que hay:  ");
		Scanner scan = new Scanner(System.in);
		int numCoches = scan.nextInt();

		double velocidadMinima=1000;
		double velocidad=0;

		for(int num=0 ;num<numCoches;num++ ) {
			System.out.println("Ingrese la velocidad del coche " + num);
			Scanner scan1 = new Scanner(System.in);
			velocidad = scan1.nextDouble();

			if(velocidad<velocidadMinima) {
				velocidadMinima = velocidad;
			}
		}
		//15,
		System.out.println("La velocidad minima es : " + velocidadMinima);
	}

}
