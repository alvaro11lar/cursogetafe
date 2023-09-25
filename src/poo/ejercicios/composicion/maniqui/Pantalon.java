package poo.ejercicios.composicion.maniqui;

public class Pantalon {
	
	private long id;
	private double talla;
	private String color;
	private double precio;
	private Boton boton;
	
	public Pantalon(long id, double talla, String color, double precio, Boton boton) {
		super();
		this.id = id;
		this.talla = talla;
		this.color = color;
		this.precio = precio;
		this.boton=boton;
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
	
	public Boton getBoton() {
		return boton;
	}

	public void setBoton(Boton boton) {
		this.boton = boton;
	}

	@Override
	public String toString() {
		return "Pantalon [id=" + id + ", talla=" + talla + ", color=" + color + ", precio=" + precio + ", boton="
				+ boton.toString() + "]";
	}
	
	
}
