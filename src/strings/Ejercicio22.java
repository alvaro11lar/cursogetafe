package strings;

import java.util.Random;

public class Ejercicio22 {
	public static void main(String[] args) {
		
		/*int numeroAleatorio =(int)(Math.random()*10+1);
		int numeroAleatorioSegunda= (int)(Math.random()*10+1);*/
		Random r = new Random();
		int primeraParte = r.nextInt(5,10);
		int segundaParte = r.nextInt(8,15); 
		int terceraParte = r.nextInt(1,10); 
		
		String emailPrimera="";
		String emailSegunda="";
		String emailTercera="";

		for(;emailPrimera.length()<primeraParte;) {
			int charAleatorio = r.nextInt(32,123); 
			if(charAleatorio==32 || charAleatorio==46 || (charAleatorio>=48 && charAleatorio<=57) || (charAleatorio>=97 && charAleatorio<=122)) {
				System.out.println(charAleatorio);
				char letraAleatoriaPrimera=(char)(charAleatorio);
				emailPrimera+=letraAleatoriaPrimera;}
			}
		
		for(;emailSegunda.length()<segundaParte;) {
			int charAleatorio = r.nextInt(32,123); 
			if(charAleatorio==32 || charAleatorio==64 || charAleatorio==46 || (charAleatorio>=48 && charAleatorio<=57) || (charAleatorio>=97 && charAleatorio<=122)) {
				///System.out.println(charAleatorio);
				char letraAleatoriaPrimera=(char)(charAleatorio);
				emailSegunda+=letraAleatoriaPrimera;}
			}

		for(;emailTercera.length()<terceraParte;) {
			int charAleatorio = r.nextInt(32,123); 
			if(charAleatorio==32 || charAleatorio==64 || charAleatorio==46 || (charAleatorio>=48 && charAleatorio<=57) || (charAleatorio>=97 && charAleatorio<=122)) {
				///System.out.println(charAleatorio);
				char letraAleatoriaPrimera=(char)(charAleatorio);
			emailTercera+=letraAleatoriaPrimera;}
			}
		
		/*for(int i=0;i<numeroAleatorioSegunda;i++) {	
			char letraAleatoriaSegunda=(char)((int)(Math.random()*26+97));
			emailSegunda+=letraAleatoriaSegunda;
		}*/
		
		System.out.println("La palabra es: "  + emailPrimera);
		System.out.println("La palabra es: "  + emailSegunda);
		
		System.out.println("El email es el siguiente: " + emailPrimera + "@" + emailSegunda + "." + emailTercera);
		
		//System.out.println((char)(46));
		

	
		
	}

}
