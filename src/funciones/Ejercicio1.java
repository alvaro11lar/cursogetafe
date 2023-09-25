package funciones;

public class Ejercicio1 {
	public static void main(String[] rgs) {

		int edadActual=calculaEdad("2010");
		System.out.println(edadActual);
		pintaTablaMultiplicar(9);

		String[] repeticione=juntaDatos("alavro",4);
		for(int i=0;i<repeticione.length;i++) {
			System.out.println(repeticione[i]);
		}

		pintarDecendnete("hola",4);


	}

	static int calculaEdad(String anioNacimento) {
		int anioActuual=2023;
		return anioActuual - Integer.parseInt(anioNacimento);
	}

	static void pintaTablaMultiplicar(int numero) {

		for(int i=0;i<11;i++) {
			System.out.println(i + " * "+ numero + " =" + numero*i);
		}
	}

	static String[] juntaDatos(String cadena,int numero) {
		String[] numeroVeces=new String[numero];
		for(int i=0;i<numero;i++) {
			numeroVeces[i]=cadena;
		}
		return numeroVeces;
	}

	static boolean vecesMenorCaracter(String cadena,int numero) {
		boolean esMenor=true;
		if(cadena.length()>numero){
			esMenor=false;
		}
		return esMenor;
	}

	static String[] juntaDatosDecedente(String cadena,int numero) {
		String[] numeroVeces=new String[numero];
		for(int i=0,j=0;i<numero;i++,j++) {
			numeroVeces[i]=cadena.substring(0,cadena.length()-j);
		}
		return numeroVeces;
	}

	static void pintarDecendnete(String cadena,int numero) {

		if(vecesMenorCaracter(cadena,numero)) {
			String[] repeticiones=juntaDatosDecedente(cadena,numero);
			for(int i=0;i<repeticiones.length;i++) {
				System.out.println(repeticiones[i]);
			}
		}
	}

}
