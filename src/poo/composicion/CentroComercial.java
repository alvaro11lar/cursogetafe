package poo.composicion;

public class CentroComercial {
	public static void main(String[] args) {
		
		Direccion direccion1 = new Direccion("N1",2,23432);
		Direccion direccion2 = new Direccion("N2",3,23432);
		
		Tienda tienda1 = new Tienda("Tienda1",1,"Alimmentacion",direccion1);
		Tienda tienda2 = new Tienda("Tienda2",2,"Electronica",direccion1);
		Tienda tienda3 = new Tienda("Tienda3",3,"Alimmentacion",direccion1);

		tienda1.getDireccion().getCodPostal();
	}

}
