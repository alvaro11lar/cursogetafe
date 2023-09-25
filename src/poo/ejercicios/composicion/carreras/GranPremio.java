package poo.ejercicios.composicion.carreras;

public class GranPremio {

	private long id;
	private String nombre;
	private Carrera[] carreras;
	
	public GranPremio(long id, String nombre, Carrera[] carreras) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.carreras = carreras;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Carrera[] getCarreras() {
		return carreras;
	}

	public void setCarreras(Carrera[] carreras) {
		this.carreras = carreras;
	}
	
	
	
	
}
