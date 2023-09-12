package arrays.unidimensional;

public class Ejercici4 {
	public static void main(String[] args) {
		
		/*String nombre = "alvaro:19";
		String parte[]= nombre.split(":");
		System.out.println(parte[0]);
		System.out.println(parte[1]);*/
		
		
		String []alumnos= {"Alumno1:9","Alumno2:8","Alumno3:3","Alumno4:4","Alumno5:5","Alumno6:10","Alumno7:4" }; 
		int numAlumAprobados=0;
		String aprobados="";
		
		for(int i=0;i<alumnos.length;i++) {
			String partes[]=alumnos[i].split(":");
			if(Integer.parseInt(partes[1])>=5) {
				aprobados=aprobados.concat(partes[0]+" ");
			}
		}
		System.out.println(aprobados);
		String [] alumApro=aprobados.split(" ");
		System.out.println(alumApro.length);
	
		for(String nombre:alumApro) {
			System.out.println(nombre);
		}
	}

}
