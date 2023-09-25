package poo.ejercicios.composicion;

public class Alumno {

	String dni;
	String nombre;
	String apellidos;
	int nota;

	public Alumno() {}
	
	public Alumno(String dni,String nombre,String apellidos) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	
	public Alumno(String dni,String nombre,String apellidos,int nota) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.nota=nota;
	}
	
	public void estudiar() {
		String mensaje="";
		if(nota==0) {
			mensaje="El alumno llamado " +nombre+ " no ha estudiado nada";
		}else if(nota<5) {
			mensaje="El alumno llamado " +nombre+ " ha estudiado poco";
		}else if(nota<9) {
			mensaje="El alumno llamado " +nombre+ " ha estudiado mucho";
		}else if(nota==10) {
			mensaje="El alumno llamado " +nombre+ " es un genio";
		}
		System.out.println(mensaje);
	}
}
