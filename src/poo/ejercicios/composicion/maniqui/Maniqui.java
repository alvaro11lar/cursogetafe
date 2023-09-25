package poo.ejercicios.composicion.maniqui;

public class Maniqui {
	
	private long id;
	private Vestido vestido;
	private Pantalon pantalon;
	private Camisa camisa;
	
	public Maniqui(long id, Vestido vestido, Camisa camisa) {
		super();
		this.id = id;
		this.vestido = vestido;
		this.camisa = camisa;
	}

	public Maniqui(long id, Pantalon pantalon, Camisa camisa) {
		super();
		this.id = id;
		this.pantalon = pantalon;
		this.camisa = camisa;
	}
	
	public Maniqui(long id) {
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}
	
	public void vestir(Camisa camisa, Pantalon pantalon) {
		this.camisa=camisa;
		this.pantalon=pantalon;
	}
	
	public void vestir(Camisa camisa, Vestido vestido) {
		this.camisa=camisa;
		this.vestido=vestido;
		}

	public void desvestir() {
		this.camisa=null;
		this.vestido=null;
		this.pantalon=null;
	}

	@Override
	public String toString() {
		return "Maniqui [id=" + id + ", vestido=" + vestido.toString() + ", pantalon=" + pantalon.toString() + ", camisa=" + camisa.toString() + "]";
	}
	
	
}
