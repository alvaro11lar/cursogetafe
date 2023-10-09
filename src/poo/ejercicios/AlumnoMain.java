package poo.ejercicios;

public class AlumnoMain {

	public static void main(String[] args) {

		Alumno a = new Alumno();
		Alumno b = new Alumno("1","Alvaro","Huamani");
		Alumno c = new Alumno("2","Juan","Lopez",7);

		a.nombre="Cesar";
		a.apellidos="Caceda";
		a.dni="3";
		a.nota=10;

		a.estudiar();
		b.estudiar();
		c.estudiar();

		Alumno[] abc = {a,b,c};
		System.out.println("----------------------------");

		pintarAprobados(abc);

	}

	public static void pintarAprobados(Alumno[] a) {
		for(int i=0;i<a.length;i++){
			if(a[i].nota>=5){
				System.out.println("El alumno " + a[i].nombre + " con apeliido " + a[i].apellidos + " con dni " + a[i].dni + 
						" con nota " + a[i].nota);
			}
		}
	}

}
