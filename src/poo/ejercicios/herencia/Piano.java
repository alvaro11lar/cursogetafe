package poo.ejercicios.herencia;

public class Piano extends Instrumento{
	
	private int numOctavas;
	private String tipoPiano;
	
	public Piano(String nombre, String tipo) {
		super(nombre, tipo);
	}
	
	public Piano(String nombre, String tipo, int numOctavas, String tipoPiano) {
		super(nombre, tipo);
		this.numOctavas=numOctavas;
		this.tipoPiano=tipoPiano;
	}

	@Override
	public void afinar() {
		System.out.println("Afinando " + this.getNombre());
	}
	
	
	
	
	

}
