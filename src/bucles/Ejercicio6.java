package bucles;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		System.out.println("Ingrese el numero de tenistas que se apuntaran:");
		Scanner scan = new Scanner(System.in);
		int numTenistas = scan.nextInt();
		int contador=0;
		
		for(int num=1; num<=numTenistas;num++) {
			System.out.println("Ingrese el puesto en que se encuentre en la ATP: ");
			Scanner scan1 = new Scanner(System.in);
			int puesto = scan.nextInt();
			
			for(int i=1;i<=10;i++) {
				if(puesto==i) {
					contador++;
				}
			}
			
			
		}
		System.out.println("Hay " + contador + "tenistas que estan en el top 110" );
	}

}
