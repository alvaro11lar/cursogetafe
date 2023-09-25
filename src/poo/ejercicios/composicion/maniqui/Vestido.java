package poo.ejercicios.composicion.maniqui;

public class Vestido {

	private long id;
	private double talla;
	private String color;
	private double precio;
	
	public Vestido(long id, double talla, String color, double precio) {
		super();
		this.id = id;
		this.talla = talla;
		this.color = color;
		this.precio = precio;
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

	@Override
	public String toString() {
		return "Vestido [id=" + id + ", talla=" + talla + ", color=" + color + ", precio=" + precio + "]";
	}
	
	
	
}
