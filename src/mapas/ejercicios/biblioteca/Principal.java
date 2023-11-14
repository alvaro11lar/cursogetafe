package mapas.ejercicios.biblioteca;

import utils.Utilidades;

public class Principal {

	public static void main(String[] args){
		
		Principal principal=new Principal();
		principal.empezarCaja();

	}
	
	
	void empezarCaja() {
		String menu="1.Agregar nuevo libro \n2.Prestar libros \n3.Devolver libro \n4.Salir";
		int opcion=0;
		Biblioteca biblioteca=new Biblioteca("Nacional");
		do {
			biblioteca.mostrarLibros();
			System.out.println(menu);
			opcion=Utilidades.pideDatoNumerico("Ingrese una opcion: ");
			
			switch (opcion) {
			 case 1: 
				 biblioteca.añadirLibro();break;
			 case 2: 
				 biblioteca.prestarLibro();break;
			 case 3:
				 biblioteca.devolverLibro();break;
			 case 4: 
				 System.out.println("Gracias ha finalizado la sesion");
			}
				
		}while(opcion!=4);
		
	}
	

}
