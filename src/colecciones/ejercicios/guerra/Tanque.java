package colecciones.ejercicios.guerra;

import colecciones.ejercicios.guerra.excepciones.AtaqueInsuficiente;

public class Tanque extends VehiculoGuerra {

	public Tanque(String nombre, int ataque, int defensa) throws AtaqueInsuficiente {
		super(nombre, ataque, defensa);
	}

	@Override
	public int atacar() {
		int sumaAtaques=0;
		for (Guerrero guerrero : this.getGuerreros()) {
			sumaAtaques+=guerrero.getFuerza();
		}
		return sumaAtaques;
	}

	@Override
	public int defender(int ataque) {
		int sumaDefensas=0;
		for (Guerrero guerrero : this.getGuerreros()) {
			sumaDefensas+=guerrero.getResistencia();
		}
		return sumaDefensas;
	}

}
