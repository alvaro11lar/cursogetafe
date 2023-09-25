package poo;

public class Persona {

	//Variables de instancia
	String nombre;
	String apellidos;
	String dni;
	int edad;
	
	public Persona() {
		nombre="Juan";
	}
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	
	
	
	//Metodos
	public void correr() {
		System.out.println("La persona con nombre " + nombre + " y edad " + edad + " esta corriendo");
		if(edad<25) {
			System.out.println("Muy rapido");
		}else {
			System.out.println("Muy lento");
		}
	
	}
}
