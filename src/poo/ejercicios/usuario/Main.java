package poo.ejercicios.usuario;

public class Main {
	
	
	public static void main(String[] args){
		
		Moto moto=new Moto(1,"aaaa","BMW");
		Coche coche=new Coche(2,"bbbb","Audi",2);
		Television tv=new Television(3,456,"samsung",3);
		Movil movil=new Movil(4,950,"motorola","android");
		
		Juguete juguete=new Juguete("peluche");
		
		SistemaEncendido[] e= {moto};
		Main main=new Main();
		
		main.encender(moto);
		main.encender(coche);
		main.encender(tv);
		main.encender(movil);
		
		//main.encender(juguete);
		
		
	}
	
	public void encender(SistemaEncendido e) {
		e.encender();
	}

}
