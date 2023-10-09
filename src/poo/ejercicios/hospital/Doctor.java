package poo.ejercicios.hospital;

import java.util.Random;

public class Doctor extends EmpleadosHospital{
	private String especialidad;

	public Doctor(long id, String nombre, int edad) {
		super(id, nombre, edad);
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Enfermo diagnosticarPaciente(Persona paciente) {
		Random r=new Random();
		int numAleatorio= r.nextInt(1,10);
		//System.out.println("El numero aleatorio es: " + numAleatorio);
		System.out.println("El numero aleatorio es: " + numAleatorio);
		if(numAleatorio>=8) {
			System.out.println("El paciente " + paciente.getNombre() + " esta enfermo");
			Enfermo enfermo=new Enfermo(paciente.getId(),paciente.getNombre(),paciente.getEdad());
			return enfermo;
		}else {
			System.out.println("El paciente " + paciente.getNombre() + " no esta enfermo");
			return null;
		}
	}


}
