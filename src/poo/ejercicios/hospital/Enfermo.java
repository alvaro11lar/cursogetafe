package poo.ejercicios.hospital;

public class Enfermo extends Persona{
	private String enfermedad; 
	
	public Enfermo(long id, String nombre, int edad) {
		super(id, nombre, edad);
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	@Override
	public void comer() {
		System.out.println("El paciente " + this.getNombre() + " esta comiendo en la habitacion");
	}

	
}