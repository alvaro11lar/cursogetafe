package poo.ejercicios.hospital;

public class Hospital {
	private String nombre;
	private Habitacion[] habitaciones;
	private Paciente[] salaEspera;

	public Hospital(String nombre) {
		super();
		this.nombre = nombre;
		this.habitaciones = new Habitacion[2];
		this.salaEspera =new Paciente[3];
	}

	public void abrirHospital() {
		Habitacion habitacion1=new Habitacion(1);
		Habitacion habitacion2=new Habitacion(2);
		Habitacion[] habitaciones= {habitacion1,habitacion2};
		this.habitaciones=habitaciones;

		Paciente paciente1= new Paciente(1,"Alvaro",23,new String[] {"dolor de cabeza","dolor de estomago"}) ;
		Paciente paciente2= new Paciente(2,"Jose",36,new String[] {"fiebre","dolor de estomago"});
		Paciente paciente3= new Paciente(3,"Carlos",78,new String[] {"fiebre","dolor de estomago"});

		this.salaEspera[0]=paciente1;
		this.salaEspera[1]=paciente2;
		this.salaEspera[2]=paciente3;

		Enfermero enfermero1=new Enfermero(1,"Pepe",47);

		Doctor doctor1=new Doctor(1,"Felix",54);

		EmpleadosHospital[] empleados= {enfermero1,doctor1};
		Persona[] personas= {paciente1,paciente2,paciente3,enfermero1,doctor1};

		fichar(empleados);
		comer(personas);

		System.out.println("==============================================");

		Paciente[] pacientesParaDoctor=enfermero1.atenderPaciente(salaEspera);
		
		System.out.println("==============================================");

		for(int i=0;i<pacientesParaDoctor.length;i++) {
			Enfermo enfermo=doctor1.diagnosticarPaciente(pacientesParaDoctor[i]);
			boolean ingresado=false;
			if(enfermo!=null) {
				for(Habitacion habitacion:this.habitaciones) {
					if(habitacion.getEnfermo()==null) {
						habitacion.setEnfermo(enfermo);
						//System.out.println("El enfermo " + enfermo.getNombre() + " esta en la habitacion" + habitacion.getNumero());
						ingresado=true;
						//System.out.println(ingresado);
						break;
					}
				}
				if(!ingresado) {
					System.out.println("Lo sentimos pero ya no queda habitacion");
				}
			}

		}
		
		System.out.println("==============================================");
		
		for(Habitacion habitacion:habitaciones) {
			if(habitacion.getEnfermo()!=null) {
			System.out.println("El paciente " + habitacion.getEnfermo().getNombre() + " ha sido ingresado en la habitacion " + 
								habitacion.getNumero());
			}
		}
	}




	public void fichar(EmpleadosHospital[] empleados) {
		for(EmpleadosHospital empleado:empleados) {
			empleado.fichar();
		}
	}

	public void comer(Persona[] personas) {
		for(Persona persona:personas) {
			persona.comer();
		}
	}

	public static void main(String[] args) {
		Hospital hospital1=new Hospital("Almenara");
		hospital1.abrirHospital();
	}

}
