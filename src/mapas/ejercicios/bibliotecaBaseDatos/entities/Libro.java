package mapas.ejercicios.bibliotecaBaseDatos.entities;

public class Libro {
	private String titulo;
	private String autor;
	private int ejemplares;

	public Libro(String titulo, String autor, int ejemplares) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
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

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public void actualizarEjempares(int ejemplares) {
		this.ejemplares+=ejemplares;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numCopiasDisponibles=" + ejemplares + "]";
	}



}
