package poo.ejercicios.composicion.maniqui;

public class Boton {
	
	private long id;
	private String forma;
	private double tamaño;
	private String color;
	
	public Boton(long id, String forma, double tamaño, String color) {
		super();
		this.id = id;
		this.forma = forma;
		this.tamaño = tamaño;
		this.color = color;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Boton [id=" + id + ", forma=" + forma + ", tamaño=" + tamaño + ", color=" + color + "]";
	}


	
}
