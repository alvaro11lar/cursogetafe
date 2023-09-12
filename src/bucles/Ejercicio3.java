package bucles;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[]argss) {
		Scanner scan = new Scanner(System.in);
		int numeros = scan.nextInt();
		int sumador = 1;
		int a =0;
		int b =1;
		
		
		for(int num=0; num<=numeros;num++) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
		}
	}

}
