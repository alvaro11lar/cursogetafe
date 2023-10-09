package excepciones.ejercicios.cafeteria;

public class ClienteCafeteria {
	private String nombre;

	public ClienteCafeteria(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void tomarcafe(CoffeCup coffecup) throws TooHotTemperatura,TooColdTemperatura{
		if(coffecup.getTemperatura()<20) {
			throw new TooColdTemperatura();
		}else if(coffecup.getTemperatura()>80) {
			throw new TooHotTemperatura();
		}
		System.out.println("El cliente se esta tomando su cafe a " + coffecup.getTemperatura());
	}
	
}
