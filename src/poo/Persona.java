package poo;

public class Persona {

	//Variables de instancia
	String nombre;
	String apellidos;
	String dni;
	int edad;
	
	public Persona() {
		//nombre="Juan";
	}
	
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
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
