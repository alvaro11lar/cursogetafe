
public class EjercicioIF {

	public static void main(String[] args) {

		String mes="Junio";
		String estacion="";
		
		if(mes=="Enero" || mes=="Febrero" || mes=="Marzo") {
			estacion= "Invierno";
			//System.out.println("Es invierno");
		}else if(mes=="Mayo" || mes=="Abril" || mes=="Junio") {
			estacion= "Primavera";
			//System.out.println("Es primavera");
		}else if(mes=="Julio" || mes=="Agosto" || mes=="Septiembre") {
			estacion= "Verano";
			//System.out.println("Es verano");
		}else if(mes=="Octubre" || mes=="Noviembre" || mes=="Diciembre") {
			estacion= "Otoño";
			//System.out.println("Es otoño");
		}
		
		System.out.println("Estamos en la estacion: " + estacion);
	}


}
