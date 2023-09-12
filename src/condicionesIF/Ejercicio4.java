package condicionesIF;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		System.out.println("Adivina la adivinanza siguiente");
		System.out.println("Es rojo por fuera y por dentro blanco es una fruta");
		System.out.println("Introduce tu respuesta de la adivinanza");
		
		Scanner scan = new Scanner(System.in);
		String respuestaBuscar= scan.nextLine();
		String correcta="manzana";
		
		if(respuestaBuscar.equalsIgnoreCase(correcta)) {
			System.out.println("Respuesta acertada");
		}else {
			System.out.println("Respuesta incorrecta");
		}
		
		
	}

}
