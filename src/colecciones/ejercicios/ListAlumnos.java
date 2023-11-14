package colecciones.ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import utils.Utilidades;

public class ListAlumnos {
	public static void main(String[] args) {

		Alumno alumno1 = new Alumno("111","Alvaro","Huamani");
		Alumno alumno2 = new Alumno("111","Jose","Lopez");
		Alumno alumno3 = new Alumno("333","Daniel","Lara");
		Alumno alumno4 = new Alumno("444","Aldo","Succar");

		List<Alumno> alumnos=new ArrayList<Alumno>();
		
		if(alumnos.isEmpty()) {
			alumnos.add(alumno1);
			alumnos.add(alumno2);
			alumnos.add(alumno3);
			alumnos.add(alumno4);
		}
		
		recorrer(alumnos);
		
		String dni=Utilidades.pideDatoTexto("INGRESE EL NUMEOR DE DNI: ");
		
		boolean encontrado=false;
		Alumno alumnoBorrado=null;
		Iterator<Alumno> recorrer = alumnos.iterator();
		while(recorrer.hasNext()) {
			Alumno alumno=recorrer.next();
			if(alumno.getDni().equals(dni)) {
				System.out.println("El alumno con este dni su nombre es: " + alumno.getNombre());
				recorrer.remove();
			}
		}
			
		
		
		if(!encontrado) {
			System.out.println("No existe este alumno con dni: " + dni);
		}
		
		recorrer(alumnos);
		
		String dni2=Utilidades.pideDatoTexto("INGRESE EL NUMEOR DE DNI: ");
		
		boolean encontrado1=false;
		for (Alumno alumno : alumnos) {
			if(alumno.getDni().equals(dni2)) {
				System.out.println("El alumno que contiene este dni se llama: " + alumno.getNombre());
				String nombre = Utilidades.pideDatoTexto("INGRESE EL NOMBRE POR LO QUE SE CAMBIARA: ");
				alumno.setNombre(nombre);
				encontrado1=true;
				break;
			}
		}
		
		recorrer(alumnos);
		
	}
	
	public static void recorrer(List<Alumno> alumnos) {
		
		for (Alumno alumno : alumnos) {
			System.out.println("Nombre: " + alumno.getNombre() + " Apellido: " + alumno.getApellidos() + " DNI: " + alumno.getDni());
		}
	}
	



}
