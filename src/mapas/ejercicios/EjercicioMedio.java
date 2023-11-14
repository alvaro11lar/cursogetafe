package mapas.ejercicios;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import colecciones.ejercicios.Alumno;
import utils.Utilidades;

public class EjercicioMedio {
	
	public static void main(String[] args) {
		//mostrarAlumnosColegio();
		obtenerColegio(Utilidades.pideDatoTexto("Introduce un dni: "));
	}

	static Map<String,List<Alumno>> crearMapa() {
		Map<String,List<Alumno>> misAlumnos=new HashMap<String,List<Alumno>>();

		Alumno alumno1=new Alumno("111","Alvaro","Huamani",8);
		Alumno alumno2=new Alumno("222","Juan","Salazar",5);
		Alumno alumno3=new Alumno("333","Aldair","Rodriguez",4);
		Alumno alumno4=new Alumno("444","Hernan","Barcos",10);
		//List<Alumno> alumnos= new ArrayList<Alumno>(); 
		List<Alumno> alumnos=Arrays.asList(alumno1,alumno2);
		List<Alumno> alumnos2=Arrays.asList(alumno3,alumno4);

		misAlumnos.put("San Jose", alumnos);
		misAlumnos.put("Trilce", alumnos2);
		return misAlumnos;
	}
	

	static void mostrarAlumnosColegio() {
		for (Entry<String, List<Alumno>> datos : crearMapa().entrySet()) {
			System.out.println(datos.getKey() + "\t");
			for (Alumno alumno : datos.getValue()) {
				System.out.println(alumno.toString());
			}
		}
	}
	
	static void obtenerColegio(String dni) {
		for (Entry<String, List<Alumno>> datos : crearMapa().entrySet()) {
			for (Alumno alumno : datos.getValue()) {
				if(dni.equals(alumno.getDni())) {
					System.out.println("El alumno con dni: " + dni + " esta en el colegio" + datos.getKey());
				}
			}
		}
	}
}
