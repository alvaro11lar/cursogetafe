package poo.ejercicios.herencia;

public class Guitarra extends Instrumento{
	private int numCuerdas;
	
	public Guitarra(String nombre, String tipo) {
		super(nombre, tipo);
	}

	public Guitarra(String nombre, String tipo, int numCuerdas) {
		super(nombre, tipo);
		this.numCuerdas=numCuerdas;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afinar() {
		
		System.out.println("Afinando " + this.getNombre());
	}
	
	

	
}
