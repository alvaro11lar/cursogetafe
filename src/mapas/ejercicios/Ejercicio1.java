package mapas.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import colecciones.ejercicios.Alumno;
import utils.Utilidades;

public class Ejercicio1 {

	public static void main(String[] args) {
		 //mostrarInfoAlumnos();
		System.out.println(verificarAlumno(Utilidades.pideDatoTexto("Dame un dni: "))); 

	}

	double obtnerNotaMedia() {
		double notaTotal=0;
		for (Alumno alumno : crearMapa().values()) {
			notaTotal+=alumno.getNota();
		}
		return notaTotal/crearMapa().size();
	}

	static String verificarAlumno(String dniEntrante) {
		String infoAlumnoEncontrado=null;
		for (String dni : crearMapa().keySet()) {
			if(dni.equals(dniEntrante)) {
				infoAlumnoEncontrado=crearMapa().get(dni).toString();
			}
		}
		return infoAlumnoEncontrado;
	}



	static void mostrarInfoAlumnos(){
		//Mostramos la informacion de todos los alumnos.
		for (String claves :crearMapa().keySet()) {
			System.out.println(crearMapa().get(claves).toString());
		}
	}

	static Map<String,Alumno> crearMapa() {
		Map<String,Alumno> misAlumnos=new HashMap<String,Alumno>();

		Alumno alumno1=new Alumno("111","Alvaro","Huamani",8);
		Alumno alumno2=new Alumno("222","Juan","Salazar",5);
		Alumno alumno3=new Alumno("333","Aldair","Rodriguez",4);
		Alumno alumno4=new Alumno("444","Hernan","Barcos",10);
		//List<Alumno> alumnos= new ArrayList<Alumno>(); 
		List<Alumno> alumnos=Arrays.asList(alumno1,alumno2,alumno3,alumno4);
		//Alumno[] alumnos= {alumno1,alumno2,alumno3,alumno4};
		for (Alumno alumno : alumnos) {
			misAlumnos.put(alumno.getDni(), alumno);
		}

		return misAlumnos;
	}

}
