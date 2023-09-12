package continueBreak;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args){
		int importe = 1000;
		int dineroApostar=0;
		while(importe>0) {
			System.out.println("Ingrese el dinero que quieres apostar: ");
			Scanner scan = new Scanner(System.in);
			dineroApostar = scan.nextInt();
			if(dineroApostar>1000) {
				System.out.println("El dinero es mayor al de la cuenta");
			}else {
				System.out.println("Ingrese el numero al que quiere apostar: ");
				Scanner scan1 = new Scanner(System.in);
				int numeroApostar = scan1.nextInt();
				if(numeroApostar>=1 && numeroApostar<=6) {
					int numeroDado = (int)(Math.random()*6+1);
					if(numeroApostar==numeroDado) {
						importe=(dineroApostar *3)+ importe;
					}else {
						importe=( importe - dineroApostar);
					}
				}else {
					System.out.println("El numero ingresado es incorrecto");

				}
			}
			System.out.println("El importe actual es de: " + importe);
			if(importe>0) {
				System.out.println("Deseas seguir jugando:");
				System.out.println("Presiona 1 para seguir o 2 para salir del jueego");
				Scanner scan2 = new Scanner(System.in); 
				int opcion = scan2.nextInt();
				if(opcion==1) {
					continue;
				}else if(opcion==2) {
					break;
				}else {
					System.out.println("Ha ingresado una opcion incorrecta");
				}
			}else {
				break;
			}

		}

	}

}
