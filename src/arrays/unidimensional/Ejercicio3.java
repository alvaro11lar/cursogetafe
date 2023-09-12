package arrays.unidimensional;

public class Ejercicio3 {
	public static void main(String[]args) {
		
		String []alumnos= {"Alumno1:9","Alumno2:8","Alumno3:3","Alumno4:4","Alumno5:5","Alumno6:10","Alumno7:4" }; 
		int numAlumAprobados=0;
		
		for(int i=0;i<alumnos.length;i++) {
			int nota=Integer.parseInt(alumnos[i].substring(alumnos[i].indexOf(":")+1));
			//String nombre=alumnos[i].substring(0,alumnos[i].indexOf(":")-1);
			if(nota>=5) {
				numAlumAprobados++;
			}
		}
		
		System.out.println(numAlumAprobados);

		String alumAprobados[]= new String[numAlumAprobados]; 
//			//int nota=Integer.parseInt(alumnos[i].substring(alumnos[i].indexOf(":")+1));
//			//String nombre=alumnos[i].substring(0,alumnos[i].indexOf(":"));
//			for(int j=i; j<alumnos.length;j++) {
//				int nota=Integer.parseInt(alumnos[j].substring(alumnos[j].indexOf(":")+1));
//				String nombre=alumnos[j].substring(0,alumnos[j].indexOf(":"));
//				if(nota>=5) {
//					alumAprobados[i]=nombre;
//					break;
//				}
//				7
//			}
//		}
		int contador=0;
		for(int i=0;i<alumnos.length;i++) {
			int nota=Integer.parseInt(alumnos[i].substring(alumnos[i].indexOf(":")+1));
			String nombre=alumnos[i].substring(0,alumnos[i].indexOf(":"));
			if(nota>=5) {
				alumAprobados[contador]=nombre;
				contador++;
			}
		}
		
		for(String alumno: alumAprobados) {
			System.out.println(alumno);
		}
	}

}
