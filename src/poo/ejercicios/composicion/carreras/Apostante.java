package poo.ejercicios.composicion.carreras;

public class Apostante {

	private String nombre;
	private double saldo;
	private int apuesta;

	
	public Apostante(String nombre, double saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public int getApuesta() {
		return apuesta;
	}

	public void setApuesta(int apuesta) {
		this.apuesta = apuesta;
	}

	public int verificarSaldo(double importe) {
		int saldo=0;
		if(this.saldo>=importe) {
			saldo=1;
		}
		return saldo;
	}
	
}
