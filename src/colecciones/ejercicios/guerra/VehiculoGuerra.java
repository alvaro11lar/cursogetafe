package colecciones.ejercicios.guerra;

import java.util.ArrayList;
import java.util.List;

import colecciones.ejercicios.guerra.excepciones.AtaqueInsuficiente;
import colecciones.ejercicios.guerra.excepciones.GuerreroFueraRango;

public abstract class VehiculoGuerra implements Tripulable{
	
	private int puntoVida=100;
	
	private int ataque;
	
	private int defensa;
	
	private String nombre;
	
	List<Guerrero> guerreros=new ArrayList<Guerrero>();
	

	public VehiculoGuerra(String nombre) {
		this.nombre=nombre;
		this.ataque=5;
		this.defensa=5;
	}
	
	public VehiculoGuerra(String nombre,int ataque, int defensa) throws AtaqueInsuficiente {
		if(ataque+defensa>10) {
			throw new AtaqueInsuficiente("Ataque insuficiente");
		}else {
			this.ataque=ataque;
			this.defensa=defensa;
		}

		this.nombre=nombre;
	}



	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Guerrero> getGuerreros() {
		return guerreros;
	}

	void setGuerreros(List<Guerrero> guerreros) {
		this.guerreros = guerreros;
	}
	
	public int getPuntosVida() {
		return puntoVida;
	}

	void setPuntosVida(int puntosVida) {
		this.puntoVida = puntosVida;
	}

	public void embarcar(Guerrero guerrero) throws GuerreroFueraRango{
		//throws GuerreroFueraRango 
		this.guerreros.add(guerrero);
		if(this.guerreros.size()>10) {
			throw new GuerreroFueraRango("El numero de guerreros es mayor  a 10");
		}
	}
	
}
