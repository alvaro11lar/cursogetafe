package mapas.ejercicios.equipo;

public class Jugador {
	
	private String nombre;
	private int edad;
	private String posicion;
	
	public Jugador(String nombre,String posicion,int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	
}
