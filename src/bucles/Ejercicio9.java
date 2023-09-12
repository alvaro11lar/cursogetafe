package bucles;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		System.out.println("Ingrese el tamaño de la base del triangulo: ");
		Scanner scan = new Scanner(System.in);
		int numLado = scan.nextInt();

		for(int i=1; i<=numLado-1;i++) {
			for(int j=1; j<=numLado-i;j++) {
				System.out.print(" ");
			}

			for(int k=1;k<=(i * 2) - 1;k++) {
				if(k == 1 || k == (i * 2) - 1){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for(int i=1;i<=numLado;i++) {
			System.out.print("* ");

		}


	}

}
