package poo;

public class PersonaMain {

	public static void main(String[] args) {
	
		Persona p1 = new Persona();
		
		System.out.println(p1.nombre);
		System.out.println(p1.apellidos);
		System.out.println(p1.dni);
		System.out.println(p1.edad);
		
		p1.nombre = "Eva";
		
		System.out.println(p1.nombre);
		
		Persona p2 = new Persona();
		Persona p3 = p1;
		
		System.out.println(p3.nombre);
		
		p1.edad = 34;
		p3.edad = 18;
		
		p2.correr();
		p3.correr();
		p1.correr();
		
		
	}

}
