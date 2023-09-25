package funciones;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		String[][]aulasColegio=devolveAulas();
		int opcion=0;
		do {
			opcion=Ejercicio3.pintarMenu(texto);
			switch(opcion) {
			case 1:
				insertarAlumno(aulasColegio);break;
			case 2:
				visualizarAlumnoxAula(aulasColegio);break;
			case 3: 
				mostrarAlumnosAprobados(aulasColegio);break;
			case 4:
				buscarAlumno(aulasColegio);break;
			case 5: 
				borrarAlumno(aulasColegio);break;
			case 6:
				System.out.println("Adios");break;
			default:
				System.out.println("Opción incorrecta");
			}	
		}while(opcion!=6);

	}

	static String texto= "Bienvenido al menu \n1.Insertar alumno \n2.Mostrar alumnos por aula "
			+ "\n3.Mostrar los alumnos aprobados del coolegio \n4.Buscar alumno \n5.Borrar alumno \n6.Salir ";

	static String[][] devolveAulas() {
		int numAulas=Integer.parseInt(Ejercicio3.devolver("¿Cuantas aulas tiene el colegio?"));

		String[][] aulas = new String[numAulas][];
		devolverAlumnoxAula(aulas);
		return aulas;
	}
	
	static String[][]devolverAlumnoxAula(String[][] aulasAlumnos) {
		for(int i=0;i<aulasAlumnos.length;i++) {
			int numAlumnos=Integer.parseInt(Ejercicio3.devolver("cuantas alumnos tiene el aula" + (1+i)));
			aulasAlumnos[i]=new String[numAlumnos];	
		}
		return aulasAlumnos;
	}
	
	static void insertarAlumno(String[][]colegio) {
		int aula=Integer.parseInt(Ejercicio3.devolver("En que aula quieres insertar: "))-1;
		int contador=0;
		for(int i=0;i<colegio[aula].length;i++) {
			if(colegio[aula][i]==null) {
				String datos="";
				String nombre=Ejercicio3.devolver("Ingrese el nombre:");
				String dni=Ejercicio3.devolver("Ingrese el dni:");
				double nota=Double.parseDouble(Ejercicio3.devolver("Ingrese la nota "));
				datos=datos.concat(nombre+":"+dni+":"+nota);
				colegio[aula][i]=datos;
				break;
			}else {
				contador++;
			}	
		}
		if(contador==colegio[aula].length) {
			System.out.println("Intenta con otra aula, que esta llena");
		}
	}
	
	static void visualizarAlumnoxAula(String[][]colegio) {
		int aulaSelected=Integer.parseInt(Ejercicio3.devolver("Ingresa el aula del que quieres visualizar los alum"))-1;	
		String[] cadaAula= colegio[aulaSelected];
		for(String daAlumno:cadaAula) {
			if(daAlumno!=null) {
				String []alumno=daAlumno.split(":");
				for(String dato:alumno) {
					if(dato!=null) {
						System.out.println("\t"+dato+" ");
					}
				}
			}
			System.out.println();
		}
	}
	
	static void mostrarAlumnosAprobados(String[][]colegio) {
		int numAprobado=0;
		for(int i=0;i<colegio.length;i++) {
			for(int j=0;j<colegio[i].length;j++) {
				String datoAlumno=colegio[i][j];
				String alumno[]=datoAlumno.split(":");
				if(Double.parseDouble(alumno[2])>=5) {
					numAprobado++;
				}
			}
		}
		
		String[]alumnoAprobado=new String[numAprobado];
		int contar=0;
		for(int i=0;i<colegio.length;i++) {
			for(int j=0;j<colegio[i].length;j++) {
				String datoAlumno=colegio[i][j];
				String alumno[]=datoAlumno.split(":");
				if(Double.parseDouble(alumno[2])>=5) {
					alumnoAprobado[contar]=datoAlumno;
					contar++;
				}	
			}
		}
		
		for(String aprobbados:alumnoAprobado){
			String alumno[]=aprobbados.split(":");
			for(String dato:alumno) {
				System.out.println("\t"+dato+" ");
			}
			System.out.println();
		}
	}
	
	static void buscarAlumno(String[][]colegio) {
		String dni=Ejercicio3.devolver("Ingrese el dni del alumno par buscar:");
		boolean alumnoEncontrado=false;
		for(int i=0;i<colegio.length && !alumnoEncontrado;i++) {
			for(int j=0;j<colegio[i].length && !alumnoEncontrado;j++) {
				String datoAlumno=colegio[i][j];
				if(datoAlumno!=null) {
					String alumno[]=datoAlumno.split(":");
					if(alumno[1].equals(dni)){
						System.out.println("El alumno está en el aula "+(i+1));
						alumnoEncontrado=true;
					}
				}
			}
		}
		if (!alumnoEncontrado) {
			System.out.println("El alumno con dni "+dni+" no está en el colegio");
		}
	}
	
	static void borrarAlumno(String[][]colegio) {
		String dniBorrar=Ejercicio3.devolver("Ingrese el dni para borrar:");
		boolean alumnoEncontrado=false;
		for(int i=0;i<colegio.length && !alumnoEncontrado;i++) {
			for(int j=0;j<colegio[i].length && !alumnoEncontrado;j++) {
				String datoAlumno=colegio[i][j];
				if(datoAlumno!=null) {
					String alumno[]=datoAlumno.split(":");
					if(alumno[1].equals(dniBorrar)){
						colegio[i][j] =null;
						alumnoEncontrado=true;
					}
				}
			}
		}
		if (!alumnoEncontrado) {
			System.out.println("El alumno con dni "+dniBorrar+" no está en el colegio");
		}
	}
	
	
	
}


