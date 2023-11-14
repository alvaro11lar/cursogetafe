package poo.ejercicios.usuario;

public class Coche extends Vehiculo {
	private int numPuertas;

	public Coche(long id, String matricula, String marca, int numPuertas) {
		super(id, matricula, marca);
		this.numPuertas=numPuertas;
	}

	@Override
	public void encender() {
		System.out.println("El coche  con matricula " + this.getMatricula() + " esta encendiendo." );
		
	}

	@Override
	public void apagar() {
		System.out.println("El coche  con matricula " + this.getMatricula() + " esta apagandose." );
		
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	

}
