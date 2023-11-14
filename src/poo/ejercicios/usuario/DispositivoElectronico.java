package poo.ejercicios.usuario;

public abstract class DispositivoElectronico implements SistemaEncendido{
	
	private long id;
	private double precio;
	private String fabricante;
	
	public DispositivoElectronico(long id, double precio, String fabricante) {
		super();
		this.id = id;
		this.precio = precio;
		this.fabricante = fabricante;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	
	
}
