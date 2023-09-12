package bucles;

import java.util.Scanner;

public class Ejercicio5 {
	
	// Pdir 10 numeros --> Indicar cuantos son multiplos de 3 y cuantos multiplos de 5

	public static void main(String[] args) {

		System.out.println("Ingrese 10 numeros:");
		int numero = 0;
		int contador3 = 0;
		int contador5 = 0;
		//contador = contador +1;

		for(int num=1; num<=10;num++) {
			Scanner scan = new Scanner(System.in);
			numero = scan.nextInt();
			
			if(numero%3==0) {
				contador3++;
			}
			if(numero%5==0) {
				contador5++;
			}
		}
		System.out.println("Hay " + contador3 + "numeros que son multiplos de 3");
		System.out.println("Hay " + contador5 + "numeros que son multiplos de 5");
	}

}
