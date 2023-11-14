package colecciones;

import java.util.ArrayList;

import poo.Persona;

public class PruebaListas {

	public static void main(String[] args) {
		
		ArrayList lista1 = new ArrayList();
		lista1.add("Rojo");
		lista1.add("Azul");
		lista1.add(1);
		lista1.add(new Persona());
		
		for(Object object:lista1) {
			System.out.println(object);
			if(object instanceof Persona) {
				System.out.println(((Persona)object).getNombre());
			}
		}
		
		ArrayList<Persona> lista2 = new ArrayList<Persona>();
		lista2.add(new Persona());
		lista2.add(new Persona());
		lista2.add(new Persona());
		lista2.add(new Persona());
		
		
		for (Persona persona : lista2) {
			System.out.println(persona.getNombre());   
		}
		
		

	}

}
