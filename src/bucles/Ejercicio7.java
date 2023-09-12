package bucles;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main(String[] args){
		
		System.out.println("Ingrese el numero del que quiere visualizar la tabala de multiplicar:");
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		
		for(int num=0;num<=12;num++) {
			System.out.println(numero +" * " + num + " = " + (num * numero));
		}
	}

}
