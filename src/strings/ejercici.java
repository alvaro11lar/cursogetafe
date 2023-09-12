package strings;

import java.util.Scanner;

public class ejercici {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String mensajeError = "";
		String despuesArroba="";

		do {
			
			System.out.println("Ingrese su email para poder validarlo");
			String email = sc .nextLine().trim();


			if(email.indexOf("@")!=email.lastIndexOf("@") || email.indexOf("@")==-1) {
				mensajeError="Debe de tener una @";
			}else {
				despuesArroba=email.substring(email.indexOf("@")+1);
				if(despuesArroba.contains(".")) {
					if(email.substring((email.indexOf("@")+1),email.lastIndexOf(".")).length()<2) {
						mensajeError+="Debe de contener al menos dos caracteres entre el @ y el punto";
					}else {
						if(email.substring(email.lastIndexOf(".")+1).length()>=2 && email.substring(email.lastIndexOf(".")+1).length()<=6) {		
						}else {
							mensajeError="El espacio despues del ultimo debe de ser entre 2 y 6";
						}
					}
				}else {
					mensajeError+="Debe de contener al menos un punto despues del @s ";
				}

			}

			if(email.contains(" ")) {
				mensajeError+="No puede tener un espacion en blanco ";
			}

			if(mensajeError.isEmpty()) {
				System.out.println("El email "+email+" es correcto");
			}else{
				System.out.println("El email "+email+" es incorrecto");
				System.out.println("Tiene los siguientes errores: " + mensajeError);
			}
		}while(!mensajeError.isEmpty());

	}
}
