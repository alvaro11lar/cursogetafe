package mapas.ejercicios.biblioteca;

import java.util.HashMap;
import java.util.Map;

import utils.Utilidades;

public class Biblioteca {

	private String nombre;
	private Map<String,Libro>libros=new HashMap<String,Libro>();

	//	public Biblioteca(String nombre, HashMap<String, Libro> libros) {
	//		super();
	//		this.nombre = nombre;
	//		this.libros = libros;
	//	}

	public Biblioteca(String nombre) {
		super();
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Map<String, Libro> getLibros() {
		return libros;
	}

	public void setLibros(HashMap<String, Libro> libros) {
		this.libros = libros;
	}

	void añadirLibro() {
		String titulo= Utilidades.pideDatoTexto("Ingrese el nombre del titulo: ");
		String autor= Utilidades.pideDatoTexto("Ingrese el nombre del autor: ");
		int  numEjemplares= Utilidades.pideDatoNumerico("Ingrese el numeor de ejemplares del libro: ");
		Libro libro = new Libro(titulo,autor,numEjemplares); 
		libros.put(titulo, libro);
		System.out.println("libro añadido");
	}

	void prestarLibro() {
		String titulo=Utilidades.pideDatoTexto("Introduzca el nombre de titulo:");

		if(libros.containsKey(titulo)) {
			Libro libro=libros.get(titulo);
			if(libro.getNumCopiasDisponibles()>0){
				libro.setNumCopiasDisponibles(libro.getNumCopiasDisponibles()-1);
				System.out.println("Libro prestado");
			}
		}else {
			System.out.println("Noo hay nada en le biblioteca");
		}
		/*
		for (String libro : libros.keySet()) {
			System.out.println("============");
			if(libro.equals(titulo)) {
				System.out.println("Libro encontrado");
				if(libros.get(titulo).getNumCopiasDisponibles()>1) {
					System.out.println("numero de ejemplares mas de 1 ");
				Libro libroEncontrado=libros.get(titulo);
				libroEncontrado.setNumCopiasDisponibles(libroEncontrado.getNumCopiasDisponibles()-1);
				System.out.println("Ha sido prestado");
				}
			}else {
				System.out.println("El libro no puede ser prestado orque no hay ejemplares disponibles por el momento");
			}
		}*/
	}

	void devolverLibro() {
		String titulo=Utilidades.pideDatoTexto("Introduzca el nombre de titulo:");
		if(libros.containsKey(titulo)) {
			Libro libro=libros.get(titulo);
			if(libro.getNumCopiasDisponibles()>0){
				libro.setNumCopiasDisponibles(libro.getNumCopiasDisponibles()+1);
				System.out.println("Libro devuelto");
			}
		}else {
			System.out.println("Noo hay nada en le biblioteca");
		}
	}

	void mostrarLibros() {
		System.out.println("TITULO     AUTOR     EJEMPLRES");
		if(!this.libros.values().isEmpty()) {
			for (Libro libro : this.libros.values()) {
				System.out.println(libro.getTitulo() +"     " + libro.getAutor() + "     " + libro.getNumCopiasDisponibles());
			}
		}
	}

}
