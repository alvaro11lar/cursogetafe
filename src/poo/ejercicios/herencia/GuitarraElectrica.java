package poo.ejercicios.herencia;

public class GuitarraElectrica extends Guitarra {
	private double potencia;
	
	public GuitarraElectrica(String nombre, String tipo,int numCuerdas) {
		super(nombre, tipo,numCuerdas);
	}
	
	public GuitarraElectrica(String nombre, String tipo,int numCuerdas, double potencia) {
		super(nombre, tipo,numCuerdas);
		this.potencia=potencia;
	}

	@Override
	public String tocar() {
		String msg= super.tocar();
		System.out.println(" muy alto");
		//super.tocar();System.out.println(" muy alto");
		return "";
	}
	
	

}
