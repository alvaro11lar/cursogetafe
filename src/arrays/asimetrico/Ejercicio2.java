package arrays.asimetrico;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] gs) {
		String texto= "Bienvenido al menu \n1.Insertar alumno \n2.Mostrar alumnos por aula "
				+ "\n3.Mostrar los alumnos aprobados del coolegio \n4.Buscar alumno \n5.Borrar alumno \n6.Salir ";

		Scanner sc=new Scanner(System.in);
		System.out.println("¿Cuantas aulas tiene el colegio?");
		int numAulas=sc.nextInt();

		String[][] aulas = new String[numAulas][];
		//Guardamos la cantidad de alumnos por cada aula.
		for(int i=0;i<aulas.length;i++) {
			System.out.println("cuantas alumnos tiene el aula" + (1+i));
			int numAlumnos=sc.nextInt();
			aulas[i]=new String[numAlumnos];	
		}

		int opcion=0;
		do {
			System.out.println(texto);
			Scanner scan = new Scanner(System.in);
			opcion=scan.nextInt();
			switch(opcion) {
			case 1:

				//insertar un lumnoo
				System.out.println("En que aula quieres insertar:");
				sc=new Scanner(System.in);
				int aula=(sc.nextInt())-1;
				int contador=0;
				for(int i=0;i<aulas[aula].length;i++) {
					if(aulas[aula][i]==null) {
						String datos="";
						sc=new Scanner(System.in);
						System.out.println("Ingrese el nombre:");
						String nombre=sc.nextLine();
						sc=new Scanner(System.in);
						System.out.println("Ingrese el dni:");
						String dni=sc.nextLine();
						sc=new Scanner(System.in);
						System.out.println("Ingrese la nota ");
						double nota=sc.nextDouble();
						datos=datos.concat(nombre+":"+dni+":"+nota);
						aulas[aula][i]=datos;
						break;
					}else {
						contador++;
					}	
				}
				if(contador==aulas[aula].length) {
					System.out.println("Intenta con otra aula, que esta llena");
				}break;

			case 2:
				//Visualizar los alumnos de una  aula
				System.out.println("Ingresa el aula del que quieres visualizar los alum");
				sc=new Scanner(System.in);
				int aulaSelected=sc.nextInt()-1;
				String[] cadaAula= aulas[aulaSelected];
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
				}break;

			case 3:
				//Mostrar los alumnos aprobados
				int numAprobado=0;
				for(int i=0;i<aulas.length;i++) {
					for(int j=0;j<aulas[i].length;j++) {
						String datoAlumno=aulas[i][j];
						String alumno[]=datoAlumno.split(":");
						if(Double.parseDouble(alumno[2])>=5) {
							numAprobado++;
						}
					}
				}
				int contadores=0;
				String[]alumnoAprobado=new String[numAprobado];
				int contar=0;
				for(int i=0;i<aulas.length;i++) {
					for(int j=0;j<aulas[i].length;j++) {
						String datoAlumno=aulas[i][j];
						String alumno[]=datoAlumno.split(":");
						if(Double.parseDouble(alumno[2])>=5) {
							alumnoAprobado[contar]=datoAlumno;
							contadores++;
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
			case 4:
				//Buscar alumno
				System.out.println("Ingrese el dni del alumno par buscar:");
				sc=new Scanner(System.in);
				String dni=sc.nextLine();
				String alumnoCorrecto="";
				for(int i=0;i<aulas.length;i++) {
					for(int j=0;j<aulas[i].length;j++) {
						String datoAlumno=aulas[i][j];
						String alumno[]=datoAlumno.split(":");
						if(alumno[1].equals(dni)){
							alumnoCorrecto=i+"";
						}
					}
				}
				if(alumnoCorrecto.isBlank()) {
					System.out.println("Este alumno se encuentra en le aula " + alumnoCorrecto);
				}else {
					System.out.println("Este alumno no existte ");
				}break;

			case 5:
				//Borrar aalumno
				System.out.println("Ingrese el dni del alumno para borrar:");
				sc=new Scanner(System.in); 
				String dniBorrar=sc.nextLine();
				String dniCorrecto="";
				for(int i=0;i<aulas.length;i++) {
					for(int j=0;j<aulas[i].length;j++) {
						String datoAlumno=aulas[i][j];
						if(datoAlumno==null) {
							String alumno[]=datoAlumno.split(":");
							if(alumno[1].equals(dniBorrar)){
								aulas[i][j]=null;
								dniCorrecto=alumno[1];
							}
						}
					}
				}
				if(dniCorrecto.isBlank()) {
					System.out.println("Este alumno fue borrado");
				}else {
					System.out.println("Este alumno no existte ");
				}break;
			}


		}while(opcion!=6);
	}
}
