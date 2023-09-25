package poo.ejercicios.composicion.maniqui;

import java.util.Arrays;

public class Camisa {

	private long id;
	private double talla;
	private String color;
	private double precio;
	private Boton[] botones;
	
	public Camisa(long id, double talla, String color, double precio, Boton[] botones) {
		super();
		this.id = id;
		this.talla = talla;
		this.color = color;
		this.precio = precio;
		this.botones=botones;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

	public Boton[] getBotones() {
		return botones;
	}

	public void setBotones(Boton[] botones) {
		this.botones = botones;
	}

	@Override
	public String toString() {
		return "Camisa [id=" + id + ", talla=" + talla + ", color=" + color + ", precio=" + precio + ", botones="
				+ Arrays.toString(botones) + "]";
	}
	
	
}
