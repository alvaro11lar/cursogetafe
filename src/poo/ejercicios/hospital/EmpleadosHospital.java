package poo.ejercicios.hospital;

public abstract class EmpleadosHospital extends Persona{

	private String turno;
	
	public EmpleadosHospital(long id, String nombre, int edad) {
		super(id, nombre, edad);
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	public void fichar() {
		System.out.println("El empleado " + this.getNombre() + " esta fichando");
	}

	@Override
	public void comer() {
		System.out.println("El empleado " + this.getNombre() + " esta comiendo en el comedor");
	}
	
	
}
