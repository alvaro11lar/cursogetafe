package poo.ejercicios.herencia;

public class Instrumento {

	private String nombre;
	private String tipo;
	
	public Instrumento(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
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
	
	public void afinar() {
		System.out.println("Afinando el instrumento " + this.nombre);
	}
	
	public String tocar() {
		String msg="Tocando el instrumento " + this.nombre;
		System.out.println(msg);
		return msg;
	}
}
