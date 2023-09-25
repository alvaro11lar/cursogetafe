package funciones;



public class Ejercicio5Calculadora {
	public static void main(String[]args) {
		int opcion=0;
		double valor=0;
		do {
			opcion=Ejercicio3.pintarMenu(texto);
			switch(opcion) {
				case 1:valor=operar(valor,"sumar");break;
				case 2:valor=operar(valor,"restar");break;
				case 3:valor=operar(valor,"multiplicar");break;
				case 4:valor=operar(valor,"dividir");break;
				case 5:valor=cientifica(valor);break;				
			}
		}while(opcion!=6);
		
	}
	
	static String texto="1.Suma \n2.Resta \n3.Multiplicacion \n4.Division \n5.Cientfica \n6.Apagar ";
	static String texto1="1.Potencia \n2.Raiz cuadrada \n3.Seno \n4.Coseno \n5.Volver ";
	
	public static double operar(double valor,String operacion) {
		int num=Integer.parseInt(Ejercicio3.devolver("Introduce un numero a " + operacion));
		switch(operacion) {
		case "sumar":valor+=num;break;
		case "restar":valor-=num;break;
		case "multiplicar":valor*=num;break;
		case "dividir":valor/=num;break;	
		}
		System.out.println("Resultado: " + valor);
		return valor;
	}
	
	public static double cientifica(Double resultado) {
		int opcion = 0;
		do {
			opcion = Ejercicio3.pintarMenu(texto1);
			
			switch (opcion) {
				case 1: 
					int num = Integer.parseInt(Ejercicio3.devolver("Introduce un numero a "));
					resultado = Math.pow(resultado, num); break;
					
				case 2: resultado = Math.sqrt(resultado); break;
				case 3: resultado = Math.sin(resultado); break;
				case 4: resultado = Math.cos(resultado); break;
				case 5: break;
				default:
					System.out.println("Opción incorrecta");
			
			}
			System.out.println("El resultado es "+resultado);
			
		}while(opcion!=5);
		
		return resultado;
	}
	static void potencia(){
		int a=Integer.parseInt(Ejercicio3.devolver("Inserte el numero de la base: "));
		int b=Integer.parseInt(Ejercicio3.devolver("Inserte el numero de potencia: "));
	
		System.out.println(Math.pow(a, b));
	}

	static void raizCuadrada(){
		int a=Integer.parseInt(Ejercicio3.devolver("Inserte el numero: "));
	
		System.out.println(Math.sqrt(a));
	}
	
	static void seno(){
		int a=Integer.parseInt(Ejercicio3.devolver("Inserte el numero : "));
	
		System.out.println(Math.sin(a));
	}
	
	
	static void coseno(){
		int a=Integer.parseInt(Ejercicio3.devolver("Inserte el numero : "));
		
		System.out.println(Math.cos(a));
	}
}
