package poo.ejercicios.usuario;

public class Usuario {
	
	private Moto moto;
	private Movil movil;
	private Television tv;
	private Coche coche;
	
	public Usuario(Moto moto, Movil movil, Television tv, Coche coche) {
		super();
		this.moto = moto;
		this.movil = movil;
		this.tv = tv;
		this.coche = coche;
	}
	
	
	public Moto getMoto() {
		return moto;
	}
	public void setMoto(Moto moto) {
		this.moto = moto;
	}
	public Movil getMovil() {
		return movil;
	}
	public void setMovil(Movil movil) {
		this.movil = movil;
	}
	public Television getTv() {
		return tv;
	}
	public void setTv(Television tv) {
		this.tv = tv;
	}
	public Coche getCoche() {
		return coche;
	}
	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	
	

}
