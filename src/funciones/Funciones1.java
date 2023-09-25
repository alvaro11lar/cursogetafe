package funciones;

public class Funciones1 {
	public static void main(String[] arrgs) {

		/*for(int i=0;i<arrgs.length;i++) {
			System.out.println(arrgs[i]);
		}


		metodo1();
		Funciones1 funcion = new Funciones1();
		funcion.metodo2();*/

		System.out.println(metodo6());

	}
	//Declaracion de un metodo.
	//Modificacion de acceso.
	// public: modificador que permite el acceso desde cualquier otra clase.
	// private: solo se puede acceder desde la clase en la que esta definida
	// si no tiene nada es de tipo "package" : solo la propia clase y las clases que estan en el mismo paquete.
	// pprotected: igual que el package pero las clases las hijas en diferentes en paquetes tendran acceso.

	// 2. static
	public static void metodo1() {
		System.out.println("Metodo 1");
	}

	public void metodo2() {
		System.out.println("Metodo 1");
	}

	public static String  metodo6() {
		return "Hola soy Alvaro";
	}

	static boolean numeroParCaracteres(String nombre) {
		if(nombre.length()%2==0) {
			return true;
		}
		return false;
		
	}

}
