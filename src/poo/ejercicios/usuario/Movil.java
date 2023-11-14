package poo.ejercicios.usuario;

public class Movil extends DispositivoElectronico{
	

	private String sistemaOperativo;
	
	public Movil(long id, double precio, String fabricante, String sistemaOperativo) {
		super(id, precio, fabricante);
		this.sistemaOperativo=sistemaOperativo;
	}

	@Override
	public void encender() {
		System.out.println("El movil  con id  " + this.getId() + " esta encendiendo." );
		
	}

	@Override
	public void apagar() {
		System.out.println("El movil  con id  " + this.getId() + " esta apgandose." );
		
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	
	

}
