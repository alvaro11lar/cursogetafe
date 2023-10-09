package poo.ejercicios.hospital;

public class Enfermero extends EmpleadosHospital{
	private int planta;

	public Enfermero(long id, String nombre, int edad) {
		super(id, nombre, edad);
	}

	public int getPlanta() {
		return planta;
	}

	public void setPlanta(int planta) {
		this.planta = planta;
	}

	public Paciente[] atenderPaciente(Paciente[] salaEspera) {
		Paciente[] pacientesDeDoctor=new Paciente[salaEspera.length];
		
		for(int i=0;i<salaEspera.length;i++) {
			pacientesDeDoctor[i]=salaEspera[i];
			salaEspera[i]=null;
		}
		return pacientesDeDoctor;
	}
	
}
