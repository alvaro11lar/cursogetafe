package mapas.ejercicios.equipo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		Principal p=new Principal();
		p.mostrarTodaInfo(p.crearEquipos());
	}
	
	public void mostrarNombreJugadores(Map<Equipo,List<Jugador>> mapas) {

		Set<Entry<Equipo,List<Jugador>>> jugadores = mapas.entrySet();
		for (Entry<Equipo, List<Jugador>> entry : jugadores) {
			System.out.println(entry.getKey().getNombre());
			for (Jugador jugador : entry.getValue()) {
				System.out.println("Nombre: " + jugador.getNombre());
				
			}
		}		
	}
	
	public void mostrarTodaInfo(Map<Equipo,List<Jugador>> mapas) {
		
		for (Equipo equipo : mapas.keySet()) {
			System.out.println("Nombre de equipo: "  + equipo.getNombre());
			System.out.println("Numero de ligas: "  + equipo.getNumLigas());
			System.out.println("Numero de champions: "  + equipo.getNumChampions() );
			for (Jugador jugador : mapas.get(equipo)) {
				System.out.println("\tNombre: " + jugador.getNombre());
				System.out.println("\tPosicion: " + jugador.getPosicion());
				System.out.println("\tEdad: " + jugador.getEdad());
			}
			
		}
		
	}
	
	public Map<Equipo,List<Jugador>> crearEquipos() {	
		Equipo equipo1=new Equipo("Alianza Lima",10,10);
		Equipo equipo2=new Equipo("Universitario",9,9);
		Equipo equipo3=new Equipo("Sporting Cristal",8,8);
		
		Jugador jugador1=new Jugador("Alvaro","delantero",20);
		Jugador jugador2=new Jugador("Jose","delantero",20);
		Jugador jugador3=new Jugador("Juan","delantero",20);
		Jugador jugador4=new Jugador("Luis","delantero",20);
		List<Jugador> jugadores1=Arrays.asList(jugador1,jugador2,jugador3,jugador4);
		Jugador jugador5=new Jugador("Herrera","delantero",20);
		Jugador jugador6=new Jugador("Carlos","delantero",20);
		Jugador jugador7=new Jugador("Rodrigo","delantero",20);
		Jugador jugador8=new Jugador("Daniel","delantero",20);
		List<Jugador> jugadores2=Arrays.asList(jugador5,jugador6,jugador7,jugador8);
		Jugador jugador9=new Jugador("Alberto","delantero",20);
		Jugador jugador10=new Jugador("Pedro","delantero",20);
		Jugador jugador11=new Jugador("Antonio","delantero",20);
		Jugador jugador12=new Jugador("Seebbastian","delantero",20);
		List<Jugador> jugadores3=Arrays.asList(jugador9,jugador10,jugador11,jugador12);
		
		Map<Equipo, List<Jugador>> mapas = new HashMap<Equipo,List<Jugador>>();
		
		mapas.put(equipo1, jugadores1);
		mapas.put(equipo2, jugadores2);
		mapas.put(equipo3, jugadores3);
		
		return mapas;
	}
}
