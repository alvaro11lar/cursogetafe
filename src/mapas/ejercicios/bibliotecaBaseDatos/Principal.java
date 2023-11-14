package mapas.ejercicios.bibliotecaBaseDatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mapas.ejercicios.bibliotecaBaseDatos.dao.LibroDAO;
import mapas.ejercicios.bibliotecaBaseDatos.entities.Biblioteca;
import mapas.ejercicios.bibliotecaBaseDatos.entities.Direccion;
import mapas.ejercicios.bibliotecaBaseDatos.entities.UtilsDataBase;
import utils.Utilidades;

public class Principal {

	public static void main(String[] args) {
		Principal p = new Principal();		
		Biblioteca biblioteca = p.pintarBiblioteca(p.menuBibliotecas());
		p.pintarLibros(biblioteca);
	}

	List<Biblioteca>  menuBibliotecas() {
		try {
			Connection connection =  UtilsDataBase.getInstance();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT TB.ID, TB.NOMBRE,TD.CALLE,TD.POBLACION \r\n"
					+ "FROM TB_BIBLIOTECA AS TB\r\n"
					+ "INNER JOIN TB_DIRECCION AS TD\r\n"
					+ "ON TB.FK_DIRECCION=TD.ID;");
			List<Biblioteca> bibliotecas= new ArrayList<Biblioteca>();
			while(rs.next()) {	
				Direccion direccion = new Direccion(rs.getString("TD.CALLE"),rs.getString("TD.POBLACION"));
				bibliotecas.add(new Biblioteca(rs.getInt("TB.ID"),rs.getString("TB.NOMBRE"),direccion));
			}
			return bibliotecas;
		} catch (SQLException e) {
			// TODO Auto-generated catch block00
			e.printStackTrace();
		}
		return null;

	}


	Biblioteca pintarBiblioteca(List<Biblioteca> biblioteccas) {

		System.out.println("    NOMBRES     CALLE     POBLCION");
		for(int i=0;i<biblioteccas.size();i++) {
			System.out.println((i+1)+". " + biblioteccas.get(i).getNombre() + "     " + biblioteccas.get(i).getDireccion().getCalle() + "     " + biblioteccas.get(i).getDireccion().getPoblacion());
		}

		int opcion = Utilidades.pideDatoNumerico((biblioteccas.size()+1)+ " Salir" +  "\nSeleccione una biblioteca");


		return biblioteccas.get(opcion-1);
	}

	void pintarLibros(Biblioteca biblioteca) {

		String menuLibros="1. Mostrar Info \n2. Mostrar libros \n3. Buscar libro \n4.Insertaar libro \n5. Modificar libro \n6.Borrar libro \n7. volver";
		int opcion=0;
		try {
			do {
				System.out.println(menuLibros);
				opcion= Utilidades.pideDatoNumerico("Ingrese una opcion: ");
				LibroDAO libro = new LibroDAO();
				switch(opcion) {
				case 1: libro.mostrarInfo(biblioteca);break;
				case 2: libro.leerCatalogo(biblioteca);break;
				case 3: libro.buscarLibroTitulo( biblioteca);break;
				case 4: libro.aniadirLibro( biblioteca);break;
				case 5: libro.modificarLibro( biblioteca);break;
				case 6: libro.borrarLibro(biblioteca);break;
				}
			}while(opcion!=7);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
