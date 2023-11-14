package mapas.ejercicios.bibliotecaBaseDatos.entities;

public class Direccion {
	
	private long id;
	private String calle;
	private String poblacion;
	
	public Direccion(long id, String calle, String poblacion) {
		super();
		this.id = id;
		this.calle = calle;
		this.poblacion = poblacion;
	}
	
	public Direccion(String calle, String poblacion) {
		super();
		this.calle = calle;
		this.poblacion = poblacion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	
	
	

}
