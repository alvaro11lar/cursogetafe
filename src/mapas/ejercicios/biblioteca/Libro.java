package mapas.ejercicios.biblioteca;

public class Libro {
	private String titulo;
	private String autor;
	private int numCopiasDisponibles;
 
	public Libro(String titulo, String autor, int numCopiasDisponibles) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numCopiasDisponibles = numCopiasDisponibles;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumCopiasDisponibles() {
		return numCopiasDisponibles;
	}

	public void setNumCopiasDisponibles(int numCopiasDisponibles) {
		this.numCopiasDisponibles = numCopiasDisponibles;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numCopiasDisponibles=" + numCopiasDisponibles + "]";
	}
	
	
	
}
