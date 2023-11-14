package colecciones.ejercicios.guerra;

import colecciones.ejercicios.guerra.excepciones.PoderInsuficiente;

public class Militar extends Guerrero{

	public Militar(String nombre, String tipo) {
		super(nombre, tipo);
	}

	public Militar(String nombre, String tipo, double fuerza, double resistencia) throws PoderInsuficiente {
		super(nombre, tipo, fuerza, resistencia);

	}
	
	

	
}
