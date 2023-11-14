package poo.ejercicios.usuario;

public class Moto extends Vehiculo{
	
	private int numRuedas;
	
	public Moto(long id, String matricula, String marca) {
		super(id, matricula, marca);
	}

	@Override
	public void encender() {
		System.out.println("El moto  con matricula " + this.getMatricula() + " esta encendiendo." );
		
	}

	@Override
	public void apagar() {
		System.out.println("El moto  con matricula " + this.getMatricula() + " esta apgandose." );		
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	
	
	

}
