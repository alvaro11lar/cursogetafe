package poo.ejercicios.usuario;

public class Television extends DispositivoElectronico {
	
	private int hdmi;

	public Television(long id, double precio, String fabricante, int hdmi) {
		super(id, precio, fabricante);
		this.hdmi=hdmi;
	}

	@Override
	public void encender() {
		System.out.println("El television  con id" + this.getId() + " esta encendiendo." );
	}

	@Override
	public void apagar() {
		System.out.println("El television  con id " + this.getId() + " esta apagandose." );	
	}

	public int getHdmi() {
		return hdmi;
	}

	public void setHdmi(int hdmi) {
		this.hdmi = hdmi;
	}
	
	

}
