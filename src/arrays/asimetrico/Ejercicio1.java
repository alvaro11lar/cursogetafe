package arrays.asimetrico;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String [] args) {

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

		//
		for(int i=0;i<aulas.length;i++) {
			String datos="";
			System.out.println("Estamos en el aula "+(i+1));
			for(int j=0;j<aulas[i].length;j++) {
				datos="";
				sc=new Scanner(System.in);
				System.out.println("Dame losd atos del alumno "+(j+1));
				System.out.println("Ingrese el nombre:");
				String nombre=sc.nextLine();
				sc=new Scanner(System.in);
				System.out.println("Ingrese el dni:");
				String dni=sc.nextLine();
				sc=new Scanner(System.in);
				System.out.println("Ingrese la nota ");
				double nota=sc.nextDouble();
				datos=datos.concat(nombre+":"+dni+":"+nota);
				aulas[i][j]=datos;
			}
		}
		
		int numAprobado=0;
		for(int i=0;i<aulas.length;i++) {
			System.out.println("Aula "+(i+1)+"\n");
			for(int j=0;j<aulas[i].length;j++) {
				String datoAlumno=aulas[i][j];
				String alumno[]=datoAlumno.split(":");
				for(String dato:alumno) {
					System.out.println("\t"+dato+" ");
				}
				System.out.println();
				
				if(Double.parseDouble(alumno[2])>=5) {
					numAprobado++;
				}
				
			}
		}
		
		String[]alumnoAprobado=new String[numAprobado];
		int contador=0;
		for(int i=0;i<aulas.length;i++) {
			for(int j=0;j<aulas[i].length;j++) {
				String datoAlumno=aulas[i][j];
				String alumno[]=datoAlumno.split(":");
				if(Double.parseDouble(alumno[2])>=5) {
					alumnoAprobado[contador]=datoAlumno;
					contador++;
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

}
