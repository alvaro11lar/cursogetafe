package poo.ejercicios.usuario;

public abstract class Vehiculo implements SistemaEncendido {

	private long id;
	private String matricula;
	private String marca;

	public Vehiculo(long id, String matricula, String marca) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.marca = marca;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
}
