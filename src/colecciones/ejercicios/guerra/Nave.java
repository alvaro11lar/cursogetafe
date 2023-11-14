package colecciones.ejercicios.guerra;

import java.util.Random;

import colecciones.ejercicios.guerra.excepciones.AtaqueInsuficiente;


public class Nave extends VehiculoGuerra{

	public Nave(String nombre) {
		super(nombre);
	}

	public Nave(String nombre, int ataque, int defensa) throws AtaqueInsuficiente {
		super(nombre, ataque, defensa);
	}
	
	@Override
	public int atacar() {
		int ataqueGuerreros=0;
		for (Guerrero guerrero : this.guerreros) {
			ataqueGuerreros+=guerrero.getFuerza();
		}
		Random r=new Random();
		double ataque=this.getAtaque()*r.nextDouble(0,1)+ataqueGuerreros*r.nextDouble(0,0.5);
		System.out.println(this.getNombre()+" ha atacado " + ataque);
	
		return (int)ataque;
	}

	@Override
	public int defender(int ataque) {
		int sumaDefensaGuerreros=0;
		for (Guerrero guerrero : this.getGuerreros()) {
			sumaDefensaGuerreros+=guerrero.getResistencia();
		}
	
		int defensa = (int)(this.getDefensa() * Math.random() 
				+  sumaDefensaGuerreros * Math.random()/2 );
		
		System.out.println(this.getNombre()+" se ha defendido con: " + defensa);
		return ataque-defensa<0?0:ataque-defensa;
	}
	
	

}
