package bucles;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		System.out.println("Ingrese el tamaño del lado del cuadrado: ");
		Scanner scan = new Scanner(System.in);
		int numLado = scan.nextInt();

		for(int i=1; i<=numLado;i++) {
			for(int j=1; j<=numLado;j++) {
				if(i==1 || i==numLado ) {
					System.out.print(" * ");
				}else {
					if(j==1 || j==numLado) {
						System.out.print(" * ");
					}else {
						System.out.print("   ");
					}

				}
			}
			System.out.println();
		}
	}

}
