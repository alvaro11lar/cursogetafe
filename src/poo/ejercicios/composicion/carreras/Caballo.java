package poo.ejercicios.composicion.carreras;

import java.util.Random;

public class Caballo {

	private long id;
	private String nombre;
	private int numero;
	private int edad;
	private double velocidad;
	private double peso;

	public Caballo(long id, String nombre, int numero, int edad, double velocidad, double peso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numero = numero;
		this.edad = edad;
		this.velocidad = velocidad;
		this.peso = peso;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double correr() {
		double avance=0;
		Random rd1=new Random();
		int a=rd1.nextInt(1,20);
		int b=rd1.nextInt(1,3);
		int c=rd1.nextInt(1,3);
		avance= this.velocidad*a-this.peso*b-this.edad*c;
		if(avance<0) {
			return avance=0;
		}else {
			System.out.println("El caballo " + this.numero + " avanza " + avance);
			return avance;
		}

	}
	
	
	
	
	
	
}

