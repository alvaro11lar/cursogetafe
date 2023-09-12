package bucles;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		System.out.println("Ingresar el numero:");
		Scanner scan = new Scanner(System.in);
		int numero=scan.nextInt();

		for(int num=1 ;numero!=1; ) {
			if(numero%2==0) {
				numero = numero / 2;
			}else {
				numero = (numero * 3) + 1;
				
			}
			System.out.println(numero);
		}

	}


}
