package poo.ejercicios.herencia;

public class Tambor extends Instrumento{
	private String material;

	public Tambor(String nombre, String tipo) {
		super(nombre, tipo);
	}

	public Tambor(String nombre, String tipo, String material) {
		super(nombre, tipo);
		this.material=material;
	}

	@Override
	public void afinar() {
		System.out.println("Afinando "  +this.getNombre());
	}
	
	public void aporrear() {
		System.out.println("Aporreando " + this.getNombre());
	}
}
