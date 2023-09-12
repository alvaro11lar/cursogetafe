package strings;

import java.util.Scanner;

public class Ejerccios1 {
	public static void main(String []args) {

		String cleanEmail;
		String betweenArrobaPunto="";
		String afterPunto="";
	 
		do{
			System.out.println("Ingrese su email para poder validarlo: ");
			Scanner scan=new Scanner(System.in);
			String email=scan.nextLine();
			cleanEmail=email.trim();
			boolean contieneTodo = cleanEmail.indexOf("@") == cleanEmail.lastIndexOf("@") && cleanEmail.indexOf("@")!=-1 && cleanEmail.lastIndexOf("@")< cleanEmail.lastIndexOf(".");

			if(contieneTodo) {
				afterPunto=cleanEmail.substring((cleanEmail.lastIndexOf("."))+1);
				if(cleanEmail.indexOf("@") < cleanEmail.indexOf(".")) {
					betweenArrobaPunto=cleanEmail.substring((cleanEmail.indexOf("@")+1),cleanEmail.indexOf("."));
					
					if(cleanEmail.contains(" ")) {
						System.out.println("Su email contiene espacios en blano");
					}

					if(betweenArrobaPunto.length()<=2 ) {
						System.out.println("El numero de caracteres entre el" + " @" + " y el" + " . debe de ser de al menos 2 y no mayor a 6");
					}
					
					if(afterPunto.length()<=2 ||  afterPunto.length()>=6) {
						System.out.println("El numero de caracteres despues del "  + " . debe de ser de al menos 2 y no mayor a 6");
					}
				}else {
					System.out.println("Primero debe de ir " + "@ y luego el " + ".");
				}


			}else{
				if(!cleanEmail.contains(".")) {
					System.out.println("Su email ingresado no contiene"  + ".");
				}
				if(cleanEmail.indexOf("@") != cleanEmail.lastIndexOf("@")) {
					System.out.println("El email contiene mas de un " + "@");
				}
				if(cleanEmail.indexOf("@")==-1) {
					System.out.println("El email no contiene un " + "@");
				}
			}


		}while(cleanEmail.indexOf("@") != cleanEmail.lastIndexOf("@") || !cleanEmail.contains(".") || cleanEmail.contains(" ") || betweenArrobaPunto.length()<=2 ||afterPunto.length()<=2 ||  afterPunto.length()>=6  );
	}

}
