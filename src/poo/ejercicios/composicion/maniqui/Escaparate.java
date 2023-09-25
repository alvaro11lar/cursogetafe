package poo.ejercicios.composicion.maniqui;

public class Escaparate {

	public static void main(String[] ars) {

		Boton a =new Boton(1,"cuadrada",10,"negro");
		Boton b =new Boton(1,"cuadrada",10,"negro");
		Boton c =new Boton(1,"cuadrada",10,"negro");

		Boton[] botones= {a,b,c};

		Vestido vestido1=new Vestido(1,29,"rojo",26.52);
		Camisa camisa1=new Camisa(1,25.5,"blanco",25,botones);
		Pantalon pantalon1=new Pantalon(1,29,"negro",29,a);

		Maniqui maniqui1 = new Maniqui(1);
		maniqui1.vestir(camisa1, pantalon1);
		Maniqui[]m= {maniqui1};
		//maniqui1.desvestir();
		Escaparate es=new Escaparate();
		es.mostrarEscaparte(m);
		es.mostrarPrecio(m);
	}

	public void mostrarEscaparte(Maniqui[] maniqui) {
		String msg="";
		for(Maniqui m:maniqui) {
			if(m.getCamisa()!=null) {
				Camisa c=m.getCamisa();
				msg+="Tiene un camisa con id" + c.getId() + " de color "+  c.getColor() + " y de talla " + c.getTalla() + 
						" , de precio " + c.getPrecio();
				for(int i=0;i<m.getCamisa().getBotones().length;i++) {
					Boton[] botones=m.getCamisa().getBotones();
					msg+="Contiene el boton conn id " + botones[i].getId() + " con forma " + botones[i].getForma() + 
							" con color"+botones[i].getColor() + " y con tamaño " + botones[i].getTamaño();
				}
			}
			if(m.getPantalon()!=null) {
				Pantalon p=m.getPantalon();
				Boton b=p.getBoton();
				msg+="Tiene un pantalon con id" + p.getId() + " de color "+  p.getColor() + " y de talla " + p.getTalla() + 
						" , de precio " + p.getPrecio() + " con un boton" + "con id " + b.getId() + " con forma " + b.getForma()
						+ " que es de color " + b.getColor() + " y con un tamaño " + b.getTamaño();
			}

			if(m.getVestido()!=null){
				Vestido v=m.getVestido();
				msg="Tiene un vsstido con id" + v.getId() + " de color "+  v.getColor() + " y de talla " + v.getTalla() + 
						" , de precio " + v.getPrecio(); 
			}
			if(msg.isBlank()) {
				msg="El maniqui con id " +m.getId() + " esta ddesndo";
			}
			System.out.println(msg);
		}
	}
	public void mostrarPrecio(Maniqui[] maniqui) {
		double precioTotal=0;
		for(Maniqui m:maniqui) {
			if(m.getCamisa()!=null) {
				Camisa c=m.getCamisa();
				precioTotal+=c.getPrecio();
				System.out.println("El precio de la camisa es de :" + c.getPrecio());
			}
			if(m.getPantalon()!=null) {
				Pantalon p=m.getPantalon();
				System.out.println("El precio del pantalon es de: " + p.getPrecio());
				precioTotal+=p.getPrecio();
			}

			if(m.getVestido()!=null) {
				Vestido v=m.getVestido();
				System.out.println("El precio del vestido es de: " + v.getPrecio());
				precioTotal+=v.getPrecio();
			}
			System.out.println("El precio total de las del maniqui con id " + m.getId() + " es de " + precioTotal);
		}
	}
}
