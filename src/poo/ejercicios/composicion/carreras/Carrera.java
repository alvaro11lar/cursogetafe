package poo.ejercicios.composicion.carreras;

public class Carrera {

	private long id;
	private String nombre;
	private double distancia;
	private Caballo[] caballos;

	public Carrera(long id, String nombre, double distancia, Caballo[] caballos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.distancia = distancia;
		this.caballos = caballos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public Caballo[] getCaballos() {
		return caballos;
	}

	public void setCaballos(Caballo[] caballos) {
		this.caballos = caballos;
	}

	public int iniciarCarrera() {
		String msg="";
		Caballo c=null;
		double[] avances=new double[this.caballos.length];
		while(c==null) {
			for(int i=0;i<this.caballos.length;i++) {
				avances[i]+=this.caballos[i].correr();
				//System.out.println("El caballo " + this.caballos[i].getNumero() + "avanzo " + avances[i]);
				if(avances[i]>=this.distancia) {
					System.out.println("Gano con distancia de: " + avances[i]);
					System.out.println("El ganador de la carrera fue el caballo " + this.caballos[i].getNumero());
					 c = this.caballos[i];
					break;
				}
			}
		}
		return c.getNumero();
	}
	
	public int encontrarCaballo(int numeroCaballo) {
		int encontrado=0;
		for(int i=0;i<this.caballos.length;i++) {
			if(this.caballos[i].getNumero()==numeroCaballo) {
				encontrado=1;
				break;
			}
		}
		return encontrado;
	} 


}
