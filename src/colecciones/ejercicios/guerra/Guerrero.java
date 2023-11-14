package colecciones.ejercicios.guerra;

import colecciones.ejercicios.guerra.excepciones.PoderInsuficiente;

public  class Guerrero {

	private String nombre;

	private String tipo;

	private double fuerza;

	private double resistencia;

	public Guerrero(String nombre, String tipo)  {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.fuerza = 5;
		this.resistencia = 5;
	}

	public Guerrero(String nombre, String tipo, double fuerza, double resistencia) throws PoderInsuficiente {
		if(fuerza+resistencia>10) {
			throw new PoderInsuficiente("La fuerza mas la resistencia es mayor a 10");
		}else {
			this.nombre = nombre;
			this.tipo = tipo;
			this.fuerza = fuerza;
			this.resistencia = resistencia;
		}		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getFuerza() {
		return fuerza;
	}

	public void setFuerza(double fuerza) {
		this.fuerza = fuerza;
	}

	public double getResistencia() {
		return resistencia;
	}

	public void setResistencia(double resistencia) {
		this.resistencia = resistencia;
	}
	
	




}
