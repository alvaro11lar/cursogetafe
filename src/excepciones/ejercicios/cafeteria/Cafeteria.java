package excepciones.ejercicios.cafeteria;

import java.util.Random;

public class Cafeteria {
	private String nombre;

	public Cafeteria(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void abrirCafeteria() {
		Random r=new Random();
		CoffeCup coffe = new CoffeCup(r.nextInt(1,100));
		ClienteCafeteria cliente = new ClienteCafeteria("Alvaro");
		try {
			cliente.tomarcafe(coffe);
		} catch (TooColdTemperatura e) {
			System.out.println("El cliente se ha quemado.");
			//e.printStackTrace();
		}catch (TooHotTemperatura e) {
			System.out.println("El cliente dice que su cafe esta muy frio");
			//e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Cafeteria cafeteria = new Cafeteria("ALVAROSCCOFFE");
		cafeteria.abrirCafeteria();
	}

}
